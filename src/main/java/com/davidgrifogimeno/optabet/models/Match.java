package com.davidgrifogimeno.optabet.models;

import jakarta.persistence.*;

@Entity
@Table(name = "match")
public class Match {
    
    @Id
    private Long id;
    private String status;
    private int round;
    private Long home_team_id;
    private String home_team_name;
    private Long away_team_id;
    private String away_team_name;
    private int home_team_goals;
    private int away_team_goals;
    private int home_halftime_goals;
    private int away_halftime_goals;
    private int home_fulltime_goals;
    private int away_fulltime_goals;

    public Match() {}

    public Match(Long id, String status, int round, Long home_team_id, String home_team_name, Long away_team_id,
            String away_team_name, int home_team_goals, int away_team_goals, int home_halftime_goals,
            int away_halftime_goals, int home_fulltime_goals, int away_fulltime_goals) {
        this.id = id;
        this.status = status;
        this.round = round;
        this.home_team_id = home_team_id;
        this.home_team_name = home_team_name;
        this.away_team_id = away_team_id;
        this.away_team_name = away_team_name;
        this.home_team_goals = home_team_goals;
        this.away_team_goals = away_team_goals;
        this.home_halftime_goals = home_halftime_goals;
        this.away_halftime_goals = away_halftime_goals;
        this.home_fulltime_goals = home_fulltime_goals;
        this.away_fulltime_goals = away_fulltime_goals;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public Long getHome_team_id() {
        return home_team_id;
    }

    public void setHome_team_id(Long home_team_id) {
        this.home_team_id = home_team_id;
    }

    public String getHome_team_name() {
        return home_team_name;
    }

    public void setHome_team_name(String home_team_name) {
        this.home_team_name = home_team_name;
    }

    public Long getAway_team_id() {
        return away_team_id;
    }

    public void setAway_team_id(Long away_team_id) {
        this.away_team_id = away_team_id;
    }

    public String getAway_team_name() {
        return away_team_name;
    }

    public void setAway_team_name(String away_team_name) {
        this.away_team_name = away_team_name;
    }

    public int getHome_team_goals() {
        return home_team_goals;
    }

    public void setHome_team_goals(int home_team_goals) {
        this.home_team_goals = home_team_goals;
    }

    public int getAway_team_goals() {
        return away_team_goals;
    }

    public void setAway_team_goals(int away_team_goals) {
        this.away_team_goals = away_team_goals;
    }

    public int getHome_halftime_goals() {
        return home_halftime_goals;
    }

    public void setHome_halftime_goals(int home_halftime_goals) {
        this.home_halftime_goals = home_halftime_goals;
    }

    public int getAway_halftime_goals() {
        return away_halftime_goals;
    }

    public void setAway_halftime_goals(int away_halftime_goals) {
        this.away_halftime_goals = away_halftime_goals;
    }

    public int getHome_fulltime_goals() {
        return home_fulltime_goals;
    }

    public void setHome_fulltime_goals(int home_fulltime_goals) {
        this.home_fulltime_goals = home_fulltime_goals;
    }

    public int getAway_fulltime_goals() {
        return away_fulltime_goals;
    }

    public void setAway_fulltime_goals(int away_fulltime_goals) {
        this.away_fulltime_goals = away_fulltime_goals;
    }

    
}
