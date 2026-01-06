package com.example.FlightTicketBooking.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@Table(name = "flight_details")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class FlightEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long flightId;
    private String name;
    private Long fare;
    private LocalTime time;
}
