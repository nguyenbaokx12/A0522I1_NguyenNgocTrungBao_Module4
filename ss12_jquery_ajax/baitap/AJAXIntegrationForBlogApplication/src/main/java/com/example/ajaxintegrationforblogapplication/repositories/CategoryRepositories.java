package com.example.ajaxintegrationforblogapplication.repositories;


import com.example.ajaxintegrationforblogapplication.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositories extends JpaRepository<Category, Integer> {
}
