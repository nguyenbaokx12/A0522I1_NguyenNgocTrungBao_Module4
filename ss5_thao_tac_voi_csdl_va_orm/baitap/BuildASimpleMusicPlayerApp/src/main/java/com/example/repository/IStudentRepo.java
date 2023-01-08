package com.example.repository;

import com.example.model.Student;

import java.util.List;

public interface IStudentRepo {
    List<Student> findAll();
    void save(Student student);
}
