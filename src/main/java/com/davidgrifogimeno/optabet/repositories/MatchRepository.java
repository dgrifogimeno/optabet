package com.davidgrifogimeno.optabet.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.davidgrifogimeno.optabet.models.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {

    @Query(value = "SELECT * FROM match m WHERE m.round = :round", nativeQuery = true)
    public ArrayList<Match> getMatchesByRound(
        @Param("round") int round
    );
    
}
