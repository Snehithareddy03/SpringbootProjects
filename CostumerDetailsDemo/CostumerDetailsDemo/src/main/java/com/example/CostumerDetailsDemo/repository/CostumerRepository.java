package com.example.CostumerDetailsDemo.repository;

import com.example.CostumerDetailsDemo.entity.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostumerRepository extends JpaRepository<Costumer,Long> {
}
