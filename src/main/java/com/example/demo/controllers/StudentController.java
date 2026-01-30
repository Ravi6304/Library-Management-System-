package com.example.demo.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entites.Student;
import com.example.demo.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService sservice;

    @PostMapping 
    public Student saveStudent(@RequestBody Student student) {
        return sservice.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return sservice.getAll();
    }
}
