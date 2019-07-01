package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.Lecturer;
import com.app.dao.LecturerRepository;

@Service
public class LecturerService {

	@Autowired(required = true)
	private LecturerRepository lecturerRepository;
	
	//Add new lecturer to the database if there is no lecturer with same id
	public String add(Lecturer lec) {
    	if (lecturerRepository.findById(lec.getLecId()).orElse(null) == null) {
    		lecturerRepository.save(lec);
    		return "Registration successfull";
    	}
    	return "The lecturer id is already used";
    }
    
	//Update lecturer that already exists in the database
    public String updateLecturer(Lecturer lec) {
    	
    	if (lecturerRepository.findById(lec.getLecId()).orElse(null) == null) {
    		return "No such lecturer";
    	}
    	else {
    		lecturerRepository.save(lec);
	    	return "Update successful";
    	}
    }
    
    //Delete lecturer that already added to the database
	public String deleteLecturer(int id) {
		
		if (lecturerRepository.findById(id).orElse(null) == null) {
    		return "No such lecturer";
    	}
    	else {
    		lecturerRepository.deleteById(id);
    		return "delete successful";
    	}	
	}
	
	//Get all lecturers saved in the database
    public List<Lecturer> getLecturerList() {
    	List<Lecturer> lecturers = new ArrayList<>();
    	lecturerRepository.findAll()
    	.forEach(lecturers::add);
    	return lecturers;
    }
	
}
