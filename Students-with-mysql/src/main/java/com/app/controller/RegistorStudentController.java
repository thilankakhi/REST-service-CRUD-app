package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.app.dao.Student;
import com.app.service.StudentService;

@Controller
public class RegistorStudentController {
	
	@Autowired
	private StudentService studentService;
	
	String message;
	
  @RequestMapping(method = RequestMethod.POST, value="/add/student")
  
  @ResponseBody
  public String registerStudent(@RequestBody Student student) {
//		  RegistrationReply regreply = new RegistrationReply();           
//	        message = studentService.add(student);
//	        regreply.setName(student.getName());
//	        regreply.setAge(student.getAge());
//	        regreply.setID(student.getID());
//	        regreply.setRegistrationStatus(message);
	        return studentService.add(student);
	        
  }
  
//  @ExceptionHandler(Exception.class)
//  public ModelAndView handleError(HttpServletRequest req, Exception ex) {
//    //logger.error("Request: " + req.getRequestURL() + " raised " + ex);
//    ModelAndView mav = new ModelAndView();
//    mav.addObject("exception", ex);
//    mav.addObject("url", req.getRequestURL());
//    mav.setViewName("error");
//    return mav;
//  }
}
