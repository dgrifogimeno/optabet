package com.davidgrifogimeno.optabet.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
@Table(name = "statistics")
public class Statistics {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "team", nullable = false)
    private Team team;
    
    @ManyToOne
    @JoinColumn(name = "match", nullable = false)
    private Match match;

    private int shots_on_goal;
    private int total_shots;
    private int shots_insidebox;
    private int shots_outsidebox;
    private int fouls;
    private int corner_kicks;
    private int offsides;
    private String ball_possesion;
    private int yellow_cards;
    private int red_cards;
    private int goalkeeper_saves;
    private int total_passes;
    private int passes_accurate;
    private String passes_percentage;

    @JsonProperty("team_id")
    private Long teamId;

    @JsonProperty("match_id")
    private Long matchId;

    public Statistics() {}

    public Statistics(Long id, Team team, Match match, int shots_on_goal, int total_shots, int shots_insidebox,
            int shots_outsidebox, int fouls, int corner_kicks, int offsides, String ball_possesion, int yellow_cards,
            int red_cards, int goalkeeper_saves, int total_passes, int passes_accurate, String passes_percentage) {
        this.id = id;
        this.team = team;
        this.match = match;
        this.shots_on_goal = shots_on_goal;
        this.total_shots = total_shots;
        this.shots_insidebox = shots_insidebox;
        this.shots_outsidebox = shots_outsidebox;
        this.fouls = fouls;
        this.corner_kicks = corner_kicks;
        this.offsides = offsides;
        this.ball_possesion = ball_possesion;
        this.yellow_cards = yellow_cards;
        this.red_cards = red_cards;
        this.goalkeeper_saves = goalkeeper_saves;
        this.total_passes = total_passes;
        this.passes_accurate = passes_accurate;
        this.passes_percentage = passes_percentage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team t) {
        this.team = t;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public int getShots_on_goal() {
        return shots_on_goal;
    }

    public void setShots_on_goal(int shots_on_goal) {
        this.shots_on_goal = shots_on_goal;
    }

    public int getTotal_shots() {
        return total_shots;
    }

    public void setTotal_shots(int total_shots) {
        this.total_shots = total_shots;
    }

    public int getShots_insidebox() {
        return shots_insidebox;
    }

    public void setShots_insidebox(int shots_insidebox) {
        this.shots_insidebox = shots_insidebox;
    }

    public int getShots_outsidebox() {
        return shots_outsidebox;
    }

    public void setShots_outsidebox(int shots_outsidebox) {
        this.shots_outsidebox = shots_outsidebox;
    }

    public int getFouls() {
        return fouls;
    }

    public void setFouls(int fouls) {
        this.fouls = fouls;
    }

    public int getCorner_kicks() {
        return corner_kicks;
    }

    public void setCorner_kicks(int corner_kicks) {
        this.corner_kicks = corner_kicks;
    }

    public int getOffsides() {
        return offsides;
    }

    public void setOffsides(int offsides) {
        this.offsides = offsides;
    }

    public String getBall_possesion() {
        return ball_possesion;
    }

    public void setBall_possesion(String ball_possesion) {
        this.ball_possesion = ball_possesion;
    }

    public int getYellow_cards() {
        return yellow_cards;
    }

    public void setYellow_cards(int yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    public int getRed_cards() {
        return red_cards;
    }

    public void setRed_cards(int red_cards) {
        this.red_cards = red_cards;
    }

    public int getGoalkeeper_saves() {
        return goalkeeper_saves;
    }

    public void setGoalkeeper_saves(int goalkeeper_saves) {
        this.goalkeeper_saves = goalkeeper_saves;
    }

    public int getTotal_passes() {
        return total_passes;
    }

    public void setTotal_passes(int total_passes) {
        this.total_passes = total_passes;
    }

    public int getPasses_accurate() {
        return passes_accurate;
    }

    public void setPasses_accurate(int passes_accurate) {
        this.passes_accurate = passes_accurate;
    }

    public String getPasses_percentage() {
        return passes_percentage;
    }

    public void setPasses_percentage(String passes_percentage) {
        this.passes_percentage = passes_percentage;
    }

    // Getter y setter para el nuevo campo
    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }
}
