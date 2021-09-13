package com.example.taxcalcultor1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class Taxcalcultor1Application {

    public static void main(String[] args) {
        SpringApplication.run(Taxcalcultor1Application.class, args);
    }

}
