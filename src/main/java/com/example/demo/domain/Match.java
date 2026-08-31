package com.example.demo.domain;

import java.util.Objects;

public class Match {
	private long id;
	private Team homeTeam;
	private Team awayTeam;
	private Integer homeScore;
	private Integer awayScore;
	private  MatchStatus status;
	
	public Match() {
		
	}
	public Match(long id, Team homeTeam, Team awayTeam, Integer homeScore, Integer awayScore, MatchStatus status) {
		this.id = id;
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.homeScore = homeScore;
		this.awayScore = awayScore;
		this.status = status;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Team getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	public Team getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}
	public Integer getHomeScore() {
		return homeScore;
	}
	public void setHomeScore(Integer homeScore) {
		this.homeScore = homeScore;
	}
	public Integer getAwayScore() {
		return awayScore;
	}
	public void setAwayScore(Integer awayScore) {
		this.awayScore = awayScore;
	}
	public MatchStatus getStatus() {
		return status;
	}
	public void setStatus(MatchStatus status) {
		this.status = status;
	}
	
	public void finisMatch(Integer homeScore, Integer awayScore) {
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(awayScore, awayTeam);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Match other = (Match) obj;
		return Objects.equals(awayScore, other.awayScore) && Objects.equals(awayTeam, other.awayTeam);
	}
	
	@Override
	public String toString() {
		return "Match [homeTeam=" + homeTeam + ", awayTeam=" + awayTeam + ", homeScore=" + homeScore + ", awayScore="
				+ awayScore + ", status=" + status + "]";
	}
	
	
	
}
