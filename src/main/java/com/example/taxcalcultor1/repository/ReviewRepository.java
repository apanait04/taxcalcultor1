package com.example.taxcalcultor1.repository;

import com.example.taxcalcultor1.domain.entity.ReviewEntity;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableAutoConfiguration
@ComponentScan({"com.example"})
public interface ReviewRepository extends JpaRepository<ReviewEntity, Long> {
}