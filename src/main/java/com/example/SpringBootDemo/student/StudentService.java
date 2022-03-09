package com.example.SpringBootDemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
//This has to be a spring bean because of autowired in the student controller, that is why we have the service annotation
@Service
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
