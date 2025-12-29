package com.example.StudentDetailsdemo.service.impl;


import com.example.StudentDetailsdemo.dto.StudentDto;
import com.example.StudentDetailsdemo.entity.Student;
import com.example.StudentDetailsdemo.repository.StudentRepository;
import com.example.StudentDetailsdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceimpl implements StudentService {
    @Autowired
    private StudentRepository repository;
    @Override
    public StudentDto createStudent (StudentDto studentDto){
        Student S = new Student(
                studentDto.getId(),
                studentDto.getName(),
                studentDto.getMarks()
        );
        Student savedStudent = repository.save(S);
        StudentDto saveStudent = new StudentDto(
                savedStudent.getId(),
                savedStudent.getName(),
                savedStudent.getMarks()
        );
        return saveStudent;
    }
}

