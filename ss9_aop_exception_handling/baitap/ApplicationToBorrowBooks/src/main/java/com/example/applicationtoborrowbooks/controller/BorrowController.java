package com.example.applicationtoborrowbooks.controller;

import com.example.applicationtoborrowbooks.service.BookService;
import com.example.applicationtoborrowbooks.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BorrowController {

    @Autowired
    BookService bookService;

    @Autowired
    CodeService codeService;

    @GetMapping("/view")
    public String viewBorrow(Model model){
        model.addAttribute("listCodeBorrow",codeService.findAll());
        return "code/viewCodeBorrow";
    }

    @GetMapping("/borrow/delete/{id}")
    public String deleteBorrow(@PathVariable("id") Integer id){
        codeService.delete(id);
        return "redirect:/view";
    }

}