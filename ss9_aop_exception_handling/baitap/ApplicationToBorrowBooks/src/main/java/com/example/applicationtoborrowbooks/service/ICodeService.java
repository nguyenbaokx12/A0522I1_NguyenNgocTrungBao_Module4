package com.example.applicationtoborrowbooks.service;


import com.example.applicationtoborrowbooks.model.Book;
import com.example.applicationtoborrowbooks.model.Code;

import java.util.List;

public interface ICodeService {
    List<Code> findAll();
    Code findById(Integer id);

    void save(Code code);

    void delete(Integer id);

    List<Code> findAllCodeByBookId(Integer id);

    List<Code> findAvailableCodeByBookId(Integer id);

    List<Code> findUsedCodeByBookId(Integer id);

    void returnBookByCode(Book book, Integer returnCode);
}