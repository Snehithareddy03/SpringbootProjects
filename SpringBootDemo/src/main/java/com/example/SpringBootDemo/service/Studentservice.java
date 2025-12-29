package com.example.SpringBootDemo.service;

import com.example.SpringBootDemo.dto.Studentdto;
import com.example.SpringBootDemo.entity.Student;

public interface Studentservice {
    Studentdto savestudent(Studentdto studentdto);
    Student getStudent(Long id);


}

