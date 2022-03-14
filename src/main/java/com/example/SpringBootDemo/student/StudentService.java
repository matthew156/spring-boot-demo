package com.example.SpringBootDemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());

        if(studentByEmail.isPresent())
        {
            throw new IllegalStateException("email taken");
        }
        studentRepository.save(student);
    }
}
