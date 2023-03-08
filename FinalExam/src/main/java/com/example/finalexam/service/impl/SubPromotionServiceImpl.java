package com.example.finalexam.service.impl;

import com.example.finalexam.model.SubPromotion;
import com.example.finalexam.repositories.SubPromotionRepo;
import com.example.finalexam.service.ISubPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubPromotionServiceImpl implements ISubPromotionService {
    @Autowired
    private SubPromotionRepo promotionRepo;

    @Override
    public List<SubPromotion> findAll() {
        return promotionRepo.findAll();
    }
}
