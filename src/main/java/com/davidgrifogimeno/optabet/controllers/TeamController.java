package com.davidgrifogimeno.optabet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.davidgrifogimeno.optabet.models.Team;
import com.davidgrifogimeno.optabet.services.TeamService;

import java.util.ArrayList;

@RestController
@RequestMapping
public class TeamController {
    
    @Autowired
    TeamService teamService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping()
    public ArrayList<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/totalGoals")
    public int getTotalGoals(@RequestParam (name = "teamId") Long teamId) {
        return teamService.getTotalGoals(teamId);
    }
}
