package com.example.casestudy.repository;

import com.example.casestudy.model.Customer.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    boolean add(Customer customer);
    boolean update(int id, Customer customer);
    boolean delete(int customerId);
    List<Customer> search(String name);
}
