package com.example.LibraryManagement.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="library_management")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibraryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long libraryId;
    private String bookName;
    private String issueDate;
    private int amount;
}
