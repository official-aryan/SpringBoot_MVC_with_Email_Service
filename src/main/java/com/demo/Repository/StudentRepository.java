package com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.demo.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
