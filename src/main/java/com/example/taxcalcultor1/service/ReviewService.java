package com.example.taxcalcultor1.service;

import com.example.taxcalcultor1.repository.ReviewRepository;
import com.example.taxcalcultor1.domain.entity.ReviewEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReviewService {

    private final ReviewRepository repository;

    public List<ReviewEntity> getAllReviews(){
        return repository.findAll();
    }
}
