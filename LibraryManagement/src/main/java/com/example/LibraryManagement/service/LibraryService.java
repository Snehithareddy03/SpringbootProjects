package com.example.LibraryManagement.service;

import com.example.LibraryManagement.dto.LibraryDTO;
import com.example.LibraryManagement.entity.LibraryEntity;

public interface LibraryService {
    LibraryDTO createLibrary(LibraryDTO librarydto);
    LibraryEntity getLibrary(Long libraryId);
    LibraryDTO updateLibrary(Long libraryId,LibraryDTO librarydto);
    void deleteLibrary(Long libraryId);
}
