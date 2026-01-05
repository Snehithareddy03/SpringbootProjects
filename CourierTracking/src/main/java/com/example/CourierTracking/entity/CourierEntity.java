package com.example.CourierTracking.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="courier_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courierId;
    private String senderName;
    private String trackingId;
    private String receiverName;
}

