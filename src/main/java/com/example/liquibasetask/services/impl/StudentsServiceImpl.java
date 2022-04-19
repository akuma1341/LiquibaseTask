package com.example.liquibasetask.services.impl;

import com.example.liquibasetask.entities.Student;
import com.example.liquibasetask.repositories.StudentsRepository;
import com.example.liquibasetask.services.StudentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentsServiceImpl implements StudentsService {
    private final StudentsRepository studentsRepository;

    @Override
    public List<Student> getAll() {
        return studentsRepository.findAll();
    }

    @Override
    public Student getById(Integer id) {
        return studentsRepository.getById(id);
    }

    @Override
    public Student save(Student student) {
        return studentsRepository.save(student);
    }

    @Override
    public void delete(Integer id) {
        studentsRepository.deleteById(id);
    }

    @Override
    public long count() {
        return studentsRepository.count();
    }
}
