package com.example.createblogapplication.repository;

import com.example.createblogapplication.model.Blog;
import org.springframework.data.repository.CrudRepository;

public interface IBlogRepo extends CrudRepository<Blog, Integer> {
}
