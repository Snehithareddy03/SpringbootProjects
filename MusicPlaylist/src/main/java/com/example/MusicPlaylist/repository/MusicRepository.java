package com.example.MusicPlaylist.repository;

import com.example.MusicPlaylist.entity.MusicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<MusicEntity,Long> {
    MusicEntity findBymusicId(Long musicId);
    //MusicEntity delete(Long musicId);
}
