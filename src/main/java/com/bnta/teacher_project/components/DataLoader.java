package com.bnta.teacher_project.components;

import com.bnta.teacher_project.models.HeadTeacher;
import com.bnta.teacher_project.models.Teacher;
import com.bnta.teacher_project.repositories.HeadTeacherRepository;
import com.bnta.teacher_project.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    HeadTeacherRepository headTeacherRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        HeadTeacher headTeacher1 = new HeadTeacher("Simon");
        headTeacherRepository.save(headTeacher1);

        Teacher teacher1= new Teacher("Jane", "Maths", headTeacher1);
        teacherRepository.save(teacher1);

        HeadTeacher headTeacher2 = new HeadTeacher("Olivia");
        headTeacherRepository.save(headTeacher2);

        Teacher teacher2 = new Teacher("Russell", "Physics", headTeacher2);
        teacherRepository.save(teacher2);


        Teacher teacher3 = new Teacher("Daniel", "Geography", headTeacher2 );
        teacherRepository.save(teacher3);


    }
}
