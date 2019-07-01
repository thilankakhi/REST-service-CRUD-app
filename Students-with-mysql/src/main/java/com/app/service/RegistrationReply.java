package com.app.service;

import java.util.Date;

public class RegistrationReply {
    String name;
    int age;
    int id;
    int grade;
    Date birthday;
    String registrationStatus;
    
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
    public int getRegistrationNumber() {
    	return id;
    }
    public void setID(int id) {
    	this.id = id;
    }
    public String getRegistrationStatus() {
    	return registrationStatus;
    }
    public void setRegistrationStatus(String registrationStatus) {
    	this.registrationStatus = registrationStatus;
    }
}
