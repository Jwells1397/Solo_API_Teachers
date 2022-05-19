package com.bnta.teacher_project.models;

import javax.persistence.*;

@Entity
@Table (name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
    @Column
    private String subject;

    @ManyToOne
    @JoinColumn(name = "headteacher_id", nullable = false)
    private HeadTeacher headTeacher;

    public Teacher(String name, String subject, HeadTeacher headTeacher) {
        this.name = name;
        this.subject = subject;
        this.headTeacher = headTeacher;
    }

    public Teacher() {}

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public HeadTeacher getHeadTeacher() {
        return headTeacher;
    }

    public void setHeadTeacher(HeadTeacher headTeacher) {
        this.headTeacher = headTeacher;
    }
}
