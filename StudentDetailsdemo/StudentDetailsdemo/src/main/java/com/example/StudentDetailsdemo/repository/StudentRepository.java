package com.example.StudentDetailsdemo.repository;

import com.example.StudentDetailsdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findByid(Long id);
}
