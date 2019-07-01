package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.app.service.LecturerService;

import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DeleteLecturerController {
	
	@Autowired(required=true)
	private LecturerService lecturerService;
	
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/lecturer/{regdNum}")
	
	@ResponseBody
	public String deleteLecturerRecord(@PathVariable("regdNum") int regdNum) {
		   
	    return lecturerService.deleteLecturer(regdNum);
	}
}
