package com.example.demo.services;



import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.IssueRecord;
import com.example.demo.repositories.IssueRecordRepository;


@Service
public class IssueService {

    @Autowired
    private IssueRecordRepository irepo;

    public IssueRecord saveIssue(IssueRecord issue) {
        issue.setIssueDate(LocalDate.now());
        return irepo.save(issue);
    }

    public List<IssueRecord> getAll() {
        return irepo.findAll();
    }
}

