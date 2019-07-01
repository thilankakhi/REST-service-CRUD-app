package com.app.dao;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	@Column(nullable = false)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private int age;
	@Column(nullable = false)
	private int grade;
	@Column(nullable = false)
	private Date date_of_birth;
    
    @ManyToOne
    @JoinColumn(name = "lecId")
    private Lecturer lecturer;
    
  
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public int getAge() {
    	return age;
    }
    public void setAge(int age) {
    	this.age = age;
    }
    public void setGrade(int grade) {
    	this.grade = grade;
    }
    public int getGrade() {
    	return grade;
    }
    public void setDateOfBirth(Date dateOfBirth) {
    	this.date_of_birth = dateOfBirth;
    }
    public Date getDateOfBirth() {
    	return date_of_birth;
    }
    public int getID() {
    	return id;
    }
    public void setID(int id) {
    	this.id = id;
    }
    public Lecturer getLecturer() {
    	return lecturer;
    }
    public void setLecturer(Lecturer lecturer) {
    	this.lecturer = lecturer;
    }
}