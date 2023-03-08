package com.example.finalexam.service;

import com.example.finalexam.model.Promotion;

import java.util.List;
import java.util.Optional;

public interface IPromotionService {
    List<Promotion> findAll();
    void create(Promotion promotion);
    void delete(Integer id);
    Optional<Promotion> findById(Integer id);
    List<Promotion> search(String name);
}
