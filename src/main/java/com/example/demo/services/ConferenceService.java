package com.example.demo.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Conference;
import com.example.demo.domain.Division;
import com.example.demo.repositories.ConferenceRepository;
import com.example.demo.services.exceptions.ResourceNotFoundException;

@Service
public class ConferenceService {
	
	@Autowired
	private ConferenceRepository repository;
	
	public List<Conference> findAll() {
		if (repository.findAll() == null) {
			throw new ResourceNotFoundException("Recurso nao encontrado");
		}else {
			return repository.findAll();
		}
		
	}
	
	public Conference findById(Long id) {
		return repository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("Recurso nao encontrado" + id));
	}
	
	// todas as divisoes de uma conferencia
	public Set<Division> findAllDivisionById(Long id) {
		if (repository.findAll() == null) {
			throw new ResourceNotFoundException("Recurso nao encontrado");
		}else {
			Conference conference = repository.findById(id).get();
			return conference.getDivisions();
		}
	
	}


}
