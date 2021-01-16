package com.tmdt.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tmdt.app.service.GetEmploymentInfoService;

@Controller
public class GetEmploymentInfoController {
	@Autowired
	private GetEmploymentInfoService service;

	@GetMapping("/post/{postId}")
	public String showEmploymentInfo(@PathVariable Long postId, Model model) {
		model.addAttribute("post", service.getPost(postId));
		return "job_details";
	}
}
