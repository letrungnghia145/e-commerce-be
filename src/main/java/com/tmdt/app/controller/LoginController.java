package com.tmdt.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String showLoginForm() {
		return "login";
	}

	@PostMapping("/login")
	public String doLogin(@RequestParam String username, @RequestParam String password) {
//		if (username.equals("nghia1k45@gmail.com") && password.equals("123")) {
//			return "redirect:/home";
//		}
		return "login";
	}
}
