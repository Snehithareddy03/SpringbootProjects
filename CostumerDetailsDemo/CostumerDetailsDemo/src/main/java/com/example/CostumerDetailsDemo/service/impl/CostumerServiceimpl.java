package com.example.CostumerDetailsDemo.service.impl;

import com.example.CostumerDetailsDemo.CostumerDetailsDemoApplication;
import com.example.CostumerDetailsDemo.dto.Costumerdto;
import com.example.CostumerDetailsDemo.entity.Costumer;
import com.example.CostumerDetailsDemo.repository.CostumerRepository;
import com.example.CostumerDetailsDemo.service.Costumerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostumerServiceimpl implements Costumerservice {
    @Autowired
    private CostumerRepository repo;
    @Override
    public Costumerdto savecostumer(Costumerdto costumerdto){
        Costumer costumer = new Costumer(
                costumerdto.getId(),
                costumerdto.getName(),
                costumerdto.getPrice()

        );
        Costumer savedCostumer = repo.save(costumer);

        Costumerdto savecostumer = new Costumerdto(
                savedCostumer.getId(),
                savedCostumer.getName(),
                savedCostumer.getPrice()

        );
        return savecostumer;

    }

    @Override
    public Costumer getCostumer(Long id) {
        return repo.findById(id)
                .orElseThrow(()->new RuntimeException("costumer not found"));
    }
}
