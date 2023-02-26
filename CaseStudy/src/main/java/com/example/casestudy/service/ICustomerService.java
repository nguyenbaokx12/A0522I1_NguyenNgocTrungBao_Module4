package com.example.casestudy.service;

import com.example.casestudy.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;


public interface ICustomerService {
//    Page<Customer> findAll(Pageable pageable);

    void remote(Long id);

    void addCustomer(Customer customer);

    Page<Customer> find( String name, String typeId, Pageable pagle);

    List<Customer> getAll();

    Customer findId(Long id);

    void edit(Customer customer);
}

