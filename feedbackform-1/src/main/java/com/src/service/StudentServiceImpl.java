package com.src.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.StudentDAO;
import com.src.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public List < Student > getStudents() {
        return (List<Student>) studentDAO.findAll();
    }

    @Override
    @Transactional
    public void saveStudent(Student theStudent) {
        studentDAO.save(theStudent);
    }

    @Override
    @Transactional
    public Optional<Student> getStudent(int theId) {
        return studentDAO.findById(theId);
    }

    @Override
    @Transactional
    public void deleteStudent(Student theStudent) {
        studentDAO.delete(theStudent);
    }
}
