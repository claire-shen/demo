package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.time.LocalDate;
import com.example.demo.student.StudentService;

//This class has all the resources for our API
@RestController
@RequestMapping(path = "api/v1/student") //now this will go to localhost:8080/api/v1/student
public class StudentController {
	private final StudentService studentService; //reference to student service
	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping //This is an endpoint that returns an array of students
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
}
