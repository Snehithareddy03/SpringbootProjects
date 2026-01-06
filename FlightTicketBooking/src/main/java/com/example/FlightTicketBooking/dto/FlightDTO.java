package com.example.FlightTicketBooking.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightDTO {
    private Long flightId;
    private String name;
    private Long fare;
    private LocalTime time;
}
