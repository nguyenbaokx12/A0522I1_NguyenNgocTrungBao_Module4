package com.example.developfeaturetovalidatesonginformation.service;

import com.example.developfeaturetovalidatesonginformation.model.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ISongService {
    Page<Song> findAll(Pageable pageable);
    void saveSong(Song song);
    void deleteSong(Integer id);
    Song findById(Integer id);
}
