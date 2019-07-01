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
public class UpdateLecturerController {
	
	@Autowired
	private LecturerService lecturerService;
	
	@RequestMapping(method = RequestMethod.PUT, value="/update/lecturer")
	@ResponseBody
	public String updateLecturerRecord(@RequestBody Lecturer lecturer) {
		  
		return lecturerService.updateLecturer(lecturer);
	}
}
