package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Conference;

public interface ConferenceRepository extends JpaRepository<Conference, Long>{
	Optional<Conference> findByNameIgnoreCase(String name);
}
