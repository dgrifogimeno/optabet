package com.davidgrifogimeno.optabet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidgrifogimeno.optabet.repositories.TeamRepository;
import com.davidgrifogimeno.optabet.models.Team;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TeamService {
    
    @Autowired
    TeamRepository teamRepository;

    public ArrayList<Team> getAllTeams() {
        return (ArrayList<Team>) teamRepository.findAll();
    }

    public Optional<Team> getTeamById(Long team_id) {
        return teamRepository.findById(team_id);
    }

    public Team insertTeam(Team t) {
        // Team control
        if (!(t.getName() instanceof String)) return null;
        if (!(t.getCode() instanceof String)) return null;
        /*Team team = new Team(t.getId(), t.getName(), t.getCode(), t.getForm(), t.getWins_local_games(), t.getDraws_local_games(), t.getLoses_local_games(), t.getWins_visitor_games(), t.getDraws_visitor_games(), t.getLoses_visitor_games(), t.getFavour_local_goals(), t.getFavour_visitor_goals(), t.getAgainst_local_goals(), t.getAgainst_visitor_goals(), t.getFavour_goals_0_15(), t.getFavour_goals_16_30(), t.getFavour_goals_31_45(), t.getFavour_goals_46_60(), t.getFavour_goals_61_75(), t.getFavour_goals_76_90(), t.getAgainst_goals_0_15(), t.getAgainst_goals_16_30(), t.getAgainst_goals_31_45(), t.getAgainst_goals_46_60(), t.getAgainst_goals_61_75(), t.getAgainst_goals_76_90(), t.getLocal_clean_sheets(), t.getVisitor_clean_sheets(), t.getLocal_failed_to_score(), t.getVisitor_failed_to_score(), t.getTotal_yellow_cards(), t.gettotal_red_cards());*/
        return teamRepository.save(t);
    }

}
