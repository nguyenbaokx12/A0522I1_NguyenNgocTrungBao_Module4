package com.example.createblogapplication.service;

import com.example.createblogapplication.model.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAll();
    void save(Blog blog);
    void delete(Blog blog);
    Optional<Blog> getById(Integer id);
}
