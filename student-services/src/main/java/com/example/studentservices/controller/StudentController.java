package com.example.studentservices.controller;

import com.example.studentservices.model.Student;
import com.example.studentservices.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
                        // the purpose of the service to write the business logic,before we save into DB
    //Autowiring the service class
    @Autowired
    private StudentService studentService;


    @PostMapping("/save")  // save to the db student information
    public ResponseEntity<?> save(@RequestBody Student student) {

        //For calling save method of service class and store student data which is coming from service class
        Student studentDB = studentService.save(student);

        //creating response object with student data which is coming from service method and http status
        return new ResponseEntity(studentDB, HttpStatus.CREATED);

    }

}
