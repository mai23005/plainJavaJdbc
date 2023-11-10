package com.example.demo.hello;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

// Since this is the controller, it is the place where we add our end-points
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class HelloController {

	@Autowired
	private HelloService hs;
	
	// Call as follows:
	// http://localhost:8080/student?name=Gio&age=24&location=Salonica
	@GetMapping(path="/student")
	public Student getStudent(@RequestParam(value="name") String name,
			@RequestParam(value="age") int age,
			@RequestParam(value="location") String location) {
		
		// Dependency Injection, with autowired
		return hs.getStudent(name, age, location);
	} 

	@GetMapping(path="/students")
	public List<Student> getAllStudent()  throws Exception{
		return hs.getAllStudents();
	} 
	
	@GetMapping(path="/addStudent")
	public void addStudent(@RequestParam(value="name") String name,
			@RequestParam(value="age") int age,
			@RequestParam(value="location") String location) throws Exception {
		hs.addStudent(name, age, location);
	}
	
	
	@GetMapping(path="/courses")
	public List<Course> addCourse() throws Exception {
		return hs.getAllCourses();
	}
	
	@GetMapping(path="/addCourse")
	public void addCourse(@RequestParam(value="name") String name,
			@RequestParam(value="teacher") String teacher) throws Exception {
		hs.addCourse(name, teacher);
	}
	
}
