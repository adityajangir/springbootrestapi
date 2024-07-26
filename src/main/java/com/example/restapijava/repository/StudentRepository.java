package com.example.restapijava.repository;

import com.example.restapijava.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository <Student, String>{

}
