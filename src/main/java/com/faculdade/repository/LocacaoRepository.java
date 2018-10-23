package com.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faculdade.model.Locacao;

@Repository
public interface LocacaoRepository  extends JpaRepository<Locacao, Integer> { } 
