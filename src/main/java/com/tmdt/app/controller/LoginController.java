package com.tmdt.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
//	@Autowired
//	private LoginService service;

	@GetMapping("/login")
	public String showLoginForm() {
		return "login";
	}
}
