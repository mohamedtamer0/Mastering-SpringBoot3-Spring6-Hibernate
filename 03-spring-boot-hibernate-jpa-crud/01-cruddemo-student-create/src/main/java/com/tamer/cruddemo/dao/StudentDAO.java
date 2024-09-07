package com.tamer.cruddemo.dao;

import com.tamer.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

}