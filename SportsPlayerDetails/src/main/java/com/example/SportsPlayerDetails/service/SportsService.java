package com.example.SportsPlayerDetails.service;

import com.example.SportsPlayerDetails.dto.SportsDTO;
import com.example.SportsPlayerDetails.entity.SportsEntity;

public interface SportsService {
    SportsDTO createSports(SportsDTO sportsdto);
    SportsEntity getSports(Long sportsId);
    SportsDTO updateSports(Long sportsId,SportsDTO sportsdto);
    void deleteSports(Long sportsId);
}
