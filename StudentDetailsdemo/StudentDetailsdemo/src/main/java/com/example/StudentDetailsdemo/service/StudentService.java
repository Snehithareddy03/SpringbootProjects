package com.example.StudentDetailsdemo.service;

import com.example.StudentDetailsdemo.dto.StudentDto;
import com.example.StudentDetailsdemo.entity.Student;

public interface StudentService {
    StudentDto createStudent(StudentDto studentdto);
    Student getStudent(Long id);
    StudentDto updateStudent(Long id ,StudentDto studentdto);
    void deleteStudent(Long id);
}
