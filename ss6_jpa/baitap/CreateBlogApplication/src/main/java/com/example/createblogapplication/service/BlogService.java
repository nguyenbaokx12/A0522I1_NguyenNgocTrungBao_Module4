package com.example.createblogapplication.service;

import com.example.createblogapplication.model.Blog;
import com.example.createblogapplication.repository.IBlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepo iBlogRepo;

    @Override
    public List<Blog> findAll() {
        return (List<Blog>) iBlogRepo.findAll();
    }

    @Override
    public void save(Blog blog) {
        iBlogRepo.save(blog);
    }

    @Override
    public void delete(Blog blog) {
        iBlogRepo.delete(blog);
    }

    @Override
    public Optional<Blog> getById(Integer id) {
        return iBlogRepo.findById(id);
    }
}
