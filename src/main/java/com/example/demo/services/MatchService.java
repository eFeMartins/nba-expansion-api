package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Match;
import com.example.demo.repositories.MatchRepository;
import com.example.demo.services.exceptions.ResourceNotFoundException;

@Service
public class MatchService {
	@Autowired
	private MatchRepository repository;

	public List<Match> findAll() {
		if (repository.findAll() == null) {
			throw new ResourceNotFoundException("");
		}else {
			return repository.findAll();
		}
		
	}

	public Match findById(Long id) {
		
		return repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(""));
	}
}
