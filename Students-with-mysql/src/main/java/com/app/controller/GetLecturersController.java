package com.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.app.dao.Lecturer;
import com.app.service.LecturerService;

@Controller
public class GetLecturersController {
	
	@Autowired
	private LecturerService lecturerService;
	
  @RequestMapping(method = RequestMethod.GET, value="/lecturer")
  @ResponseBody
  public List<Lecturer> getAllLecturers() {
	  return lecturerService.getLecturerList();
  }
}