package com.example.LibraryManagement.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibraryDTO {
    private Long libraryId;
    private String bookName;
    private String issueDate;
    private int amount;
}
