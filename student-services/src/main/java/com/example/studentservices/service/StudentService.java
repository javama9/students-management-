package com.example.studentservices.service;

import com.example.studentservices.model.Student;
import com.example.studentservices.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service                   // the purpose of the service layer is to implement the business logic
public class StudentService {

    @Autowired  //  to get the reference of the Student repository class
    private StudentRepository studentRepository;

    public Student save(Student student){
        return studentRepository.save(student);
    }




}
