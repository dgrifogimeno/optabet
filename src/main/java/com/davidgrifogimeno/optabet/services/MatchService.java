package com.davidgrifogimeno.optabet.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidgrifogimeno.optabet.models.Match;
import com.davidgrifogimeno.optabet.repositories.MatchRepository;

@Service
public class MatchService {
    
    @Autowired
    MatchRepository matchRepository;

    public ArrayList<Match> getAllMatches() {
        return (ArrayList<Match>) matchRepository.findAll();
    }

    public ArrayList<Match> getMatchesByRound(int round) {
        // Comprobaciones
        return matchRepository.getMatchesByRound(round);
    }

    public Optional<Match> getMatchById(Long match_id) {
        return matchRepository.findById(match_id);
    }

    public Match insertMatch(Match m) {
        // Comprobaciones y creación del match (no "m")
        return matchRepository.save(m);
    }
}
