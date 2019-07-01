package com.app.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;

@ControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {
 
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorMessage> somethingWentWrong(Exception ex) {
        ErrorMessage res = new ErrorMessage(ex.getMessage(), "Something went wrong");
        return new ResponseEntity<>(res, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @ExceptionHandler(MismatchedInputException.class)
    public final ResponseEntity<ErrorMessage> somethingWentWron(Exception ex) {
        ErrorMessage res = new ErrorMessage(ex.getMessage(), "Something went wrong");
        return new ResponseEntity<>(res, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}

class ErrorMessage{
	
	private String message;
	private String detail;
	
	public ErrorMessage(String message, String detail) {
		this.message = message;
		this.detail = detail;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}