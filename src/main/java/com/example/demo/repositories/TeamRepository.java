package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Team;

public interface TeamRepository extends JpaRepository<Team, Long>{

}
