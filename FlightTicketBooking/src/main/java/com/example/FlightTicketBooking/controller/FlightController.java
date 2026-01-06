package com.example.FlightTicketBooking.controller;


import com.example.FlightTicketBooking.dto.FlightDTO;
import com.example.FlightTicketBooking.entity.FlightEntity;
import com.example.FlightTicketBooking.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/flight")
public class FlightController {
    @Autowired
    private FlightService service;
    @PostMapping("/save")
    public ResponseEntity<FlightDTO> createFlight(@RequestBody FlightDTO flightdto){
        FlightDTO f1 = service.createFlight(flightdto);
        return new ResponseEntity<>(f1, HttpStatus.CREATED);
    }
    @GetMapping("/{flightId}")
    public ResponseEntity<FlightEntity> getFlight(@PathVariable Long flightId){
        FlightEntity f2 = service.getFlight(flightId);
        return new ResponseEntity<>(f2,HttpStatus.OK);
    }
    @PutMapping("/{flightId}")
    public ResponseEntity<FlightDTO> updateFlight(@PathVariable Long flightId,@RequestBody FlightDTO flightdto){
        FlightDTO f3 = service.updateFlight(flightId,flightdto);
        return new ResponseEntity<>(f3,HttpStatus.CREATED);
    }
    @DeleteMapping("/{flightId}")
    public ResponseEntity<String> deleteFlight(@PathVariable Long flightId){
        service.deleteFlight(flightId);
        return ResponseEntity.ok("deleted successfully");
    }

}
