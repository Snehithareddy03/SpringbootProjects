package com.example.TeacherDetailsDemo.service;

import com.example.TeacherDetailsDemo.dto.Teacherdto;
import com.example.TeacherDetailsDemo.entity.Teacher;

public interface Teacherservice {
    Teacherdto saveTeacher(Teacherdto teacherdto);
    Teacher getTeacher(Long teacherid);
}
