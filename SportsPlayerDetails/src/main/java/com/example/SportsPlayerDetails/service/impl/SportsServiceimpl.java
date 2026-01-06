package com.example.SportsPlayerDetails.service.impl;


import com.example.SportsPlayerDetails.dto.SportsDTO;
import com.example.SportsPlayerDetails.entity.SportsEntity;
import com.example.SportsPlayerDetails.repository.SportsRepository;
import com.example.SportsPlayerDetails.service.SportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SportsServiceimpl implements SportsService {
    @Autowired
    private SportsRepository repo;
    @Override
    public SportsDTO createSports(SportsDTO sportsdto){
        SportsEntity s1 = new SportsEntity(
                sportsdto.getPlayerId(),
                sportsdto.getPlayerName(),
                sportsdto.getSportName(),
                sportsdto.getAge(),
                sportsdto.getGender()
        );
        SportsEntity s2 = repo.save(s1);
        SportsDTO s3 = new SportsDTO(
                s2.getPlayerId(),
                s2.getPlayerName(),
                s2.getSportName(),
                s2.getAge(),
                s2.getGender()
        );
        return s3;
    }
    public SportsEntity getSports(Long playerId){
        return  repo.findByplayerId(playerId);
    }
    public SportsDTO updateSports(Long playerId,SportsDTO sportsdto){
        SportsEntity s4 = repo.findByplayerId(playerId);
        s4.setSportName(sportsdto.getSportName());
        s4.setAge(sportsdto.getAge());
        s4.setGender(sportsdto.getGender());
        s4.setPlayerName(sportsdto.getPlayerName());
        SportsEntity s5 = repo.save(s4);
        SportsDTO s6 = new SportsDTO(
                s5.getPlayerId(),
                s5.getPlayerName(),
                s5.getSportName(),
                s5.getAge(),
                s5.getGender()
        );
        return s6;
    }
    public void deleteSports(Long playerId){
        SportsEntity deleted = repo.findByplayerId(playerId);
        repo.delete(deleted);
    }
}
