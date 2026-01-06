package com.example.HotelManagement.repository;

import com.example.HotelManagement.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelEntity,Long> {
    HotelEntity findByhotelId(Long hotelId);
}
