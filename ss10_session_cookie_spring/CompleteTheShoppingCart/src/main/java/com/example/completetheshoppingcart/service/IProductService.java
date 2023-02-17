package com.example.completetheshoppingcart.service;

import com.example.completetheshoppingcart.model.Product;

import java.util.Optional;


public interface IProductService {
    Iterable<Product> getAll();

    Optional<Product> getById(Long id);
}
