package com.tamer.springboot.cruddemo.service;

import com.tamer.springboot.cruddemo.entitiy.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

}