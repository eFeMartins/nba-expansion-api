package com.example.demo.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Division {
	private long id;
	private String name;
	private Conference conference;
	
	private Set<Team> teams = new HashSet<Team>();
	
	public Division() {
		
	}
	public Division(long id, String name, Conference conference, Set<Team> teams) {
		this.id = id;
		this.name = name;
		this.conference = conference;
		this.teams = teams;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Conference getConference() {
		return conference;
	}
	public void setConference(Conference conference) {
		this.conference = conference;
	}
	public Set<Team> getTeams() {
		return teams;
	}
	public void setTeams(Set<Team> teams) {
		this.teams = teams;
	}
	
	public void addTeam(Team team) {
		teams.add(team);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(teams);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Division other = (Division) obj;
		return Objects.equals(teams, other.teams);
	}
	@Override
	public String toString() {
		return "Division [name=" + name + ", conference=" + conference + "]";
	}
	
	
}
