package com.tmdt.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ManageAccountController {
	@GetMapping("/account")
	public String showManageAccountFrom() {
		return "";
	}

	@PostMapping("/account")
	public void updateUserInfo() {

	}
}
