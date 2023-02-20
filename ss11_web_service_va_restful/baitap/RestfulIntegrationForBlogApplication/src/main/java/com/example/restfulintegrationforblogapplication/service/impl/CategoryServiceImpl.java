package com.example.restfulintegrationforblogapplication.service.impl;


import com.example.restfulintegrationforblogapplication.model.Category;
import com.example.restfulintegrationforblogapplication.repository.CategoryRepositories;
import com.example.restfulintegrationforblogapplication.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepositories categoryRepositories;
    @Override
    public List<Category> findAll() {
        return categoryRepositories.findAll();
    }

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return categoryRepositories.findAll(pageable);
    }

    @Override
    public Category findById(Integer id) {
        return categoryRepositories.findById(id).orElse(null);
    }

    @Override
    public void save(Category category) {
        categoryRepositories.save(category);
    }

    @Override
    public void remove(Integer id) {
        categoryRepositories.deleteById(id);
    }

    @Override
    public void remove(Category category) {
        categoryRepositories.delete(category);
    }
}
