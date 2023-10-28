package com.davidgrifogimeno.optabet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.davidgrifogimeno.optabet.models.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    
    @Query(value = "SELECT total_goals FROM teams t WHERE t.id = :id", nativeQuery = true)
    public int getTotalGoals(
        @Param("id") Long id
    );
}
