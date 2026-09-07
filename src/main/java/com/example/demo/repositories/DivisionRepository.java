package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Division;

public interface DivisionRepository extends JpaRepository<Division, Long>{

}
