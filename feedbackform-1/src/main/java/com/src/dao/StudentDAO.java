package com.src.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.src.entity.Student;
@Repository
public interface StudentDAO extends CrudRepository<Student,Integer>{

  
}
