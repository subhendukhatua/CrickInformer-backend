package com.crick.apis.service;

import java.util.List;
import java.util.Map;

import com.crick.apis.entities.Matches;

public interface MatchService {
	
	//get all matches
	
	List<Matches>getAllMatches();
	
	//get live matches
	List<Matches>getLiveMatches();
	
	//for point table
	List<List<String>>getPointTable();
	
	

}
