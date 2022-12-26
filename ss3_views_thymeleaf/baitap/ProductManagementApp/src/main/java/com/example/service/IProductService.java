package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void addNew(Product product);
    void delete(int id) throws Exception;
    void update(Product product);
    Product findById(int id) throws Exception;
    List<Product> findByName(String nameSearch);
}
