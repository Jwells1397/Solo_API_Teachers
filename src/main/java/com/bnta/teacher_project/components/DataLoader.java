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

        Pet pet2 = new Pet("Ella", "Turtle", vet1);
        petRepository.save(pet2);

        Vet vet2 = new Vet("Joe");
        vetRepository.save(vet2);

        Pet pet3 = new Pet("Mabel", "Dog", vet2 );
        petRepository.save(pet3);



    }
}
