package com.ifce.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Time;
import com.ifce.br.service.TimeService;

@Controller
public class TimeController {

	@Autowired
	private TimeService ts;
	
	
	@GetMapping("/cadastrar")
	public String cadastrarTime(Time time) {
		
		
		
		return "cadastro";
	}
	@GetMapping("/salvar")
	public String salvarTime(Time time) {
		
		ts.cadastrarTime(time);
		return "salvar";
	}
	
	@GetMapping("/time/listar")
	public ModelAndView listarTime() {
		
		List<Time> time = ts.listarTime();
		ModelAndView mv = new ModelAndView("listar");
		
		mv.addObject("lista", time);
		
		return mv;
	
}
	@RequestMapping("/time/excluir/{id}")
	public ModelAndView excluirTime(@PathVariable Long id) {
		ts.excluirTime(id);
		ModelAndView mv = new ModelAndView ("redirect:/time/listar");
		return mv;
	}
	
	
	
	
}
