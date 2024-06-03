package com.springbootjwtl3.service;

import com.springbootjwtl3.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    Customer findOne(Long id);

    void save(Customer customer);

    void deleteById(Long id);
}