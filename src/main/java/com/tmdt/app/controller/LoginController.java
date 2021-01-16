package com.tmdt.app.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
//	@Autowired
//	private LoginService service;

	@GetMapping("/login")
	public String showLoginForm() {
		return "login";
	}

	@PostMapping("/login")
	public String doLogin(@RequestParam String username, @RequestParam String password) {
		return "login";
	}
	
	@GetMapping("/dashboard")
	@PreAuthorize("hasAnyAuthority('create:post')")
	public String name() {
		return "index";
	}
}
