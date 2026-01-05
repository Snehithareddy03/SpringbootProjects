package com.example.LibraryManagement.controller;


import com.example.LibraryManagement.dto.LibraryDTO;
import com.example.LibraryManagement.entity.LibraryEntity;
import com.example.LibraryManagement.service.LibraryService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Library")
public class LibraryController {
    @Autowired
    private LibraryService service;
    @PostMapping("/savelibrary")
    public  ResponseEntity<LibraryDTO> createLibrary(@RequestBody LibraryDTO librarydto){
        LibraryDTO l1 = service.createLibrary(librarydto);
        return new ResponseEntity<>(l1, HttpStatus.CREATED);
    }
    @GetMapping("/{libraryId}")
    public ResponseEntity<LibraryEntity> getLibrary(@PathVariable Long libraryId){
        LibraryEntity l2 = service.getLibrary(libraryId);
        return new ResponseEntity<>(l2,HttpStatus.OK);
    }
    @PutMapping("/{libraryId}")
    public ResponseEntity<LibraryDTO> updateLibrary(@PathVariable Long libraryId,@RequestBody LibraryDTO librarydto){
        LibraryDTO l3 = service.updateLibrary(libraryId,librarydto);
        return new ResponseEntity<>(l3,HttpStatus.CREATED);
    }
    @DeleteMapping("/{libraryId}")
    public ResponseEntity<String> deleteLibrary(@PathVariable Long libraryId){
        service.deleteLibrary(libraryId);
        return ResponseEntity.ok("deleted successfully");
    }
}
