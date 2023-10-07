package com.springboot.app.model;

public class Student {
	
	private String firstName;
	private String lastName;
	
	public Student(String f, String l) {
		this.firstName = f;
		this.lastName = l ;
	}
	
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}
	
	public void setFistName(String f) {
		this.firstName = f;
	}
	
	public void setLastName(String l) {
		this.lastName = l;
	}
}
