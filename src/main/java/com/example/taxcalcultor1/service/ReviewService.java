package com.example.taxcalcultor1.service;

import com.example.taxcalcultor1.domain.model.ReviewDTO;
import com.example.taxcalcultor1.repository.ReviewRepository;
import com.example.taxcalcultor1.domain.entity.ReviewEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.List;

@Builder
@Service
@AllArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;

    private final ReviewRepository repository;

    public List<ReviewEntity> getAllReviews() {
        return repository.findAll();
    }

    public ReviewEntity createReview(ReviewDTO dto) {
        return reviewRepository.save(ReviewEntity.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .message(dto.getMessage())
                .subject(dto.getSubject())
                .build());
    }
}

