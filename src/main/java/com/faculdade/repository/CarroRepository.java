package com.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faculdade.model.Carro;

@Repository
public interface CarroRepository  extends JpaRepository<Carro, Integer> { } 
