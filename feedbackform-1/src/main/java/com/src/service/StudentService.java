package com.src.service;

import java.util.List;
import java.util.Optional;

import com.src.entity.Student;

public interface StudentService {

    public List < Student > getStudents();

    public void saveStudent(Student theStudent);

    public Optional<Student> getStudent(int theId);

    public void deleteStudent(Student theStudent);

}
