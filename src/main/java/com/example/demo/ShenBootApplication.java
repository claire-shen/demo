package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.time.LocalDate;


@SpringBootApplication
public class ShenBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShenBootApplication.class, args);
	}
//	@GetMapping //This is an endpoint that returns an array of students
//	public List<Student> hello() {
//		return List.of(
//				new Student(
//						1L,
//						"Claire",
//						"claire.shen@gmail.com",
//						LocalDate.of(2003, 05, 05),
//						20)
//		); // this class will get converted to a JSON object on local host
//	}
}
