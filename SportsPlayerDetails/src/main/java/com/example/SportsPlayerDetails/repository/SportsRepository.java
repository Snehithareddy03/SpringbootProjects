package com.example.SportsPlayerDetails.repository;

import com.example.SportsPlayerDetails.entity.SportsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportsRepository extends JpaRepository<SportsEntity,Long> {
    SportsEntity findByplayerId(Long playerId);
}
