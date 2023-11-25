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
import com.davidgrifogimeno.optabet.models.Team;
import com.davidgrifogimeno.optabet.services.MatchService;

@RestController
@RequestMapping
public class MatchController {
    
    @Autowired
    MatchService matchService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/matches")
    public ArrayList<Match> getAllMatches() {
        return matchService.getAllMatches();
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/matches/round")
    public ArrayList<Match> getMatchesByRound(@RequestParam int r) {
        return matchService.getMatchesByRound(r);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/match/id")
    public Optional<Match> getMatchById(@RequestParam Long match_id) {
        return matchService.getMatchById(match_id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/insertMatch")
    public Match insertMatch(@RequestBody Match m) {
        return this.matchService.insertMatch(m);
    }
}
