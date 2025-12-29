package com.example.SpringBootDemo.service;

import com.example.SpringBootDemo.dto.Studentdto;
import com.example.SpringBootDemo.entity.Student;

public interface Studentservice {
    Studentdto savestudent(Studentdto studentdto);
    Student getStudent(Long id);
    Studentdto updateStudent(Long id, Studentdto studentdto);//we used long id here because using these id we are updating student dto
    void deleteStudent(Long id);
}

