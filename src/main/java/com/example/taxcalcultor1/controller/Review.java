package com.example.taxcalcultor1.controller;

import com.example.taxcalcultor1.domain.entity.ReviewEntity;
import com.example.taxcalcultor1.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/review")
@AllArgsConstructor
public class Review {

    private final ReviewService service;

    @GetMapping
    public List<ReviewEntity> getAllReviews(){
        return service.getAllReviews();
    }
}
