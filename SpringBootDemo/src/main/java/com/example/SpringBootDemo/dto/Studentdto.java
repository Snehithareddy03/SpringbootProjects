package com.example.SpringBootDemo.dto;

import com.example.SpringBootDemo.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Studentdto {
    private  Long id;

    private String name;

    private double marks;
}
