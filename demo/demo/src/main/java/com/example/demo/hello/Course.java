package com.example.demo.hello;

public class Course {

	String name;
	String teacher;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	
	public Course(String name, String teacher) {
		super();
		this.name = name;
		this.teacher = teacher;
	}
	
	
	
}
