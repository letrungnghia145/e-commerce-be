package com.tmdt.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmdt.app.model.Post;
import com.tmdt.app.repository.PostRepository;
import com.tmdt.app.service.SearchJobService;

@Service
public class SearchJobServiceImpl implements SearchJobService {
	@Autowired
	private PostRepository repository;

	@Override
	public List<Post> doRequestSearch(String pattern) {
		List<Post> posts = new ArrayList<>();
		if (pattern != null) {
			posts = pattern.isEmpty() ? repository.findAll() : repository.getAllPostsWithPattern(standardlizePattern(pattern));
		}
		return posts;
	}

	private String standardlizePattern(String inputPattern) {
		return "%" + inputPattern + "%";
	}
}
