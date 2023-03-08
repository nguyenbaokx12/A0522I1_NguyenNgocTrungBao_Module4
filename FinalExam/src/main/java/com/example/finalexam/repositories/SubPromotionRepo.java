package com.example.finalexam.repositories;

import com.example.finalexam.model.SubPromotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SubPromotionRepo extends JpaRepository<SubPromotion, Integer> {
}
