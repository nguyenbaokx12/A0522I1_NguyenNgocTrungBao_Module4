package com.example.ajaxintegrationforblogapplication.controller;


import com.example.ajaxintegrationforblogapplication.model.Blog;
import com.example.ajaxintegrationforblogapplication.model.Category;
import com.example.ajaxintegrationforblogapplication.service.BlogService;
import com.example.ajaxintegrationforblogapplication.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class BlogApi {


    @Autowired
    CategoryService categoryService;

    @Autowired
    BlogService blogService;

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public ResponseEntity<List<Category>> listAllCategory(){
        List<Category> categoryList = categoryService.findAll();
        if(categoryList.isEmpty()){
            return new ResponseEntity<List<Category>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Category>>(categoryList,HttpStatus.OK);
    }

    @RequestMapping(value = "/blogs", method = RequestMethod.GET)
    public ResponseEntity<List<Blog>> listAllBlog(){
        List<Blog> blogList = blogService.findAll();
        if(blogList.isEmpty()){
            return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Blog>>(blogList,HttpStatus.OK);
    }

    @RequestMapping(value = "/blogs/category/{id}", method = RequestMethod.GET)
    public ResponseEntity<List<Blog>> listAllBlogWithCategory(@PathVariable("id") Integer id){
        List<Blog> blogList = blogService.findAllByCategory_Id(id);
        if(blogList.isEmpty()){
            return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Blog>>(blogList,HttpStatus.OK);
    }

    @RequestMapping(value = "/blogs/{id}", method = RequestMethod.GET)
    public ResponseEntity<Blog> findBlog(@PathVariable("id") Integer id){
        Blog blog = blogService.findById(id);
        if(blog==null){
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Blog>(blog,HttpStatus.OK);
    }

    @RequestMapping(value = "/blogs/search", produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.GET)
    @ResponseBody
    public List<Blog> searchBlogByTitle(@RequestParam(name = "title") String title){
        return blogService.searchByTitle(title);
    }

    @RequestMapping(value = "/blogs/page/{num}", produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.GET)
    @ResponseBody
    public List<Blog> showListBlogPages(Model model, @PathVariable("num") Integer pageNumber){
        return blogService.findAll(PageRequest.of(pageNumber, 2, Sort.by(Sort.Direction.ASC, "id"))).getContent();
    }
}
