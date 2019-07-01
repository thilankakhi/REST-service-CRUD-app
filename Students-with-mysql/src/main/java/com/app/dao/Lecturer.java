package com.app.dao;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Lecturer")
public class Lecturer {

	@Id
	@Column(nullable = false)
	private int lecId;
	@Column(nullable = false)
	private String lecName;
	@Column(nullable = false)
	private String subject;
	
	@OneToMany(mappedBy = "lecturer", cascade = CascadeType.ALL)
	@Column(nullable = false)
    private Set<Student> students;
	
	
	public int getLecId() {
		return lecId;
	}
	public void setLecId(int lecId) {
		this.lecId = lecId;
	}
	public String getLecName() {
		return lecName;
	}
	public void setLecName(String lecName) {
		this.lecName = lecName;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
