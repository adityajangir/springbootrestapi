package com.example.restapijava.controllers;

import java.util.*;
import com.example.restapijava.models.Student;
import com.example.restapijava.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @GetMapping("/allusers")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/saveuser")
    public Student addStudent (@RequestBody Student student) {
        return studentService.addStudent(student);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable String id){
        return studentService.deleteStudent(id);
    }


}
