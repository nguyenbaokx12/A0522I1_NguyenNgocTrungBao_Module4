package com.example.expandblogapplication.repository;

import com.example.expandblogapplication.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepo extends JpaRepository<Blog,Long> {
    Page<Blog> findByCategoryId(Long aLong, Pageable pageable);
    Page<Blog> findByNameContaining(String s, Pageable pageable);
}
