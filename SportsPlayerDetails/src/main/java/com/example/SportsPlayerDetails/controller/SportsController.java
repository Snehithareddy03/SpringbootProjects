package com.example.SportsPlayerDetails.controller;


import com.example.SportsPlayerDetails.dto.SportsDTO;
import com.example.SportsPlayerDetails.entity.SportsEntity;
import com.example.SportsPlayerDetails.service.SportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sports")
public class SportsController {
    @Autowired
    private SportsService service;
    @PostMapping("/save")
    public ResponseEntity<SportsDTO> createSports(@RequestBody SportsDTO sportsdto){
        SportsDTO s1 = service.createSports(sportsdto);
        return new ResponseEntity<>(s1, HttpStatus.CREATED);
    }
    @GetMapping("/{playerId}")
    public ResponseEntity<SportsEntity> getSports(@PathVariable Long playerId){
        SportsEntity s2 = service.getSports(playerId);
        return new ResponseEntity<>(s2,HttpStatus.OK);
    }
    @PutMapping("/{playerId}")
    public ResponseEntity<SportsDTO> updateSports(@PathVariable Long playerId,@RequestBody SportsDTO sportsdto){
        SportsDTO s3 = service.updateSports(playerId,sportsdto);
        return new ResponseEntity<>(s3,HttpStatus.CREATED);
    }
    @DeleteMapping("/{playerId}")
    public  ResponseEntity<String> deleteSports(@PathVariable Long playerId){
        service.deleteSports(playerId);
        return ResponseEntity.ok("deleted successfully");
    }
}
