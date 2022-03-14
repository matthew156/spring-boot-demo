package com.example.SpringBootDemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//This has to be a spring bean because of autowired in the student controller, that is why we have the service annotation
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent()
    {
                return studentRepository.findAll();
    }
    public void addNewStudent(Student student){
        System.out.println(student);
    }
}
