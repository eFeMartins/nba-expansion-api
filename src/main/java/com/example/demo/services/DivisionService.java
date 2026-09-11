package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Division;
import com.example.demo.repositories.DivisionRepository;
import com.example.demo.services.exceptions.ResourceNotFoundException;

@Service
public class DivisionService {

	@Autowired
	private DivisionRepository repository;

	public List<Division> findAll() {
		if (repository.findAll() == null) {
			throw new ResourceNotFoundException("");
		}else {
			return repository.findAll();
		}
		
	}

	public Division findById(Long id) {
		
		return repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(""));
	}
}
