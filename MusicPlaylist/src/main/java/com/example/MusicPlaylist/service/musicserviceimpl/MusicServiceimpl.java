package com.example.MusicPlaylist.service.musicserviceimpl;

import com.example.MusicPlaylist.dto.MusicDTO;
import com.example.MusicPlaylist.entity.MusicEntity;
import com.example.MusicPlaylist.repository.MusicRepository;
import com.example.MusicPlaylist.service.MusicSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicServiceimpl implements MusicSerivce {
    @Autowired
    private MusicRepository repo;
    @Override
    public MusicDTO createMusic(MusicDTO musicdto){
        MusicEntity m1 = new MusicEntity(
                musicdto.getMusicId(),
                musicdto.getName(),
                musicdto.getArtist(),
                musicdto.getYear()
        );
        MusicEntity m2 = repo.save(m1);
        MusicDTO m3 = new MusicDTO(
                m1.getMusicId(),
                m1.getName(),
                m1.getArtist(),
                m1.getYear()
        );
        return m3;
    }
    public MusicEntity getMusic(Long musicId){
        return repo.findBymusicId(musicId);
    }
    public MusicDTO updateMusic(Long musicId,MusicDTO musicdto){
        MusicEntity music = repo.findBymusicId(musicId);
        music.setName(musicdto.getName());
        music.setArtist(musicdto.getArtist());
        music.setYear(musicdto.getYear());
        MusicEntity updatedmusic  = repo.save(music);
        return new MusicDTO(
                updatedmusic.getMusicId(),
                updatedmusic.getName(),
                updatedmusic.getArtist(),
                updatedmusic.getYear()
        );
    }
    public void deleteMusic(Long musicId){
        MusicEntity deleted = repo.findBymusicId(musicId);
        repo.delete(deleted);
    }
}
