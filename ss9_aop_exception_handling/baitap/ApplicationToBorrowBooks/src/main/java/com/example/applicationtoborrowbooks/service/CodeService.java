package com.example.applicationtoborrowbooks.service;

import com.example.applicationtoborrowbooks.model.Book;
import com.example.applicationtoborrowbooks.model.Code;
import com.example.applicationtoborrowbooks.repository.BookRepo;
import com.example.applicationtoborrowbooks.repository.CodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeService implements ICodeService {

    @Autowired
    CodeRepo codeRepo;

    @Autowired
    BookRepo bookRepo;

    @Override
    public List<Code> findAll() {
        return codeRepo.findAll();
    }

    @Override
    public Code findById(Integer id) {
        return codeRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Code code) {
        codeRepo.save(code);
    }

    @Override
    public void delete(Integer id) {
        Code code = codeRepo.findById(id).orElse(null);
        Book book = bookRepo.findById(code.getBook().getId()).orElse(null);
        book.setQuantity(book.getQuantity()-1);
        codeRepo.deleteById(id);
        bookRepo.save(book);
    }

    @Override
    public List<Code> findAllCodeByBookId(Integer id) {
        return codeRepo.findCodeByBook_Id(id);
    }

    @Override
    public List<Code> findAvailableCodeByBookId(Integer id) {
        return codeRepo.findCodeByBook_IdAndStatus_Id(id,1);
    }

    @Override
    public List<Code> findUsedCodeByBookId(Integer id) {
        return codeRepo.findCodeByBook_IdAndStatus_Id(id,2);
    }

    @Override
    public void returnBookByCode(Book book, Integer returnCode) {

    }
}