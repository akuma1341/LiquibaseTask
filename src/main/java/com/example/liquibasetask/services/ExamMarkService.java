package com.example.liquibasetask.services;

import com.example.liquibasetask.entities.ExamMark;

import java.util.List;

public interface ExamMarkService {
    List<ExamMark> getAll();

    ExamMark getById(Integer id);

    ExamMark save(ExamMark examMark);

    void delete(Integer id);

    long count();
}
