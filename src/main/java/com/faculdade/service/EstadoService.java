package com.faculdade.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.faculdade.model.Estado;
import com.faculdade.repository.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repository;

	public List<Estado> findAll() {
		return repository.findAll();
	}

	public Estado findOne(int id) {
		return repository.findOne(id);
	}

	public Estado save(Estado post) {
		return repository.saveAndFlush(post);
	}

	public void delete(int id) {
		repository.delete(id);
	}
}
