package com.example.service;

import com.example.model.Product;
import com.example.repository.IProductRepo;
import com.example.repository.ProductRepo;

import java.util.List;

public class ProductService implements IProductService {
    private static IProductRepo productRepo = new ProductRepo();

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public void addNew(Product product) {
        productRepo.addNew(product);
    }

    @Override
    public void delete(int id) throws Exception {
        productRepo.delete(id);
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public Product findById(int id) throws Exception {
        return null;
    }

    @Override
    public List<Product> findByName(String nameSearch) {
        return null;
    }
}
