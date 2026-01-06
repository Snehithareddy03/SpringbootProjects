package com.example.HotelManagement.service.impl;

import com.example.HotelManagement.dto.HotelDTO;
import com.example.HotelManagement.entity.HotelEntity;
import com.example.HotelManagement.repository.HotelRepository;
import com.example.HotelManagement.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceimpl implements HotelService {
    @Autowired
    private HotelRepository repo;
    @Override
    public HotelDTO createHotel(HotelDTO hoteldto){
        HotelEntity h1 = new HotelEntity(
                hoteldto.getHotelId(),
                hoteldto.getName(),
                hoteldto.getCost()
        );
        HotelEntity h2 = repo.save(h1);
        HotelDTO h3 = new HotelDTO(
                h2.getHotelId(),
                h2.getName(),
                h2.getCost()
        );
        return h3;
    }
    public HotelEntity getHotel(Long hotelId){
        HotelEntity h4 = repo.findByhotelId(hotelId);
        return h4;
    }
    public HotelDTO updateHotel(Long hotelId,HotelDTO hoteldto){
        HotelEntity h5 = repo.findByhotelId(hotelId);
        h5.setName(hoteldto.getName());
        h5.setCost(hoteldto.getCost());
        HotelEntity h6 = repo.save(h5);
        HotelDTO h7 = new HotelDTO(
                h6.getHotelId(),
                h6.getName(),
                h6.getCost()
        );
        return h7;
    }
    public void deleteHotel(Long hotelId) {
        HotelEntity deleted = repo.findByhotelId(hotelId);
        repo.delete(deleted);
    }
}
