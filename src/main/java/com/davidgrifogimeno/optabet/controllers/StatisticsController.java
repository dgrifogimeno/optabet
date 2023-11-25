package com.davidgrifogimeno.optabet.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.davidgrifogimeno.optabet.models.Match;
import com.davidgrifogimeno.optabet.models.Statistics;
import com.davidgrifogimeno.optabet.models.Team;
import com.davidgrifogimeno.optabet.services.MatchService;
import com.davidgrifogimeno.optabet.services.StatisticsSerivce;
import com.davidgrifogimeno.optabet.services.TeamService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping
public class StatisticsController {
    
    @Autowired
    StatisticsSerivce statisticsSerivce;
    @Autowired
    TeamService teamService;
    @Autowired
    MatchService matchService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/statistics")
    public ArrayList<Statistics> getAllStatistics() {
        return statisticsSerivce.getAllStatistics();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/insertStatistic")
    public Statistics inserStatistics(@RequestBody String statsString) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Statistics statistic = objectMapper.readValue(statsString, Statistics.class);
            Optional<Team> optionalTeam = teamService.getTeamById(statistic.getTeamId());
            if (optionalTeam.isPresent()) {
                Team team = optionalTeam.get();
                statistic.setTeam(team);
            }
            Optional<Match> optionalMatch = matchService.getMatchById(statistic.getMatchId());
            if (optionalMatch.isPresent()) {
                Match match = optionalMatch.get();
                statistic.setMatch(match);
            }
            return this.statisticsSerivce.insertStatistic(statistic);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;        
    }
}
