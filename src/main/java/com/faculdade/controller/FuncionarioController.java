package com.faculdade.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.faculdade.model.Funcionario;
import com.faculdade.service.FuncionarioService;

@Controller
public class FuncionarioController {

	@Autowired
	private FuncionarioService service;

	@GetMapping("/funcionario/")
	public ModelAndView findAll() {

		ModelAndView mv = new ModelAndView("/funcionario");
		mv.addObject("funcionarios", service.findAll());

		return mv;
	}

	@GetMapping("/funcionario/add")
	public ModelAndView add(Funcionario funcionario) {

		ModelAndView mv = new ModelAndView("/funcionarioAdd");
		mv.addObject("funcionario", funcionario);

		return mv;
	}

	@GetMapping("/funcionario/edit/{id}")
	public ModelAndView edit(@PathVariable("id") int id) {

		return add(service.findOne(id));
	}

	@GetMapping("/funcionario/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {

		service.delete(id);

		return findAll();
	}

	@PostMapping("/funcionario/save")
	public ModelAndView save(@Valid Funcionario funcionario, BindingResult result) {

		if (result.hasErrors()) {
			return add(funcionario);
		}

		service.save(funcionario);

		return findAll();
	}
}