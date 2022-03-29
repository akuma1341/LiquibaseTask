package com.example.liquibasetask.services.impl;

import com.example.liquibasetask.entities.Subject;
import com.example.liquibasetask.repositories.SubjectRepository;
import com.example.liquibasetask.services.SubjectsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectsService {
    private final SubjectRepository subjectRepository;

    @Override
    public List<Subject> getAll() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject getById(Integer id) {
        return subjectRepository.getById(id);
    }

    @Override
    public Subject save(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void delete(Integer id) {
        subjectRepository.deleteById(id);
    }

    @Override
    public long count() {
        return subjectRepository.count();
    }
}
