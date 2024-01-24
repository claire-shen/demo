package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@SpringBootApplication
@RestController //allows this class to serve REST endpoints
public class ShenBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShenBootApplication.class, args);
	}
	@GetMapping
	public List<String> hello() {
		return List.of("Hello", "World");
	}
}
