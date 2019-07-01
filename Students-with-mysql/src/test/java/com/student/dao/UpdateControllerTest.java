package com.student.dao;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.app.controller.UpdateStudentController;
import com.app.dao.Student;
import com.app.service.StudentService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = UpdateStudentController.class, secure = false)

public class UpdateControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private StudentService studentService;
	
	String exampleStudentJson = "{\"id\":\"1\",\"name\":\"kamal\",\"age\":\"1\",\"grade\":\"1\",\"dateOfBirth\":\"2013-01-01\"}";
	
	@Test
	public void updateStudentRecordTest() throws Exception {
		
		Mockito.when(
				studentService.upDateStudent(Mockito.any(Student.class))).thenReturn("Update successful");
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.put("/update/student")
				.accept(MediaType.APPLICATION_JSON).content(exampleStudentJson)
				.contentType(MediaType.APPLICATION_JSON);
		
//		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//		MockHttpServletResponse response = result.getResponse();
//		
//		assertEquals(HttpStatus.OK.value(), response.getStatus());
		
		mockMvc.perform(requestBuilder).andExpect(status().isOk())
		.andExpect(content().string("Update successful"));
		
	}

}
