package com.example.TeacherDetailsDemo.controller;


import com.example.TeacherDetailsDemo.dto.Teacherdto;
import com.example.TeacherDetailsDemo.entity.Teacher;
import com.example.TeacherDetailsDemo.service.Teacherservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Teac her")
public class TeacherController {
    @Autowired
    private Teacherservice teacherservice;
    @PostMapping("/saveTeacher")
    public ResponseEntity<Teacherdto> saveteacher(@RequestBody Teacherdto teacherdto){
        Teacherdto saveTeacher =teacherservice.saveTeacher(teacherdto);
        return new ResponseEntity<>(saveTeacher, HttpStatus.CREATED);
    }
    @GetMapping("{teacherid}")
    public ResponseEntity<Teacher> findTeacher(@PathVariable Long teacherid){
        Teacher teacher = teacherservice.getTeacher (teacherid);
        return new ResponseEntity<>(teacher,HttpStatus.OK);
    }
}
