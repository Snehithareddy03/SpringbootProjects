package com.example.TeacherDetailsDemo.service.impl;

import com.example.TeacherDetailsDemo.dto.Teacherdto;
import com.example.TeacherDetailsDemo.entity.Teacher;
import com.example.TeacherDetailsDemo.repository.TeacherRepository;
import com.example.TeacherDetailsDemo.service.Teacherservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceimpl implements Teacherservice {
    @Autowired
    private TeacherRepository repository;
    @Override
    public Teacherdto saveTeacher(Teacherdto teacherdto) {
        Teacher teacher = new Teacher(
                teacherdto.getTeacherid(),
                teacherdto.getName(),
                teacherdto.getDepartment()
        );
        Teacher savedTeacher = (Teacher) repository.save(teacher);

        Teacherdto  saveteacher = new Teacherdto(
                savedTeacher.getTeacherid(),
                savedTeacher.getName(),
                savedTeacher.getDepartment()
        );

        return saveteacher;
    }
    public Teacher getTeacher(Long teacherid){
        return  repository.findById(teacherid)
                .orElseThrow(()->new RuntimeException("teacher details not found"));
    }
}
