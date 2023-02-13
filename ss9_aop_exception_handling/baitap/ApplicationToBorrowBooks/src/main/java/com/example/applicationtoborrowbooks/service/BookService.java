package com.example.applicationtoborrowbooks.service;

import com.example.applicationtoborrowbooks.model.Book;
import com.example.applicationtoborrowbooks.model.Code;
import com.example.applicationtoborrowbooks.model.Status;
import com.example.applicationtoborrowbooks.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class BookService implements IBookService {

    @Autowired
    BookRepo bookRepo;

    @Autowired
    CodeService codeService;

    @Override
    public List<Book> findAll() {
        return bookRepo.findAll();
    }

    @Override
    public void save(Book book) {
        bookRepo.save(book);
        Status available = new Status(1);
        for(int i=0; i<book.getQuantity(); i++){
            int n =10000 + new Random().nextInt(90000);
            Code code = new Code(n,bookRepo.findById(book.getId()).orElse(null),available);
            book.generateCode(code);
            codeService.save(code);
        }
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void borrow(Book book, Integer usedCode) {
        List<Code>codeList = codeService.findAllCodeByBookId(book.getId());
        for(Code code : codeList){
            if(code.getCode().equals(usedCode)){
                code.setStatus(new Status(2,"used"));
                break;
            }
        }
        book.borrow();
        bookRepo.save(book);
    }


    @Override
    public void returnBook(Book book, Integer returnCode) {
        List<Code> codeList = codeService.findUsedCodeByBookId(book.getId());
        for(Code code : codeList){
            if(code.getCode().equals(returnCode)){
                code.setStatus(new Status(1,"available"));
                codeService.save(code);
                book.returnBook();
                bookRepo.save(book);
                break;
            }
        }
    }

    @Override
    public Book findById(Integer id) {
        return bookRepo.findById(id).orElse(null);
    }

    @Override
    public Code getNextAvailableCode(Book book) {
        List<Code> codeList = codeService.findAllCodeByBookId(book.getId());
        for(Code code : codeList){
            if(code.getStatus().getId() == 1){
                return code;
            }
        }
        return null;
    }
}