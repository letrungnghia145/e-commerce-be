package com.tmdt.app.service;

import java.util.List;

import com.tmdt.app.model.Post;

public interface SearchJobService {
	public List<Post> doRequestSearch(String pattern);
}
