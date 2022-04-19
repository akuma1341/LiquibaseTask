package com.example.liquibasetask.repositories;

import com.example.liquibasetask.entities.ExamMark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamMarksRepository extends JpaRepository<ExamMark, Integer> {
}
