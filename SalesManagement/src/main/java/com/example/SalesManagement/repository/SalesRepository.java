package com.example.SalesManagement.repository;

import com.example.SalesManagement.entity.SalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<SalesEntity,Long> {
    SalesEntity findBysalesId(Long salesId);
}
