package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

	@PostMapping
	public void registerNewStudent(@RequestBody Student student) {
		studentService.addNewStudent(student);
	}

	@DeleteMapping(path = "{studentId}")
	public void deleteStudent(@PathVariable("studentId") Long studentId) { // delete by id
		studentService.deleteStudent(studentId);
	}
}


