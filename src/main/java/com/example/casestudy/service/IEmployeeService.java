package com.example.casestudy.service;

import com.example.casestudy.model.Employee_resort.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    List<Employee> findByName(String firstName, String lastName);
    boolean add(Employee employee);
    boolean update(int id, Employee employee);
    boolean delete(int id);
}
