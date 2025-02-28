package com.stephenowinoh.Course.service;


import com.stephenowinoh.Course.service.entity.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class CourseServiceApplication {

	@GetMapping("/allCourses")
	public List<Course> viewCourses() {
		return Stream.of(
			new Course("C001", "Python Fundamentals", 149.99),
			new Course("C002", "Advanced Spring Boot", 259.99),
			new Course("C003", "React Development from Scratch", 219.99),
			new Course("C004", "Cloud Computing Essentials", 349.99),
			new Course("C005", "Machine Learning with Python", 399.99),
			new Course("C006", "Building REST APIs with Node.js", 179.99),
			new Course("C007", "Introduction to DevOps Practices", 229.99),
			new Course("C008", "Getting Started with Flutter", 199.99),
			new Course("C009", "Docker and Kubernetes for Beginners", 279.99),
			new Course("C010", "Full Stack Web Development with JavaScript", 309.99)

		).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(CourseServiceApplication.class, args);
	}

}


