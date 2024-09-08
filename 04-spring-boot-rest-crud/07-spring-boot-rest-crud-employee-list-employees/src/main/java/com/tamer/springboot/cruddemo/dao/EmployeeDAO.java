package com.tamer.springboot.cruddemo.dao;

import com.tamer.springboot.cruddemo.entitiy.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}