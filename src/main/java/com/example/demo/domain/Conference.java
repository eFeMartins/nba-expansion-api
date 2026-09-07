package com.example.demo.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_conference")
public class Conference implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	@OneToMany(mappedBy = "conference")
	private Set<Division> divisions = new HashSet<Division>();
	
	public Conference() {
		
	}
	public Conference(long id, String name, Set<Division> divisions) {
		this.id = id;
		this.name = name;
		this.divisions = divisions;
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
	public Set<Division> getDivisions() {
		return divisions;
	}
	public void setDivisions(Set<Division> divisions) {
		this.divisions = divisions;
	}
	
	public void addDivision(Division division) {
		divisions.add(division);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conference other = (Conference) obj;
		return Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Conference [name=" + name + "]";
	}
}
