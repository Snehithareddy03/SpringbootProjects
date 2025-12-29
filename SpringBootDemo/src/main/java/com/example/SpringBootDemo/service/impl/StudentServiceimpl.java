package com.example.SpringBootDemo.service.impl;

import com.example.SpringBootDemo.dto.Studentdto;
import com.example.SpringBootDemo.entity.Student;
import com.example.SpringBootDemo.repository.StudentRepository;
import com.example.SpringBootDemo.service.Studentservice;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentServiceimpl implements Studentservice {

    @Autowired // it will inject one class object into another class
    private StudentRepository repo;

    @Override

    public Studentdto savestudent(Studentdto studentdto) {

        Student student = new Student(

                studentdto.getId(),

                studentdto.getName(),

                studentdto.getMarks()

        );

        Student savedStudent = repo.save(student);

        Studentdto savestudent = new Studentdto(

                savedStudent.getId(),

                savedStudent.getName(),

                savedStudent.getMarks()

        );
        return savestudent;
    }

    public Student getStudent(Long id){
        return repo.findById(id)
                .orElseThrow(()->new RuntimeException("student not found"));
    }
}
