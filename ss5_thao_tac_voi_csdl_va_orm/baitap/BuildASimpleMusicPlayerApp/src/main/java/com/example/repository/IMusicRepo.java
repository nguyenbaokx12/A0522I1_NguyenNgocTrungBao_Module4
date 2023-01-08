package com.example.repository;


import com.example.model.Music;

import java.util.List;

public interface IMusicRepo {
    List<Music> findAll();
    void save(Music music);
    Music findById(int id);
    void update(Music music);
    void delete(Music music);

}
