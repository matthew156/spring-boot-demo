package com.example.SpringBootDemo;

import com.example.SpringBootDemo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@GetMapping("/")
	public List<Student> student()
	{
		return List.of(
				new Student(
						1L,
						"Matt Ward",
						24,
						LocalDate.of(1997, Month.OCTOBER, 5),
						"matthew@matthewsemail.com"

				)
		);
	}
}
