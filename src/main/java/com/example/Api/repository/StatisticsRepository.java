package com.example.Api.repository;

import com.example.Api.entity.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatisticsRepository extends JpaRepository<Statistics, Long> {
    // Additional query methods can be defined here if needed
}
