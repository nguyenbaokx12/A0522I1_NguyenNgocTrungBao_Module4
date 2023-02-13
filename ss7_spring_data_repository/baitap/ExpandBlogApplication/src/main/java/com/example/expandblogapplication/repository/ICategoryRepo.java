package com.example.expandblogapplication.repository;

import com.example.expandblogapplication.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepo extends JpaRepository<Category,Long> {
}
