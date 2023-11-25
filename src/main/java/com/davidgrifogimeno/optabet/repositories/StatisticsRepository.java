package com.davidgrifogimeno.optabet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.davidgrifogimeno.optabet.models.Statistics;

public interface StatisticsRepository extends JpaRepository<Statistics, Long> {
    
}
