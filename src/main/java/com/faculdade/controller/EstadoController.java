package com.faculdade.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.faculdade.model.Estado;
import com.faculdade.service.EstadoService;

@Controller
public class EstadoController {

	@Autowired
	private EstadoService service;

	@GetMapping("/estado/")
	public ModelAndView findAll() {

		ModelAndView mv = new ModelAndView("/estado");
		mv.addObject("estados", service.findAll());

		return mv;
	}

	@GetMapping("/estado/add")
	public ModelAndView add(Estado estado) {

		ModelAndView mv = new ModelAndView("/estadoAdd");
		mv.addObject("estado", estado);

		return mv;
	}

	@GetMapping("/estado/edit/{id}")
	public ModelAndView edit(@PathVariable("id") int id) {

		return add(service.findOne(id));
	}

	@GetMapping("/estado/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {

		service.delete(id);

		return findAll();
	}

	@PostMapping("/estado/save")
	public ModelAndView save(@Valid Estado estado, BindingResult result) {

		if (result.hasErrors()) {
			return add(estado);
		}

		service.save(estado);

		return findAll();
	}
}

