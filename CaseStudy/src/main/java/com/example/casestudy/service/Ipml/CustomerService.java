package com.example.casestudy.service.Ipml;

import com.example.casestudy.model.Customer;
import com.example.casestudy.repository.ICustomerRepository;
import com.example.casestudy.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;
    @Override
    public void remote(Long id) {
        iCustomerRepository.deleteById(id);
    }

    @Override
    public void addCustomer(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public Page<Customer> find(String name, String typeId, Pageable pagle) {
        return iCustomerRepository.searchCustomer(name,typeId,pagle);
    }

    @Override
    public List<Customer> getAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public Customer findId(Long id) {
        return iCustomerRepository.getById(id);
    }

    @Override
    public void edit(Customer customer) {
        iCustomerRepository.save(customer);
    }
}
