package com.example.FlightTicketBooking.service.impl;

import com.example.FlightTicketBooking.dto.FlightDTO;
import com.example.FlightTicketBooking.entity.FlightEntity;
import com.example.FlightTicketBooking.repository.FlightRepository;
import com.example.FlightTicketBooking.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceimpl implements FlightService {
    @Autowired
    private FlightRepository repo;
    @Override
    public FlightDTO createFlight(FlightDTO flightdto){
        FlightEntity f1 = new FlightEntity(
                flightdto.getFlightId(),
                flightdto.getName(),
                flightdto.getFare(),
                flightdto.getTime()
        );
        FlightEntity f2 = repo.save(f1);
        FlightDTO f3 = new FlightDTO(
                f2.getFlightId(),
                f2.getName(),
                f2.getFare(),
                f2.getTime()
        );
        return f3;
    }
    public FlightEntity getFlight(Long flightId){
        return repo.findByflightId(flightId);
    }
    public FlightDTO updateFlight(Long flightId,FlightDTO flightdto){
        FlightEntity f4 = repo.findByflightId(flightId);
        f4.setName(flightdto.getName());
        f4.setFare(flightdto.getFare());
        f4.setTime(flightdto.getTime());
        FlightEntity f5 = repo.save(f4);
        FlightDTO f6 = new FlightDTO(
                f5.getFlightId(),
                f5.getName(),
                f5.getFare(),
                f5.getTime()
        );
        return f6;
    }
    public void deleteFlight(Long flightId){
        FlightEntity deleted = repo.findByflightId(flightId);
        repo.delete(deleted);
    }
}
