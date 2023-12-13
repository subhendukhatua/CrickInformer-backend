package com.crick.apis.entities;



import java.util.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cricket_matches")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Matches {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int matchId;
	
	private String teamHeading;
	
	private String matchNumberVenue;
	
	private String battingTeam;
	
	private String battingTeamScore;
	
	private String bowlTeam;
	
	private String bowlTeamScore;
	
	private String liveText;
	
	private String matchLink;
	
	private String textComplete;
	
	@Enumerated
	private MatchStatus status;
	
	private Date date= new Date();
	
	
	//set the match status according to textComplete
	public void setMatchStatus() {
		if(textComplete.isBlank()) {
			this.status=MatchStatus.LIVE;
		}else {
			this.status=MatchStatus.COMPLETED;
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
