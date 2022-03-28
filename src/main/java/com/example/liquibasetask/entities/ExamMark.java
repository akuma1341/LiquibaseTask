package com.example.liquibasetask.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "exam_marks")
@Getter
@Setter
public class ExamMark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_student")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "id_subject")
    private Subject subject;
    @Column(name = "mark")
    private Integer mark;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamMark examMark = (ExamMark) o;
        return Objects.equals(id, examMark.id) && Objects.equals(student, examMark.student) && Objects.equals(subject, examMark.subject) && Objects.equals(mark, examMark.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, student, subject, mark);
    }

    @Override
    public String toString() {
        return "ExamMark{" +
                "id=" + id +
                ", student=" + student +
                ", subject=" + subject +
                ", mark=" + mark +
                '}';
    }
}
