package com.example.applicationtoborrowbooks.service;

import com.example.applicationtoborrowbooks.model.Book;
import com.example.applicationtoborrowbooks.model.Code;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
    void save(Book book);
    void delete(Integer id);
    void borrow(Book book, Integer usedCode);
    void returnBook(Book book, Integer returnCode);
    Book findById(Integer id);
    Code getNextAvailableCode(Book book);
}
