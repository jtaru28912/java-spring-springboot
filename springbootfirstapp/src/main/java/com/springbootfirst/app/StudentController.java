package com.springbootfirst.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	//method to ran by the controller
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Priya","Warrier");
	}
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<Student>();	
		//Add new Student Records
		students.add(new Student("Taru","Jain"));
		students.add(new Student("Jiya","Shah"));
		students.add(new Student("Anant","Jain"));
		students.add(new Student("Avani","Shah"));
		students.add(new Student("Ambar","Shah"));
		students.add(new Student("Arihant","Shah"));
		//return the record
		return students;
	}
}
