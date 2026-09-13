package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Team;
import com.example.demo.repositories.TeamRepository;
import com.example.demo.services.exceptions.ResourceNotFoundException;

@Service
public class TeamService {

	@Autowired
	private TeamRepository repository;

	public List<Team> findAll() {
		if (repository.findAll() == null) {
			throw new ResourceNotFoundException("");
		}else {
			return repository.findAll();
		}
	}

	public Team findById(Long id) {
		
		return repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(""));
	}
	
	// todos os times de uma divisao especifica
	// Ex: todos os times da divisao do pacifico
	public List<Team> findAllByDivision(Long id) {
		if (repository.findAll() == null) {
			throw new ResourceNotFoundException("");
		}else {
			List<Team> list = repository.findAll();
			return list.stream()
			.filter(x -> x.getDivision().getId() == id)
			.toList();
		}
	}
	
	// encontrar um time pelo seu nome
	public Team findByName(String name) {
	    return repository.findAll().stream()
	            .filter(x -> x.getName().equals(name))
	            .findFirst()
	            .orElseThrow(() -> new ResourceNotFoundException("Team not found: " + name));
	}
}
