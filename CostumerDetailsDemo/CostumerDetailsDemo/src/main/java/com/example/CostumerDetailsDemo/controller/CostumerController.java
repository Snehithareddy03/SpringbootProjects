package com.example.CostumerDetailsDemo.controller;

import com.example.CostumerDetailsDemo.dto.Costumerdto;
import com.example.CostumerDetailsDemo.entity.Costumer;
import com.example.CostumerDetailsDemo.service.Costumerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/costumer")
public class CostumerController {
    @Autowired
    private Costumerservice costumerservice;
    @PostMapping("/saveCostumer")
    public ResponseEntity<Costumerdto> savecostumer(@RequestBody Costumerdto costumerdto){
        Costumerdto saveCostumer = costumerservice.savecostumer(costumerdto);
        return new ResponseEntity<>(saveCostumer, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<Costumer> findCostumer(@PathVariable Long id){
        Costumer costumer = costumerservice.getCostumer(id);
        return new ResponseEntity<>(costumer,HttpStatus.OK);
    }
}
