package com.example.repository;

import com.example.model.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class StudentRepoImpl implements IStudentRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = entityManager.createQuery("select s from Student as s", Student.class);
        return query.getResultList();
    }

    @Override
    public void save(Student student) {

    }
}
