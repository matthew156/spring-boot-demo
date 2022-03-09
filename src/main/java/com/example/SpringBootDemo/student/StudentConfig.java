package com.example.SpringBootDemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
   @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student matt = new Student(
                    "Matt Ward",
                    24,
                    LocalDate.of(1997, Month.OCTOBER, 5),
                    "matthew@matthewsemail.com"

            );
            Student corwin = new Student(
                    "Corwin Wilcox",
                    24,
                    LocalDate.of(1998, Month.JULY, 16),
                    "corwin@corwinsemail.com"

            );
            repository.saveAll(List.of(matt, corwin));
        };
    }
}
