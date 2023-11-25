package com.davidgrifogimeno.optabet.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidgrifogimeno.optabet.models.Statistics;
import com.davidgrifogimeno.optabet.repositories.StatisticsRepository;

@Service
public class StatisticsSerivce {
    
    @Autowired
    private StatisticsRepository statisticsRepository;

    public ArrayList<Statistics> getAllStatistics() {
        return (ArrayList<Statistics>) statisticsRepository.findAll(); 
    }

    public Statistics insertStatistic(Statistics s) {
        // Comprobaciones y creación del match (no "m")
        return statisticsRepository.save(s);
    }

}
