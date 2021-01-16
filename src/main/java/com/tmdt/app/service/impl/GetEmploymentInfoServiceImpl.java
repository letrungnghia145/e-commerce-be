package com.tmdt.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmdt.app.model.Post;
import com.tmdt.app.repository.PostRepository;
import com.tmdt.app.service.GetEmploymentInfoService;

@Service
public class GetEmploymentInfoServiceImpl implements GetEmploymentInfoService {
	@Autowired
	private PostRepository repository;

	@Override
	public Post getPost(Long postId) {
		return repository.findById(postId).get();
	}

}
