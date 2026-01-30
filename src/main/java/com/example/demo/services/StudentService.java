package com.example.demo.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Student;
import com.example.demo.repositories.StudentRepository;


@Service
public class StudentService {

    @Autowired
    private StudentRepository srepo;

    public Student saveStudent(Student student) {
        return srepo.save(student);
    }

    public List<Student> getAll() {
        return srepo.findAll();
    }
}
