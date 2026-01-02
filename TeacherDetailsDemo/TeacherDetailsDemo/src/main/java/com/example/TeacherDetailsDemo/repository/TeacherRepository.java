package com.example.TeacherDetailsDemo.repository;

import com.example.TeacherDetailsDemo.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository <Teacher, Long>{
    Teacher findByid(Long id);
    Teacher deleteByid(Long id);
}
