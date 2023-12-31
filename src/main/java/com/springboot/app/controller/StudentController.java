package com.springboot.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.model.Student;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Karim", "Ouazzou");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("FN1", "FN1"));
		students.add(new Student("FN2", "FN2"));
		students.add(new Student("FN3", "FN3"));
		
		return students;
	}
	
	@GetMapping("/student/{fn}/{ln}")
	public Student getDynamicStudent(@PathVariable("fn") String firstName,@PathVariable("ln") String lastName) {
		return new Student(firstName,lastName);
	}
	
	@GetMapping("/student/query")
	public Student studentQueryParam(@RequestParam(name="fn") String firstName,@RequestParam(name="ln") String lastName) {
		return new Student(firstName,lastName);
	}
}
