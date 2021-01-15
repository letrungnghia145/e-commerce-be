package com.tmdt.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.tmdt.app.model.Post;
import com.tmdt.app.repository.PostRepository;
import com.tmdt.app.service.PostService;
import com.tmdt.app.utils.Converter;

public class PostServiceImpl implements PostService {
	@Autowired
	private PostRepository repository;
	
	
	public void doPost(Post post) {
		//logic
		add(post);
	};

	@Override
	public List<Post> getAll() {
		return repository.findAll();
	}

	@Override
	public Post getOne(Long id) {
		Optional<Post> findById = repository.findById(id);
		return findById.get();
	}

	@Override
	public void add(Post entity) {
		repository.save(entity);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		Post one = repository.getOne(id);
		repository.delete(one);
	}

	@Override
	@Transactional
	public void update(Post entity) {
		repository.findById(entity.getId()).ifPresent(post -> {
			try {
				Converter.convert(entity, post);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

}
