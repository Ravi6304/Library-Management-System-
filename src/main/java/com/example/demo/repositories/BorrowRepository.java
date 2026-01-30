package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.Borrow;

public interface BorrowRepository extends JpaRepository<Borrow, Long> {}
