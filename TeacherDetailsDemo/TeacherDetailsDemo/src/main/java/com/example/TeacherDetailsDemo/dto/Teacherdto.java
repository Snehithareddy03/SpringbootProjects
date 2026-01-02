package com.example.TeacherDetailsDemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Teacherdto {
    private Long id;
    private String name;
    private String department;
}
