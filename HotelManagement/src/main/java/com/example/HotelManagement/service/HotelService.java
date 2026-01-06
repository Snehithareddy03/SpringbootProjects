package com.example.HotelManagement.service;

import com.example.HotelManagement.dto.HotelDTO;
import com.example.HotelManagement.entity.HotelEntity;

public interface HotelService {
    HotelDTO createHotel(HotelDTO hoteldto);
    HotelEntity getHotel(Long hotelId);
    HotelDTO updateHotel(Long hotelId,HotelDTO hoteldto);
    void deleteHotel(Long hotelId);
}
