package com.example.repository;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo implements IProductRepo {
    private static  List<Product> list;

    static {
        list = new ArrayList<>();
        list.add(new Product(1, "iPhone 11 Pro Max", 130000.0, "Pretty", "Apple"));
        list.add(new Product(2, "SamSung J4", 50000.0, "Strong", "SamSung"));
        list.add(new Product(3, "Oppo A34", 5100.0, "Bad", "China"));
        list.add(new Product(4, "Xiaomi ", 6100.0, "Bad", "China"));
        list.add(new Product(5, "iPhone 14 Pro Max", 310000.0, "Pretty", "Apple"));
    }

    @Override
    public List<Product> findAll() {
        return list;
    }

    @Override
    public void addNew(Product product) {
        list.add(product);
    }

    @Override
    public void delete(int id) throws Exception {
        int index = 0;
        for(Product productD : list){
            if(productD.getId() == id){
                break;
            }
            index++;
        }
        if(index > list.size()){
            throw new Exception("Product Not Found");
        }
        list.remove(index);
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
