package com.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faculdade.model.Funcionario;

@Repository
public interface FuncionarioRepository  extends JpaRepository<Funcionario, Integer> { } 
