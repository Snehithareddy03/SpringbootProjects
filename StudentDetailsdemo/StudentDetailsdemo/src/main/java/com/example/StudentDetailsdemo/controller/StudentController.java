package com.example.StudentDetailsdemo.controller;

import com.example.StudentDetailsdemo.dto.StudentDto;
import com.example.StudentDetailsdemo.service.StudentService;
import com.example.StudentDetailsdemo.service.impl.StudentServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/saveStudent")
    public ResponseEntity<StudentDto> saveStudent(@RequestBody StudentDto studentDto){
        StudentDto saveStudent = studentService.saveStudent(studentDto);
        return new ResponseEntity<>(saveStudent, HttpStatus.CREATED);
    }
}
