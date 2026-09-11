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

}
