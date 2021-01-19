package com.tmdt.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostEmploymentController {
	@GetMapping("/post")
	public String showPostEmploymentForm() {
		return "employer-create-post";
	}
}
