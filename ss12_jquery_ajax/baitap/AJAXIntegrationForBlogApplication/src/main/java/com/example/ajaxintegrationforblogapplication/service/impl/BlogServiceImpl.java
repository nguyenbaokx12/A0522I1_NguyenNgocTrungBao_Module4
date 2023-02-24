package com.example.ajaxintegrationforblogapplication.service.impl;


import com.example.ajaxintegrationforblogapplication.model.Blog;
import com.example.ajaxintegrationforblogapplication.repositories.BlogRepositories;
import com.example.ajaxintegrationforblogapplication.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepositories blogRepositories;
    @Override
    public List<Blog> findAll() {
        return blogRepositories.findAll();
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepositories.findAll(pageable);
    }

    @Override
    public Blog findById(Integer id) {
        return blogRepositories.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        blogRepositories.save(blog);
    }

    @Override
    public void remove(Integer id) {
        blogRepositories.deleteById(id);
    }

    @Override
    public void remove(Blog blog) {
        blogRepositories.delete(blog);
    }

    @Override
    public Page<Blog> searchByTitle(String c, Pageable p) {
        return blogRepositories.searchByTitle(c,p);
    }

    @Override
    public List<Blog> searchByTitle(String c) {
        return blogRepositories.searchByTitle(c);
    }

    @Override
    public Page<Blog> findBlogByCategory_Id(Integer id, Pageable pageable) {
        return blogRepositories.findBlogByCategory_Id(id, pageable);
    }

    @Override
    public List<Blog> findAllByCategory_Id(Integer id) {
        return blogRepositories.findAllByCategory_Id(id);
    }
}
