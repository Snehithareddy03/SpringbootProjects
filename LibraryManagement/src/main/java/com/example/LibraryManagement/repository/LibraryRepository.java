package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.entity.LibraryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<LibraryEntity,Long> {
    LibraryEntity findBylibraryId(Long libraryId);
}
