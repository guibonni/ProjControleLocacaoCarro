package com.faculdade.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.faculdade.model.Locacao;
import com.faculdade.repository.LocacaoRepository;

@Service
public class LocacaoService {

	@Autowired
	private LocacaoRepository repository;

	public List<Locacao> findAll() {
		return repository.findAll();
	}

	public Locacao findOne(int id) {
		return repository.findOne(id);
	}

	public Locacao save(Locacao post) {
		return repository.saveAndFlush(post);
	}

	public void delete(int id) {
		repository.delete(id);
	}
}
