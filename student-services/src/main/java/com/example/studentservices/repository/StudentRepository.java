package com.example.studentservices.repository;

import com.example.studentservices.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository      // purpose of repository is for DB connection
public interface StudentRepository extends MongoRepository<Student, String> {
}
