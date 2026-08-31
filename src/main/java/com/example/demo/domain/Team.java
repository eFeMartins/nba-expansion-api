package com.example.demo.domain;

import java.util.Objects;

public class Team {
	private long id;
	private String name;
	private String city;
	private Integer wins;
	private Integer losses;
	
	private Division division;
	
	public Team() {
		
	}
	public Team(long id, String name, String city, Integer wins, Integer losses, Division division) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.wins = wins;
		this.losses = losses;
		this.division = division;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getWins() {
		return wins;
	}
	public void setWins(Integer wins) {
		this.wins = wins;
	}
	public Integer getLosses() {
		return losses;
	}
	public void setLosses(Integer losses) {
		this.losses = losses;
	}
	public Division getDivision() {
		return division;
	}
	public void setDivision(Division division) {
		this.division = division;
	}
	
	public void addWin() {
		
	}
	
	public void addLoss() {
		
	}
	public Double getWinPercentage() {
		return (double) ((wins / 62) * 100);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(city, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		return Objects.equals(city, other.city) && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Team [name=" + name + ", city=" + city + ", wins=" + wins + ", losses=" + losses + "]";
	}
	
	
	
}
