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
                teacherdto.getId(),
                teacherdto.getName(),
                teacherdto.getDepartment()
        );
        Teacher savedTeacher = (Teacher) repository.save(teacher);

        Teacherdto  saveteacher = new Teacherdto(
                savedTeacher.getId(),
                savedTeacher.getName(),
                savedTeacher.getDepartment()
        );

        return saveteacher;
    }
    @Override
    public Teacher getTeacher(Long id){
        return  repository.findByid(id);
                //.orElseThrow(()->new RuntimeException("teacher details not found"));
    }


    public Teacherdto updateTeacher(Long id, Teacherdto teacherdto){
        Teacher teacher=repository.findByid(id);
        teacher.setName(teacherdto.getName());
        teacher.setDepartment(teacherdto.getDepartment());

        Teacher updatedTeacher = repository.save(teacher);
        return new Teacherdto(
                updatedTeacher.getId(),
                updatedTeacher.getName(),
                updatedTeacher.getDepartment()
        );
    }

    public void deleteTeacher(Long id){
        Teacher teacher = repository.findByid(id);
        repository.delete(teacher);
    }
}
