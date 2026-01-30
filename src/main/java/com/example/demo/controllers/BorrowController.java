package com.example.demo.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entites.Borrow;
import com.example.demo.services.BorrowService;


@RestController
@RequestMapping("/borrow")
public class BorrowController {

    @Autowired
    private BorrowService bservice;

    @PostMapping
    public Borrow borrowBook(@RequestBody Borrow borrow) {
        return bservice.saveBorrow(borrow);
    }

    @PutMapping("/return/{id}")
    public Borrow returnBook(@PathVariable Long id) {
        return bservice.returnBook(id);
    }

    @GetMapping
    public List<Borrow> getAllBorrowRecords() {
        return bservice.getAll();
    }
}

