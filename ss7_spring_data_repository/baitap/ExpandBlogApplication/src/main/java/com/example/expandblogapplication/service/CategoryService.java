package com.example.expandblogapplication.service;

import com.example.expandblogapplication.model.Category;
import com.example.expandblogapplication.repository.ICategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepo iCategoryRepo;

    @Override
    public List<Category> findAll() {
        return iCategoryRepo.findAll();
    }
}
