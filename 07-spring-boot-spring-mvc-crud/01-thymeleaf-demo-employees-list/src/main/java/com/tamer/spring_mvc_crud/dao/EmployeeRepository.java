package com.tamer.spring_mvc_crud.dao;

import com.tamer.spring_mvc_crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

}