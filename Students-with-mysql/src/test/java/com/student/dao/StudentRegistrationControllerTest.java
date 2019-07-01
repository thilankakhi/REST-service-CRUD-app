package com.student.dao;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.app.controller.RegistorStudentController;
import com.app.dao.Student;
import com.app.service.StudentService;

import org.springframework.http.MediaType;

@RunWith(SpringRunner.class)
@WebMvcTest(value = RegistorStudentController.class, secure = false)

public class StudentRegistrationControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private StudentService studentService;
	
	String exampleStudentJson = "{\"id\":\"1\",\"name\":\"kamal\",\"age\":\"6\",\"grade\":\"1\",\"dateOfBirth\":\"2013-01-01\"}";
	
	String expectedJson = "{\"name\": \"kamal\",\"age\": 6,\"registrationStatus\": \"Registration successfull\",\"registrationNumber\": 1 }";
	
	@Test
	public void registerStudentTest() throws Exception {
				
		Mockito.when(
				studentService.add(Mockito.any(Student.class))).thenReturn("Registration successfull");
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.post("/add/student")
				.accept(MediaType.APPLICATION_JSON).content(exampleStudentJson)
				.contentType(MediaType.APPLICATION_JSON);
		
		//MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		//MockHttpServletResponse response = result.getResponse();
		
		//assertEquals(HttpStatus.OK.value(), response.getStatus());
		mockMvc.perform(requestBuilder).andExpect(status().isOk())
		.andExpect(content().json(expectedJson));
		
	}
}
