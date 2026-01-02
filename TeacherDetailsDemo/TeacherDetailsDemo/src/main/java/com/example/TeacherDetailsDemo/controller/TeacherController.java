package com.example.TeacherDetailsDemo.controller;


import com.example.TeacherDetailsDemo.dto.Teacherdto;
import com.example.TeacherDetailsDemo.entity.Teacher;
import com.example.TeacherDetailsDemo.service.Teacherservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Teacher")
public class TeacherController {
    @Autowired
    private Teacherservice teacherservice;
    @PostMapping("/saveTeacher")
    public ResponseEntity<Teacherdto> saveteacher(@RequestBody Teacherdto teacherdto){
        Teacherdto saveTeacher =teacherservice.saveTeacher(teacherdto);
        return new ResponseEntity<>(saveTeacher, HttpStatus.CREATED);
    }
    @GetMapping("{teacherId}")
    public ResponseEntity<Teacher> findTeacher(@PathVariable Long teacherId){
        Teacher teacher = teacherservice.getTeacher (teacherId);
        return new ResponseEntity<>(teacher,HttpStatus.OK);
    }
    @PutMapping("/{teacherId}")
    public ResponseEntity<Teacherdto> updateTeacher(
            @PathVariable Long teacherId,
            @RequestBody Teacherdto teacherdto) {
        Teacherdto updatedTeacher = teacherservice.updateTeacher(teacherId, teacherdto);
        return ResponseEntity.ok(updatedTeacher);
    }
    @DeleteMapping("{id}")
    public  ResponseEntity<String> delete(@PathVariable Long id){
        teacherservice.deleteTeacher(id);
        return ResponseEntity.ok("deleted data successfully");
    }

}
