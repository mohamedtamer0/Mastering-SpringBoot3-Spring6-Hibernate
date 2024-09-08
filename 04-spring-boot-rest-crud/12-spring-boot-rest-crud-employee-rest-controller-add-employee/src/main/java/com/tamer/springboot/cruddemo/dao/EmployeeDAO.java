package com.tamer.springboot.cruddemo.dao;

import com.tamer.springboot.cruddemo.entitiy.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}