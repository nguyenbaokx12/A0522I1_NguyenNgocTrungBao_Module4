package com.example.expandblogapplication.controller;

import com.example.expandblogapplication.model.Category;
import com.example.expandblogapplication.service.IBlogService;
import com.example.expandblogapplication.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class CategoryController {
    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICategoryService iCategoryService;


    @ModelAttribute("Categorys")
    public Iterable<Category> provinces(){
        return iCategoryService.findAll();
    }
}
