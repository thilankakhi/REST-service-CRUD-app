package com.app.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.dao.Student;
import com.app.dao.StudentRepository;

@Service
public class StudentService {
	
	@Autowired(required = true)
	private StudentRepository studentRepository;

    public StudentService(){
    	
    }
    
    //Add student to the database if not already added
    public String add(Student std) {
    	
    	if (studentRepository.findById(std.getID()).orElse(null) == null) {
    		studentRepository.save(std);
    		return "Registration successfull";
    	}
    	return "The student id is already used";
    }
    
    //Update student that already exists in the database
    public String upDateStudent(Student std) {
    	
    	if (studentRepository.findById(std.getID()).orElse(null) == null) {
    		return "No such student";
    	}
    	else {
	    	studentRepository.save(std);
	    	return "Update successful";
    	}
    }
    
    //Delete Student that already exists in the database
	public String deleteStudent(int id) {
		
		if (studentRepository.findById(id).orElse(null) == null) {
    		return "No such student";
    	}
    	else {
    		studentRepository.deleteById(id);
    		return "delete successful";
    	}	
	}
	
	//Get all students in the database
    public List<Student> getstudentList() {
    	List<Student> students = new ArrayList<>();
    	studentRepository.findAll()
    	.forEach(students::add);
    	return students;
    }
    
    
}
