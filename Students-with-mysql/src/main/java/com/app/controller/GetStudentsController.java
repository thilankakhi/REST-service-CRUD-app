package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.app.dao.Student;
import com.app.service.StudentService;

@Controller
public class GetStudentsController {
	
	@Autowired
	private StudentService studentService;
	
  @RequestMapping(method = RequestMethod.GET, value="/student")
  @ResponseBody
  public List<Student> getAllStudents() {
	  return studentService.getstudentList();
  }
}