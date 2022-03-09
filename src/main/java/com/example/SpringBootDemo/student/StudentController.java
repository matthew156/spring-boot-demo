package com.example.SpringBootDemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentController {
    @GetMapping()
    public List<Student> getStudent()
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
}}
