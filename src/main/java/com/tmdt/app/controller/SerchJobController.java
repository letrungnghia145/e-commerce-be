package com.tmdt.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tmdt.app.model.Post;
import com.tmdt.app.service.SearchJobService;

@Controller
public class SerchJobController {
	@Autowired
	private SearchJobService service;

	@GetMapping("/search")
	public String doRequestSearch(@RequestParam(value = "search", required = false) String pattern,
			@RequestParam(value = "location", required = false) Integer location, Model model) {
		List<Post> posts = service.doRequestSearch(pattern);
		model.addAttribute("posts", posts);
		return "job_listing";
	}
}
