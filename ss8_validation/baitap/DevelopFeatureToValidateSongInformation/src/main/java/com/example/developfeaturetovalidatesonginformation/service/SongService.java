package com.example.developfeaturetovalidatesonginformation.service;

import com.example.developfeaturetovalidatesonginformation.model.Song;
import com.example.developfeaturetovalidatesonginformation.repository.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SongService implements ISongService {
    @Autowired
    private SongRepo songRepo;

    @Override
    public Page<Song> findAll(Pageable pageable) {
        return songRepo.findAll(pageable);
    }

    @Override
    public void saveSong(Song song) {
        songRepo.save(song);
    }

    @Override
    public void deleteSong(Integer id) {
        songRepo.deleteById(id);
    }

    @Override
    public Song findById(Integer id) {
        return songRepo.findById(id).orElse(null);
    }
}
