package com.davidgrifogimeno.optabet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidgrifogimeno.optabet.repositories.TeamRepository;
import com.davidgrifogimeno.optabet.models.Team;

import java.util.ArrayList;

@Service
public class TeamService {
    
    @Autowired
    TeamRepository teamRepository;

    public ArrayList<Team> getAllTeams() {
        return (ArrayList<Team>) teamRepository.findAll();
    }

    public int getTotalGoals(Long teamId) {
        return teamRepository.getTotalGoals(teamId);
    }
}
