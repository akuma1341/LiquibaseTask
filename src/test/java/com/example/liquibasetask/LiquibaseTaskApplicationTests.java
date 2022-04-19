package com.example.liquibasetask;

import com.example.liquibasetask.entities.Student;
import com.example.liquibasetask.services.ExamMarkService;
import com.example.liquibasetask.services.StudentsService;
import com.example.liquibasetask.services.SubjectsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LiquibaseTaskApplicationTests {
    @Autowired
    private StudentsService studentsService;
    @Autowired
    private SubjectsService subjectsService;
    @Autowired
    private ExamMarkService examMarkService;

    @Test
    public void studentsRepositoryHave20Records() {
        long recordCount = studentsService.count();

        assertEquals(20, recordCount);
    }

    @Test
    public void studentsRepositoryHave21RecordsAfterInsertingRecord() {
        Student student = new Student();
        student.setFirstName("FirstName");
        student.setLastName("LastName");
        student.setBirthDate(Date.valueOf("2000-12-31"));

        Student savedStudent = studentsService.save(student);

        long recordCount = studentsService.count();

        assertNotNull(savedStudent);
        assertEquals(21, recordCount);
    }

    @Test
    public void subjectRepositoryHave6Records() {
        long recordCount = subjectsService.count();

        assertEquals(6, recordCount);
    }

    @Test
    public void examMarksRepositoryHave87Records() {
        long recordCount = examMarkService.count();

        assertEquals(87, recordCount);
    }
}
