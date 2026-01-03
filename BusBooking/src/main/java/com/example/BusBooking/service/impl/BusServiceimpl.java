package com.example.BusBooking.service.impl;

import com.example.BusBooking.dto.BusDTO;
import com.example.BusBooking.entity.BusEntity;
import com.example.BusBooking.repository.BusRepository;
import com.example.BusBooking.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusServiceimpl implements BusService {
    @Autowired
    private BusRepository repo;
    @Override
    public BusDTO createBus(BusDTO busdto){

        BusEntity P1 = new BusEntity(
                busdto.getBusId(),
                busdto.getName(),
                busdto.getAge(),
                busdto.getGender(),
                busdto.getNumber()
        );
        BusEntity savedp1 = repo.save(P1);

        BusDTO savep1 = new BusDTO(
                savedp1.getBusId(),
                savedp1.getName(),
                savedp1.getAge(),
                savedp1.getGender(),
                savedp1.getNumber()
        );
        return savep1;
    }
    public  BusEntity getBus(Long busId) {
        return repo.findBybusId(busId);
    }

    public BusDTO updateBus(Long busId, BusDTO busdto){
        BusEntity b2 = repo.findBybusId(busId);
        b2.setName(busdto.getName());
        b2.setAge(busdto.getAge());
        b2.setGender(busdto.getGender());
        b2.setNumber(busdto.getNumber());
        BusEntity updatedBus = repo.save(b2);
        return new BusDTO(
                updatedBus.getBusId(),
                updatedBus.getName(),
                updatedBus.getAge(),
                updatedBus.getGender(),
                updatedBus.getNumber()

        );
    }
    public void deleteBus(Long busId){
        BusEntity deleted = repo.findBybusId(busId);
        repo.delete(deleted);
    }
}
