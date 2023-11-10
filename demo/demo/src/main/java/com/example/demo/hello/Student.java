package com.example.demo.hello;

import java.util.ArrayList;

public class Student {
	private int id;
	private String name;
	private int age;
	private String location;
	private ArrayList<Course> courses;
	
	public Student(int id, String n, int a, String l) {
		id = id;
		name = n;
		age = a;
		location =l;
	}
	
	public Student(String n, int a, String l) {
		name = n;
		age = a;
		location =l;
	}
	
	
	public String getName() {return name;}
	public int getAge() {return age;}
	public String getLocation() {return location;}
	
	// Remove: Otherwise it would be part of the json
/*	public String getData() {
		return name + "[" + age + "], from: " + location;
	}
*/
}
