package com.example.repository;


import com.example.model.Music;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class MusicRepoImpl implements IMusicRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Music> findAll() {
        TypedQuery<Music> query=entityManager.createQuery("SELECT s from Music as s", Music.class);
        return query.getResultList();
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
