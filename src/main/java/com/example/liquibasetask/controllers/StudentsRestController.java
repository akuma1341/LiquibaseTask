package com.example.liquibasetask.controllers;

import com.example.liquibasetask.controllers.dto.StudentsResponseDTO;
import com.example.liquibasetask.repositories.ExamMarksRepository;
import com.example.liquibasetask.repositories.StudentsRepository;
import com.example.liquibasetask.repositories.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/info")
@RequiredArgsConstructor
public class StudentsRestController {
    private final StudentsRepository studentsRepository;
    private final SubjectRepository subjectRepository;
    private final ExamMarksRepository examMarksRepository;

    @GetMapping(value = "/studentsCount", produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentsResponseDTO getStudentsCount() {
        return new StudentsResponseDTO(studentsRepository.count());
    }

    @GetMapping(value = "/subjectsCount", produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentsResponseDTO getSubjectsCount() {
        return new StudentsResponseDTO(subjectRepository.count());
    }

    @GetMapping(value = "/examMarksCount", produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentsResponseDTO getExamMarksCount() {
        return new StudentsResponseDTO(examMarksRepository.count());
    }
}
