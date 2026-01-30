package com.example.demo.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entites.IssueRecord;
import com.example.demo.services.IssueService;


@RestController
@RequestMapping("/issues")
public class IssueController {

    @Autowired
    private IssueService iservice;

    @PostMapping
    public IssueRecord saveIssue(@RequestBody IssueRecord issue) {
        return iservice.saveIssue(issue);
    }

    @GetMapping
    public List<IssueRecord> getAllIssues() {
        return iservice.getAll();
    }
}

