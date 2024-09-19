package com.tamer.cruddemo.dao;

import com.tamer.cruddemo.entity.Instructor;
import com.tamer.cruddemo.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

}