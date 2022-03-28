package com.example.liquibasetask;

import com.example.liquibasetask.entities.Student;
import com.example.liquibasetask.repositories.ExamMarksRepository;
import com.example.liquibasetask.repositories.StudentsRepository;
import com.example.liquibasetask.repositories.SubjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LiquibaseTaskApplicationTests {
    @Autowired
    private StudentsRepository studentsRepository;
    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private ExamMarksRepository examMarksRepository;

    @Test
    public void studentsRepositoryHave20Records() {
        long recordCount = studentsRepository.count();

        assertEquals(20, recordCount);
    }

    @Test
    public void studentsRepositoryHave21RecordsAfterInsertingRecord() {
        Student student = new Student();
        student.setFirstName("FirstName");
        student.setLastName("LastName");
        student.setBirthDate(new Date());

        Student savedStudent = studentsRepository.save(student);

        long recordCount = studentsRepository.count();

        assertNotNull(savedStudent);
        assertEquals(21, recordCount);
    }

    @Test
    public void subjectRepositoryHave6Records() {
        long recordCount = subjectRepository.count();

        assertEquals(6, recordCount);
    }

    @Test
    public void examMarksRepositoryHave87Records() {
        long recordCount = examMarksRepository.count();

        assertEquals(87, recordCount);
    }
}
