package com.bnta.teacher_project.repositories;

import com.bnta.teacher_project.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
