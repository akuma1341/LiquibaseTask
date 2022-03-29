package com.example.liquibasetask.services.impl;

import com.example.liquibasetask.entities.ExamMark;
import com.example.liquibasetask.repositories.ExamMarksRepository;
import com.example.liquibasetask.services.ExamMarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamMarkServiceImpl implements ExamMarkService {
    private final ExamMarksRepository examMarksRepository;

    @Override
    public List<ExamMark> getAll() {
        return examMarksRepository.findAll();
    }

    @Override
    public ExamMark getById(Integer id) {
        return examMarksRepository.getById(id);
    }

    @Override
    public ExamMark save(ExamMark examMark) {
        return examMarksRepository.save(examMark);
    }

    @Override
    public void delete(Integer id) {
        examMarksRepository.deleteById(id);
    }

    @Override
    public long count() {
        return examMarksRepository.count();
    }
}
