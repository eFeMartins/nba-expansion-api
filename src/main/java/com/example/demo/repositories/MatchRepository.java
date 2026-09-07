package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Match;

public interface MatchRepository extends JpaRepository<Match, Long>{

}
