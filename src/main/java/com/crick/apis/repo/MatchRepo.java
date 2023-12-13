package com.crick.apis.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crick.apis.entities.Matches;

public interface MatchRepo extends JpaRepository<Matches, Integer>{
	Optional<Matches>findByTeamHeading(String teamHeading);
	
	

}
