package com.tmdt.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistryController {
	@GetMapping("/registry")
	public String showRegistryForm() {
		return "registry";
	}
	
	@PostMapping("/registry")
	public void doRegistry() {
		
	}
}
