package com.example.MusicPlaylist.controller;

import com.example.MusicPlaylist.dto.MusicDTO;
import com.example.MusicPlaylist.entity.MusicEntity;
import com.example.MusicPlaylist.service.MusicSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/music")
public class MusicController {
    @Autowired
    private MusicSerivce serivce;
    @PostMapping("/savemusic")
    public ResponseEntity<MusicDTO>createMusic(@RequestBody MusicDTO musicdto){
        MusicDTO s1 = serivce.createMusic(musicdto);
        return new ResponseEntity<>(s1, HttpStatus.CREATED);
    }
    @GetMapping("/{musicId}")
    public ResponseEntity<MusicEntity>  getMusic(@PathVariable Long musicId){
        MusicEntity s2 = serivce.getMusic(musicId);
        return new ResponseEntity<>(s2,HttpStatus.OK);
    }
    @PutMapping("/{musicId}")
    public ResponseEntity<MusicDTO> updateMusic(@PathVariable Long musicId,@RequestBody MusicDTO musicdto){
        MusicDTO s3 = serivce.updateMusic(musicId,musicdto);
        return new ResponseEntity<>(s3,HttpStatus.CREATED);
    }
    @DeleteMapping("/{musicId}")
    public ResponseEntity<String> deleteMusic(@PathVariable Long musicId){
        serivce.deleteMusic(musicId);
        return ResponseEntity.ok("deleted successfully");
    }
}
