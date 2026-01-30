package com.example.demo.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Book;
import com.example.demo.repositories.BookRepository;


@Service
public class BookService {

    @Autowired
    private BookRepository brepo;

    public Book saveBook(Book book) {
        return brepo.save(book);
    }

    public List<Book> getAll() {
        return brepo.findAll();
    }
}
