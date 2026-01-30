package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
}

