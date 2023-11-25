package com.davidgrifogimeno.optabet.models;

import jakarta.persistence.*;

@Entity
@Table(name = "teams")
public class Team {
    
    @Id
    private Long id;
    private String name;
    private String code;
    private String form;
    private int wins_local_games;
    private int draws_local_games;
    private int loses_local_games;
    private int wins_visitor_games;
    private int draws_visitor_games;
    private int loses_visitor_games;
    private int favour_local_goals;
    private int favour_visitor_goals;
    private int against_local_goals;
    private int against_visitor_goals;
    private int favour_goals_0_15;
    private int favour_goals_16_30;
    private int favour_goals_31_45;
    private int favour_goals_46_60;
    private int favour_goals_61_75;
    private int favour_goals_76_90;
    private int against_goals_0_15;
    private int against_goals_16_30;
    private int against_goals_31_45;
    private int against_goals_46_60;
    private int against_goals_61_75;
    private int against_goals_76_90;
    private int local_clean_sheets;
    private int visitor_clean_sheets;
    private int local_failed_to_score;
    private int visitor_failed_to_score;
    private int total_yellow_cards;
    private int total_red_cards;
    
    public Team() {}

    public Team(Long id, String name, String code, String form, int wins_local_games, int draws_local_games,
            int loses_local_games, int wins_visitor_games, int draws_visitor_games, int loses_visitor_games,
            int favour_local_goals, int favour_visitor_goals, int against_local_goals, int against_visitor_goals,
            int favour_goals_0_15, int favour_goals_16_30, int favour_goals_31_45, int favour_goals_46_60,
            int favour_goals_61_75, int favour_goals_76_90, int against_goals_0_15, int against_goals_16_30, 
            int against_goals_31_45, int against_goals_46_60, int against_goals_61_75, int against_goals_76_90, 
            int local_clean_sheets, int visitor_clean_sheets, int local_failed_to_score, int visitor_failed_to_score, 
            int total_yellow_cards, int total_red_cards) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.form = form;
        this.wins_local_games = wins_local_games;
        this.draws_local_games = draws_local_games;
        this.loses_local_games = loses_local_games;
        this.wins_visitor_games = wins_visitor_games;
        this.draws_visitor_games = draws_visitor_games;
        this.loses_visitor_games = loses_visitor_games;
        this.favour_local_goals = favour_local_goals;
        this.favour_visitor_goals = favour_visitor_goals;
        this.against_local_goals = against_local_goals;
        this.against_visitor_goals = against_visitor_goals;
        this.favour_goals_0_15 = favour_goals_0_15;
        this.favour_goals_16_30 = favour_goals_16_30;
        this.favour_goals_31_45 = favour_goals_31_45;
        this.favour_goals_46_60 = favour_goals_46_60;
        this.favour_goals_61_75 = favour_goals_61_75;
        this.favour_goals_76_90 = favour_goals_76_90;
        this.against_goals_0_15 = against_goals_0_15;
        this.against_goals_16_30 = against_goals_16_30;
        this.against_goals_31_45 = against_goals_31_45;
        this.against_goals_46_60 = against_goals_46_60;
        this.against_goals_61_75 = against_goals_61_75;
        this.against_goals_76_90 = against_goals_76_90;
        this.local_clean_sheets = local_clean_sheets;
        this.visitor_clean_sheets = visitor_clean_sheets;
        this.local_failed_to_score = local_failed_to_score;
        this.visitor_failed_to_score = visitor_failed_to_score;
        this.total_yellow_cards = total_yellow_cards;
        this.total_red_cards = total_red_cards;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getWins_local_games() {
        return wins_local_games;
    }

    public void setWins_local_games(int wins_local_games) {
        this.wins_local_games = wins_local_games;
    }

    public int getDraws_local_games() {
        return draws_local_games;
    }

    public void setDraws_local_games(int draws_local_games) {
        this.draws_local_games = draws_local_games;
    }

    public int getLoses_local_games() {
        return loses_local_games;
    }

    public void setLoses_local_games(int loses_local_games) {
        this.loses_local_games = loses_local_games;
    }

    public int getWins_visitor_games() {
        return wins_visitor_games;
    }

    public void setWins_visitor_games(int wins_visitor_games) {
        this.wins_visitor_games = wins_visitor_games;
    }

    public int getDraws_visitor_games() {
        return draws_visitor_games;
    }

    public void setDraws_visitor_games(int draws_visitor_games) {
        this.draws_visitor_games = draws_visitor_games;
    }

    public int getLoses_visitor_games() {
        return loses_visitor_games;
    }

    public void setLoses_visitor_games(int loses_visitor_games) {
        this.loses_visitor_games = loses_visitor_games;
    }

    public int getFavour_local_goals() {
        return favour_local_goals;
    }

    public void setFavour_local_goals(int favour_local_goals) {
        this.favour_local_goals = favour_local_goals;
    }

    public int getFavour_visitor_goals() {
        return favour_visitor_goals;
    }

    public void setFavour_visitor_goals(int favour_visitor_goals) {
        this.favour_visitor_goals = favour_visitor_goals;
    }

    public int getAgainst_local_goals() {
        return against_local_goals;
    }

    public void setAgainst_local_goals(int against_local_goals) {
        this.against_local_goals = against_local_goals;
    }

    public int getAgainst_visitor_goals() {
        return against_visitor_goals;
    }

    public void setAgainst_visitor_goals(int against_visitor_goals) {
        this.against_visitor_goals = against_visitor_goals;
    }

    public int getFavour_goals_0_15() {
        return favour_goals_0_15;
    }

    public void setFavour_goals_0_15(int favour_goals_0_15) {
        this.favour_goals_0_15 = favour_goals_0_15;
    }

    public int getFavour_goals_16_30() {
        return favour_goals_16_30;
    }

    public void setFavour_goals_16_30(int favour_goals_16_30) {
        this.favour_goals_16_30 = favour_goals_16_30;
    }

    public int getFavour_goals_31_45() {
        return favour_goals_31_45;
    }

    public void setFavour_goals_31_45(int favour_goals_31_45) {
        this.favour_goals_31_45 = favour_goals_31_45;
    }

    public int getFavour_goals_46_60() {
        return favour_goals_46_60;
    }

    public void setFavour_goals_46_60(int favour_goals_46_60) {
        this.favour_goals_46_60 = favour_goals_46_60;
    }

    public int getFavour_goals_61_75() {
        return favour_goals_61_75;
    }

    public void setFavour_goals_61_75(int favour_goals_61_75) {
        this.favour_goals_61_75 = favour_goals_61_75;
    }

    public int getFavour_goals_76_90() {
        return favour_goals_76_90;
    }

    public void setFavour_goals_76_90(int favour_goals_76_90) {
        this.favour_goals_76_90 = favour_goals_76_90;
    }

    public int getAgainst_goals_0_15() {
        return against_goals_0_15;
    }

    public void setAgainst_goals_0_15(int against_goals_0_15) {
        this.against_goals_0_15 = against_goals_0_15;
    }

    public int getAgainst_goals_16_30() {
        return against_goals_16_30;
    }

    public void setAgainst_goals_16_30(int against_goals_16_30) {
        this.against_goals_16_30 = against_goals_16_30;
    }

    public int getAgainst_goals_31_45() {
        return against_goals_31_45;
    }

    public void setAgainst_goals_31_45(int against_goals_31_45) {
        this.against_goals_31_45 = against_goals_31_45;
    }

    public int getAgainst_goals_46_60() {
        return against_goals_46_60;
    }

    public void setAgainst_goals_46_60(int against_goals_46_60) {
        this.against_goals_46_60 = against_goals_46_60;
    }

    public int getAgainst_goals_61_75() {
        return against_goals_61_75;
    }

    public void setAgainst_goals_61_75(int against_goals_61_75) {
        this.against_goals_61_75 = against_goals_61_75;
    }

    public int getAgainst_goals_76_90() {
        return against_goals_76_90;
    }

    public void setAgainst_goals_76_90(int against_goals_76_90) {
        this.against_goals_76_90 = against_goals_76_90;
    }

    public int getLocal_clean_sheets() {
        return local_clean_sheets;
    }

    public void setLocal_clean_sheets(int local_clean_sheets) {
        this.local_clean_sheets = local_clean_sheets;
    }

    public int getVisitor_clean_sheets() {
        return visitor_clean_sheets;
    }

    public void setVisitor_clean_sheets(int visitor_clean_sheets) {
        this.visitor_clean_sheets = visitor_clean_sheets;
    }

    public int getLocal_failed_to_score() {
        return local_failed_to_score;
    }

    public void setLocal_failed_to_score(int local_failed_to_score) {
        this.local_failed_to_score = local_failed_to_score;
    }

    public int getVisitor_failed_to_score() {
        return visitor_failed_to_score;
    }

    public void setVisitor_failed_to_score(int visitor_failed_to_score) {
        this.visitor_failed_to_score = visitor_failed_to_score;
    }

    public int getTotal_yellow_cards() {
        return total_yellow_cards;
    }

    public void setTotal_yellow_cards(int total_yellow_cards) {
        this.total_yellow_cards = total_yellow_cards;
    }

    public int gettotal_red_cards() {
        return total_red_cards;
    }

    public void settotal_red_cards(int total_red_cards) {
        this.total_red_cards = total_red_cards;
    }    
}
