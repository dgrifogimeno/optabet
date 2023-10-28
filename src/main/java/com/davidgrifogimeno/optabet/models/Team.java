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
    // column name: total_goals
    private int totalGoals;
    // column name: favour_goals
    private int favourGoals;
    // column name: against_goals
    private int againstGoals;

    public Team(Long id, String name, String code, String form, int totalGoals, int favourGoals, int againstGoals) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.form = form;
        this.totalGoals = totalGoals;
        this.favourGoals = favourGoals;
        this.againstGoals = againstGoals;
    }

    public Team() { }

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

    public int getTotalGoals() {
        return totalGoals;
    }

    public void setTotalGoals(int totalGoals) {
        this.totalGoals = totalGoals;
    }

    public int getFavourGoals() {
        return favourGoals;
    }

    public void setFavourGoals(int favourGoals) {
        this.favourGoals = favourGoals;
    }

    public int getAgainstGoals() {
        return againstGoals;
    }

    public void setAgainstGoals(int againstGoals) {
        this.againstGoals = againstGoals;
    }
}
