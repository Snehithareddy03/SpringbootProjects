package com.example.MusicPlaylist.service;

import com.example.MusicPlaylist.dto.MusicDTO;
import com.example.MusicPlaylist.entity.MusicEntity;

import java.nio.file.LinkOption;

public interface MusicSerivce {
    MusicDTO createMusic(MusicDTO musicdto);
    MusicEntity getMusic(Long musicId);
    MusicDTO updateMusic(Long musicId, MusicDTO musicdto);
    void deleteMusic(Long musicId);
}
