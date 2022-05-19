package com.bnta.teacher_project.repositories;

import com.bnta.teacher_project.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    List<Teacher> findTeacherBySubject(String subject);
}
