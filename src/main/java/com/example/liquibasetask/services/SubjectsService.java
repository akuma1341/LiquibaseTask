package com.example.liquibasetask.services;

import com.example.liquibasetask.entities.Subject;

import java.util.List;

public interface SubjectsService {
    List<Subject> getAll();

    Subject getById(Integer id);

    Subject save(Subject subject);

    void delete(Integer id);

    long count();
}
