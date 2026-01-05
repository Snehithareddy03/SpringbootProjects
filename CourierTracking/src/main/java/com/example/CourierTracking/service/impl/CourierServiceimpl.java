package com.example.CourierTracking.service.impl;

import com.example.CourierTracking.dto.CourierDTO;
import com.example.CourierTracking.entity.CourierEntity;
import com.example.CourierTracking.repository.CourierRepository;
import com.example.CourierTracking.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourierServiceimpl implements CourierService {
    @Autowired
    private CourierRepository repo;
    @Override
    public CourierDTO createCourier(CourierDTO courierdto){
        CourierEntity courier = new CourierEntity(
                courierdto.getCourierId(),
                courierdto.getSenderName(),
                courierdto.getReceiverName(),
                courierdto.getTrackingId()
        );
        CourierEntity updated = (CourierEntity)repo.save(courier);
        CourierDTO updatedCourier = new CourierDTO(
                updated.getCourierId(),
                updated.getSenderName(),
                updated.getTrackingId(),
                updated.getReceiverName()
        );
        return updatedCourier;
    }
    @Override
    public CourierEntity getCourier(Long courierId){
        return repo.findBycourierId(courierId);
    }
    public CourierDTO updateCourier(Long courierId,CourierDTO courierdto){
        CourierEntity c1 = repo.findBycourierId(courierId);
                c1.setSenderName(courierdto.getSenderName());
                c1.setReceiverName(courierdto.getReceiverName());
                c1.setTrackingId(courierdto.getTrackingId());
        CourierEntity c2 = repo.findBycourierId(courierId);
        return new CourierDTO(
                c2.getCourierId(),
                c2.getReceiverName(),
                c2.getTrackingId(),
                c2.getSenderName()
        );
    }
    public  void deleteCourier(Long courierId){
        CourierEntity deleted = repo.findBycourierId(courierId);
        repo.delete(deleted);
    }
}
