package com.example.SpringBootDemo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
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
    }
}
