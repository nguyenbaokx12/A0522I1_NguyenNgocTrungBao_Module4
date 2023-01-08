package com.example.service;

import com.example.model.Music;
import com.example.repository.IMusicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements IMusicService {

    @Autowired
    private IMusicRepo iMusicRepo;

    @Override
    public List<Music> findAll() {
        return iMusicRepo.findAll();
    }

    @Override
    public void save(Music music) {

    }

    @Override
    public Music findById(int id) {
        return null;
    }

    @Override
    public void update(Music music) {

    }

    @Override
    public void delete(Music music) {

    }
}
