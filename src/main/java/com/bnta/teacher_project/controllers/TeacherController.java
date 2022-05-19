package com.bnta.teacher_project.controllers;

import com.bnta.teacher_project.models.Teacher;
import com.bnta.teacher_project.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("teachers") //localhost:8080/teachers
public class TeacherController {

    @Autowired
    TeacherRepository teacherRepository;

    //index
    //handles
    //GET /pets
    // GET /pets?type=dog
    @GetMapping
    public ResponseEntity<List<Teacher>> getAllTeachersAndFilters(
            @RequestParam(required = false, name = "subject") String subject
    ){
        if(subject != null){
            return new ResponseEntity<>(teacherRepository.
                    findTeacherBySubject(subject), HttpStatus.OK);
        }
        return new ResponseEntity<>(teacherRepository.findAll(), HttpStatus.OK);
    }


    //show
    @GetMapping(value = "/{id}") //localhost:8080/pets/1
    public ResponseEntity<Optional<Teacher>> getTeacher(@PathVariable Long id){
        return new ResponseEntity<>(teacherRepository.findById(id), HttpStatus.OK);
    }

    //Post
    @PostMapping //POST localhost:8080/pets
    public ResponseEntity<Teacher> createPet(@RequestBody Teacher newTeacher){
        teacherRepository.save(newTeacher);
        return new ResponseEntity<>(newTeacher, HttpStatus.CREATED);
    }
}
