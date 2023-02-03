package com.example.validateregistrationform.service;

import com.example.validateregistrationform.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService  {
    void    save(User user);
    Page<User> findAll(Pageable pageable);
}
