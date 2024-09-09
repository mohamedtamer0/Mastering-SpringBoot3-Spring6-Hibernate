package com.tamer.springboot.cruddemo.dao;

import com.tamer.springboot.cruddemo.entitiy.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

}