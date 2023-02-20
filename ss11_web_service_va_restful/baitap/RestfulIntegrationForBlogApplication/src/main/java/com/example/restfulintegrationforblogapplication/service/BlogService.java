package com.example.restfulintegrationforblogapplication.service;

import com.example.restfulintegrationforblogapplication.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    Page<Blog> findAll(Pageable pageable);
    Blog findById(Integer id);
    void save(Blog blog);
    void remove(Integer id);
    void remove(Blog blog);
    Page<Blog> searchByCharacter(String c, Pageable p);
    Page<Blog> findBlogByCategory_Id(Integer id, Pageable p);
    List<Blog> findAllByCategory_Id(Integer id);
}