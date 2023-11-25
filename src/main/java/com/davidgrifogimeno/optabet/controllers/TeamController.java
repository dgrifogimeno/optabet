package com.davidgrifogimeno.optabet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.davidgrifogimeno.optabet.models.Team;
import com.davidgrifogimeno.optabet.services.TeamService;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping
public class TeamController {
    
    @Autowired
    TeamService teamService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/teams")
    public ArrayList<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/team/id")
    public Optional<Team> getTeamById(@RequestParam Long team_id) {
        return teamService.getTeamById(team_id);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/insertTeam")
    public Team insertTeam(@RequestBody Team t) {
        return this.teamService.insertTeam(t);
    }
}
