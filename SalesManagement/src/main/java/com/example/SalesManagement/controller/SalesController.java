package com.example.SalesManagement.controller;

import com.example.SalesManagement.dto.SalesDTO;
import com.example.SalesManagement.entity.SalesEntity;
import com.example.SalesManagement.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sales")
public class SalesController {
    @Autowired
    private SalesService service;
    @PostMapping("/save")
    public ResponseEntity<SalesDTO> createSales(@RequestBody SalesDTO salesdto){
        SalesDTO s1 = service.createSales(salesdto);
        return new ResponseEntity<>(s1, HttpStatus.CREATED);
    }
    @GetMapping("/{salesId}")
    public ResponseEntity<SalesEntity> getSales(@PathVariable Long salesId){
        SalesEntity s2 =service.getSales(salesId);
        return new ResponseEntity<>(s2,HttpStatus.OK);
    }
    @PutMapping("/{salesId}")
    public ResponseEntity<SalesDTO> updateSales(@PathVariable Long salesId,@RequestBody SalesDTO salesdto){
        SalesDTO s3 = service.updateSales(salesId,salesdto);
        return new ResponseEntity<>(s3,HttpStatus.CREATED);
    }
    @DeleteMapping("/{salesId}")
    public ResponseEntity<String> deleteSales(@PathVariable Long salesId){
        service.deleteSales(salesId);
        return ResponseEntity.ok("deleted successfully");
    }
}