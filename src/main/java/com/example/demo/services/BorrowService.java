package com.example.demo.services;



import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Book;
import com.example.demo.entites.Borrow;
import com.example.demo.repositories.BookRepository;
import com.example.demo.repositories.BorrowRepository;

@Service
public class BorrowService {

    @Autowired
    private BorrowRepository brepo;

    @Autowired
    private BookRepository bookrepo;

    public Borrow saveBorrow(Borrow borrow) {

        Long bookId = borrow.getBook().getId();
  
        Book book = bookrepo.findById(bookId)  
                .orElseThrow(() -> new RuntimeException("Book not found"));

        if (book.getQuantity() < borrow.getQuantityTaken()) {
            throw new RuntimeException("Books not available");
        }

        book.setQuantity(book.getQuantity() - borrow.getQuantityTaken());
        bookrepo.save(book);

        borrow.setBook(book);
        borrow.setBorrowDate(LocalDate.now());

        return brepo.save(borrow);
    }

    public Borrow returnBook(Long id) {

        Borrow borrow = brepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Borrow record not found"));

        Book book = borrow.getBook();
        book.setQuantity(book.getQuantity() + borrow.getQuantityTaken());
        bookrepo.save(book);

        borrow.setReturnDate(LocalDate.now());
        return brepo.save(borrow);
    }

    public List<Borrow> getAll() {
        return brepo.findAll();
    }
}
