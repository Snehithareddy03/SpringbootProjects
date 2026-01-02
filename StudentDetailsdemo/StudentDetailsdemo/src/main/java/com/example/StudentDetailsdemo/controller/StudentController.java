package com.example.StudentDetailsdemo.controller;

import com.example.StudentDetailsdemo.dto.StudentDto;
import com.example.StudentDetailsdemo.entity.Student;
import com.example.StudentDetailsdemo.service.StudentService;
import com.example.StudentDetailsdemo.service.impl.StudentServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/saveStudent")
    public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto){
        StudentDto saveStudent = studentService.createStudent(studentDto);
        return new ResponseEntity<>(saveStudent, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        Student GS = studentService.getStudent(id);
        return new ResponseEntity<>(GS,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable Long id,@RequestBody StudentDto studentDto){
        StudentDto updated = studentService.updateStudent(id,studentDto);
        return ResponseEntity.ok(updated);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return ResponseEntity.ok("deleted successfully");
    }
}
