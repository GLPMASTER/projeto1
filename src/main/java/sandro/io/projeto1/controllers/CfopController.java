package sandro.io.projeto1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sandro.io.projeto1.repository.CfopRepository;

@Controller
public class CfopController {
	
	private CfopRepository cfopRepository;
	
	public CfopController(CfopRepository cfopRepository) {
		this.cfopRepository = cfopRepository;
	}
	
	@RequestMapping("/cfop")
	public String getCfop(Model model) {
		model.addAttribute("cfopList", this.cfopRepository.findAll());
		
		return "cfop";
	}

}
