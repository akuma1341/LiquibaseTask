package com.example.liquibasetask.repositories;

import com.example.liquibasetask.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
