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
        return repo.findByid(id);
                //.orElseThrow(()->new RuntimeException("student not found"));
    }

    @Override
    public Studentdto updateStudent(Long id, Studentdto studentdto) {
        Student student = repo.findByid(id);
                //.orElseThrow(()->new RuntimeException("student not found"));

        student.setName(studentdto.getName());// updating the data from entity classes
        student.setMarks(student.getMarks());

        Student updatedStudent = repo.save(student);

        // getting the data from dto class
        return new Studentdto(
                updatedStudent.getId(),
                updatedStudent.getName(),
                updatedStudent.getMarks()
        );
    }
    @Override
    public void deleteStudent(Long id){
        Student student = repo.findByid(id);
                repo.delete(student);
    }
}
