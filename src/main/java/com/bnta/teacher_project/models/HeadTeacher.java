package com.bnta.teacher_project.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "headteachers")
public class HeadTeacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @OneToMany(mappedBy = "headteacher")
    @JsonIgnoreProperties({"headteacher"})
    private List<Teacher> teachers;

    public HeadTeacher(String name) {
        this.name = name;
        this.teachers = new ArrayList<Teacher>();
    }

    public HeadTeacher() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
