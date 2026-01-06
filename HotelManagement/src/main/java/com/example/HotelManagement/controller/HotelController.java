package com.example.HotelManagement.controller;

import com.example.HotelManagement.dto.HotelDTO;
import com.example.HotelManagement.entity.HotelEntity;
import com.example.HotelManagement.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {
    @Autowired
    private HotelService service;
    @PostMapping("/save")
    public ResponseEntity<HotelDTO> createHotel(@RequestBody HotelDTO hoteldto){
        HotelDTO s1 = service.createHotel(hoteldto);
        return new ResponseEntity<>(s1, HttpStatus.CREATED);
    }
    @GetMapping("/{hotelId}")
    public ResponseEntity<HotelEntity> getHotel(@PathVariable Long hotelId){
        HotelEntity s2 =service.getHotel(hotelId);
        return new ResponseEntity<>(s2,HttpStatus.OK);
    }
    @PutMapping("/{hotelId}")
    public ResponseEntity<HotelDTO> updateHotel(@PathVariable Long hotelId,@RequestBody HotelDTO hoteldto){
        HotelDTO s3 = service.updateHotel( hotelId,hoteldto);
        return new ResponseEntity<>(s3,HttpStatus.CREATED);
    }
    @DeleteMapping("/{hotelId}")
    public ResponseEntity<String> deleteHotel(@PathVariable Long hotelId){
        service.deleteHotel(hotelId);
        return ResponseEntity.ok("deleted successfully");
    }
}