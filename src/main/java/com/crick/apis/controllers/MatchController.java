package com.crick.apis.controllers;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.apis.entities.Matches;
import com.crick.apis.service.MatchService;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {
	
	private MatchService matchService;
	
	public MatchController(MatchService matchService) {
		this.matchService=matchService;
	}
	
	@GetMapping("/livescore")
	public ResponseEntity<List<Matches>>getLiveMatches(){
		return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
		
	}
	
	@GetMapping("/allMatch")
	public ResponseEntity<List<Matches>>getAllMatches(){
		return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
	}
	
	@GetMapping("/point-table")
	public ResponseEntity<?>getPointTable(){
		return new ResponseEntity<>(matchService.getPointTable(),HttpStatus.OK);
	}

}
