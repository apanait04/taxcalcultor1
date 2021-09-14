package com.example.taxcalcultor1.controller;

import com.example.taxcalcultor1.domain.entity.ReviewEntity;
import com.example.taxcalcultor1.domain.model.ReviewDTO;
import com.example.taxcalcultor1.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
@AllArgsConstructor
public class Review {

    private final ReviewService reviewService;

    private final ReviewService service;

    @PostMapping
    public ReviewEntity createReview(@RequestBody ReviewDTO dto) {
        return reviewService.createReview(dto);
    }

    @GetMapping
    public List<ReviewEntity> getAllReviews() {
        return service.getAllReviews();
    }
}
