package com.example.liquibasetask.repositories;

import com.example.liquibasetask.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Student, Integer> {
}
