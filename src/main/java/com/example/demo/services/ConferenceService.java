package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Conference;
import com.example.demo.repositories.ConferenceRepository;
import com.example.demo.services.exceptions.ResourceNotFoundException;

@Service
public class ConferenceService {
	
	@Autowired
	private ConferenceRepository repository;
	
	public List<Conference> findAll() {
		if (repository.findAll() != null) {
			return repository.findAll();
		}else {
			throw new ResourceNotFoundException("Recurso nao encontrado");
		}
		
	}
	
	public Conference findById(Long id) {
		return repository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("Recurso nao encontrado" + id));
	}

}
