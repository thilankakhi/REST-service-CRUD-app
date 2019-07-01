package com.student.dao;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.dao.Student;
import com.app.dao.StudentRepository;
import com.app.service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Students1ApplicationTests {
	
	@MockBean
	private StudentService studentService;

	@Test
	public void text1() {
		String expected = "nam";
		String real = "nam";
		assertEquals(expected, real);
	}
	@Test
	public void addStudenttest() throws ParseException {
		Student std = new Student();
		std.setID(1);
		std.setAge(6);
		Date date=new SimpleDateFormat("dd-MM-yyyy").parse("2013-01-01");  
		std.setDateOfBirth(date);
		std.setGrade(6);
		std.setName("pamal");
		String real = studentService.add(std);
		String expected = "Registration successfull";
		assertEquals(real, expected);
		
	}

}
