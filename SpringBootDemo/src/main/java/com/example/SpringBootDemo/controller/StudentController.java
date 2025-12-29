package com.example.SpringBootDemo.controller;

import com.example.SpringBootDemo.dto.Studentdto;
import com.example.SpringBootDemo.entity.Student;
import com.example.SpringBootDemo.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")

public class StudentController {
    @Autowired
    private Studentservice studentservice;
    @PostMapping("/saveStudent")
    public ResponseEntity<Studentdto> savestudent(@RequestBody Studentdto studentdto){
        Studentdto saveStudent = studentservice.savestudent(studentdto);
        return new ResponseEntity<>(saveStudent, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<Student> findStudent(@PathVariable Long id){
        Student student = studentservice.getStudent(id);
        return new ResponseEntity<>(student,HttpStatus.OK);
    }
}
