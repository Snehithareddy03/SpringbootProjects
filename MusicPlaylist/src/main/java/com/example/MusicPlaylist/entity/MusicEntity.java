package com.example.MusicPlaylist.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="music_playlist")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MusicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long musicId;
    private String name;
    private String artist;
    private int year;
}
