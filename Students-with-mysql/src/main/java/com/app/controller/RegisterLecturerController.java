package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.app.dao.Lecturer;
import com.app.service.LecturerService;

@Controller
public class RegisterLecturerController {
	
	@Autowired
	private LecturerService lecturerService;

	
  @RequestMapping(method = RequestMethod.POST, value="/add/lecturer")
  
  @ResponseBody
  public String registerStudent(@RequestBody Lecturer lecturer) {
                 
       return lecturerService.add(lecturer);
  }
}
