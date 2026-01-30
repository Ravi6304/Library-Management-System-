package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.IssueRecord;

public interface IssueRecordRepository extends JpaRepository<IssueRecord, Long> {}
