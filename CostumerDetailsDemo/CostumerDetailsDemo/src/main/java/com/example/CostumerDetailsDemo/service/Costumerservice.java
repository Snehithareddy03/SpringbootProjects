package com.example.CostumerDetailsDemo.service;

import com.example.CostumerDetailsDemo.dto.Costumerdto;
import com.example.CostumerDetailsDemo.entity.Costumer;

public interface Costumerservice {
    Costumerdto savecostumer(Costumerdto costumerdto);
    Costumer getCostumer(Long id);
}
