package com.tmdt.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tmdt.app.model.Role;
import com.tmdt.app.model.User;
import com.tmdt.app.service.RegistryService;
import com.tmdt.app.service.impl.RegistryServiceImpl;

@Controller
public class RegistryController {
	@Autowired
	private RegistryService service;

	@GetMapping("/registry")
	public String showRegistryForm() {
		return "employee-register";
	}

	@PostMapping("/registry")
	@ResponseBody
	public String doRegistry(@ModelAttribute User user) {
		User us = service.doRegistry(user);
		Role role = new Role();
		role.setId(2L);
		user.setRole(role);
		return us != null ? "Registry success" : "Registry failed";
	}

	@PostMapping("/checkMail")
	@ResponseBody
	public String isExistingMail(@RequestParam String email) {
		boolean isExist = ((RegistryServiceImpl) service).isEmailExist(email);
		if (isExist) {
			return "This email is unavailable!";
		} else {
			return "success";
		}
	}
}
