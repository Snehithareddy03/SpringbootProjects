package com.example.CourierTracking.controller;


import com.example.CourierTracking.dto.CourierDTO;
import com.example.CourierTracking.entity.CourierEntity;
import com.example.CourierTracking.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;

@RestController
@RequestMapping("/api/courier")
public class CourierController {
    @Autowired
    private CourierService service;
    @PostMapping("/savecourier")
    public ResponseEntity<CourierDTO> createCourier(@RequestBody CourierDTO courierdto){
        CourierDTO m1 = service.createCourier(courierdto);
        return new ResponseEntity<>(m1, HttpStatus.CREATED);
    }
    @GetMapping("/{courierId}")
    public ResponseEntity<CourierEntity> getCourier(@PathVariable Long courierId){
        CourierEntity m2 = service.getCourier(courierId);
        return new ResponseEntity<>(m2,HttpStatus.OK);
    }
    @PutMapping("/{courierId}")
    public ResponseEntity<CourierDTO> updateCourier(@PathVariable Long courierId,@RequestBody CourierDTO courierdto){
        CourierDTO m3 = service.updateCourier(courierId,courierdto);
        return new ResponseEntity<>(m3,HttpStatus.CREATED);
    }
    @DeleteMapping("/{courierId}")
    public ResponseEntity<String> deleteCourier(@PathVariable Long courierId){
        service.deleteCourier(courierId);
        return ResponseEntity.ok("deleted successfully");
    }
}
