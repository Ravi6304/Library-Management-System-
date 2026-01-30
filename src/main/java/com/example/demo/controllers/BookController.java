package com.example.demo.controllers;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entites.Book;
import com.example.demo.services.BookService;


@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bservice;

    @PostMapping
    public Book saveBook(@RequestBody Book book) {
        return bservice.saveBook(book);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bservice.getAll();
    }
}
