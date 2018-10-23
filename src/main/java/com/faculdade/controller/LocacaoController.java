package com.faculdade.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.faculdade.model.Locacao;
import com.faculdade.service.LocacaoService;
import com.faculdade.service.CarroService;
import com.faculdade.service.FuncionarioService;

@Controller
public class LocacaoController {

	@Autowired
	private LocacaoService service;
	@Autowired
	private CarroService serviceCarro;
	@Autowired
	private FuncionarioService serviceFuncionario;

	@GetMapping("/locacao/")
	public ModelAndView findAll() {

		ModelAndView mv = new ModelAndView("/locacao");
		mv.addObject("locacoes", service.findAll());

		return mv;
	}

	@GetMapping("/locacao/add")
	public ModelAndView add(Locacao locacao) {

		ModelAndView mv = new ModelAndView("/locacaoAdd");
		mv.addObject("locacao", locacao);
		mv.addObject("carros", serviceCarro.findAll());
		mv.addObject("funcionarios", serviceFuncionario.findAll());

		return mv;
	}

	@GetMapping("/locacao/edit/{id}")
	public ModelAndView edit(@PathVariable("id") int id) {

		return add(service.findOne(id));
	}

	@GetMapping("/locacao/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {

		service.delete(id);

		return findAll();
	}

	@PostMapping("/locacao/save")
	public ModelAndView save(@Valid Locacao locacao, BindingResult result) {

		if (result.hasErrors()) {
			return add(locacao);
		}

		service.save(locacao);

		return findAll();
	}
}