package com.faculdade.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.faculdade.model.Carro;
import com.faculdade.service.CarroService;

@Controller
public class CarroController {

	@Autowired
	private CarroService service;

	@GetMapping("/carro/")
	public ModelAndView findAll() {

		ModelAndView mv = new ModelAndView("/carro");
		mv.addObject("carros", service.findAll());

		return mv;
	}

	@GetMapping("/carro/add")
	public ModelAndView add(Carro carro) {

		ModelAndView mv = new ModelAndView("/carroAdd");
		mv.addObject("carro", carro);

		return mv;
	}

	@GetMapping("/carro/edit/{id}")
	public ModelAndView edit(@PathVariable("id") int id) {

		return add(service.findOne(id));
	}

	@GetMapping("/carro/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {

		service.delete(id);

		return findAll();
	}

	@PostMapping("/carro/save")
	public ModelAndView save(@Valid Carro carro, BindingResult result) {

		if (result.hasErrors()) {
			return add(carro);
		}

		service.save(carro);

		return findAll();
	}
}

