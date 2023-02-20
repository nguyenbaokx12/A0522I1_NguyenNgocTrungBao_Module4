package com.example.restfulintegrationforblogapplication.service;



import com.example.restfulintegrationforblogapplication.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Page<Category> findAll(Pageable pageable);
    Category findById(Integer id);
    void save(Category category);
    void remove(Integer id);
    void remove(Category category);
}
