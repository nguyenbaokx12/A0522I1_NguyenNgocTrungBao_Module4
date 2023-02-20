package com.example.restfulintegrationforblogapplication.repository;


import com.example.restfulintegrationforblogapplication.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositories extends JpaRepository<Category, Integer> {
}
