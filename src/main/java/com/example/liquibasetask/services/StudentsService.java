package com.example.liquibasetask.services;

import com.example.liquibasetask.entities.Student;

import java.util.List;

public interface StudentsService {
    List<Student> getAll();

    Student getById(Integer id);

    Student save(Student student);

    void delete(Integer id);

    long count();
}
