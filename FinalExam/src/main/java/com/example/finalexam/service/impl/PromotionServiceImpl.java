package com.example.finalexam.service.impl;

import com.example.finalexam.model.Promotion;
import com.example.finalexam.repositories.PromotionRepo;
import com.example.finalexam.service.IPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PromotionServiceImpl implements IPromotionService {
    @Autowired
    private PromotionRepo promotionRepo;

    @Override
    public List<Promotion> findAll() {
        return promotionRepo.findAll();
    }

    @Override
    public void create(Promotion promotion) {
        promotionRepo.save(promotion);
    }

    @Override
    public void delete(Integer id) {
        promotionRepo.deleteById(id);
    }

    @Override
    public Optional<Promotion> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Promotion> search(String name) {
        return null;
    }

}
