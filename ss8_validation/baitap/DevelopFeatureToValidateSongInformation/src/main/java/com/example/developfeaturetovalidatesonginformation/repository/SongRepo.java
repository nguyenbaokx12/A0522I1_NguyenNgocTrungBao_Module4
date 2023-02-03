package com.example.developfeaturetovalidatesonginformation.repository;


import com.example.developfeaturetovalidatesonginformation.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepo extends JpaRepository<Song, Integer> {
}
