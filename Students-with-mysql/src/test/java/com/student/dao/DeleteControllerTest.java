package com.student.dao;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
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

import com.app.controller.DeleteStudentController;
import com.app.service.StudentService;


@RunWith(SpringRunner.class)
@WebMvcTest(value = DeleteStudentController.class, secure = false)

public class DeleteControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private StudentService studentService;
	
	@Test
	public void updateStudentRecordTest() throws Exception {
		
		Mockito.when(
				studentService.deleteStudent(Mockito.anyInt())).thenReturn("delete successful");
		
//		MvcResult result = mockMvc.perform(delete("/delete/student/1")).andReturn();
//		MockHttpServletResponse response = result.getResponse();
//		System.out.println(response);
//		assrtEquals(HttpStatus.OK.value(), response.getStatus());
		
		mockMvc.perform(delete("/delete/student/1")).andExpect(status().isOk())
		.andExpect(content().string("delete successful"));
		
	}

}
