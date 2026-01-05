package com.example.LibraryManagement.service.impl;

import com.example.LibraryManagement.dto.LibraryDTO;
import com.example.LibraryManagement.entity.LibraryEntity;
import com.example.LibraryManagement.repository.LibraryRepository;
import com.example.LibraryManagement.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryServiceimpl implements LibraryService {
    @Autowired
    private LibraryRepository repo;
    @Override
    public LibraryDTO createLibrary(LibraryDTO librarydto){
        LibraryEntity library = new LibraryEntity(
                librarydto.getLibraryId(),
                librarydto.getBookName(),
                librarydto.getIssueDate(),
                librarydto.getAmount()
        );
        LibraryEntity l1 = repo.save(library);
        LibraryDTO l2 = new LibraryDTO(
                l1.getLibraryId(),
                l1.getBookName(),
                l1.getIssueDate(),
                l1.getAmount()
        );
        return l2;
    }
    public LibraryEntity getLibrary(Long libraryId){
        return repo.findBylibraryId(libraryId);
    }
    public LibraryDTO updateLibrary(Long libraryId,LibraryDTO librarydto){
        LibraryEntity l3 = repo.findBylibraryId(libraryId);
        l3.setAmount(librarydto.getAmount());
        l3.setIssueDate(librarydto.getIssueDate());
        l3.setBookName(librarydto.getBookName());
        LibraryEntity l4 = repo.save(l3);
        LibraryDTO updated = new LibraryDTO(
                l4.getLibraryId(),
                l4.getBookName(),
                l4.getIssueDate(),
                l4.getAmount()
        );
        return updated;
    }
    public void deleteLibrary(Long libraryId){
        LibraryEntity deleted = repo.findBylibraryId(libraryId);
        repo.delete(deleted);
    }

}
