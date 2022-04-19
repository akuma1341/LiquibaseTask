package com.example.liquibasetask.controllers;

import com.example.liquibasetask.controllers.dto.StudentsResponseDTO;
import com.example.liquibasetask.services.ExamMarkService;
import com.example.liquibasetask.services.StudentsService;
import com.example.liquibasetask.services.SubjectsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/info")
@RequiredArgsConstructor
public class StudentsRestController {
    private final StudentsService studentsService;
    private final SubjectsService subjectsService;
    private final ExamMarkService examMarkService;

    @GetMapping(value = "/studentsCount", produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentsResponseDTO getStudentsCount() {
        return new StudentsResponseDTO(studentsService.count());
    }

    @GetMapping(value = "/subjectsCount", produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentsResponseDTO getSubjectsCount() {
        return new StudentsResponseDTO(subjectsService.count());
    }

    @GetMapping(value = "/examMarksCount", produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentsResponseDTO getExamMarksCount() {
        return new StudentsResponseDTO(examMarkService.count());
    }
}
