package com.tmdt.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tmdt.app.model.User;
import com.tmdt.app.repository.UserRepository;
import com.tmdt.app.service.ManageAccountService;
import com.tmdt.app.utils.Converter;

@Service
public class ManageAccountServiceImpl implements ManageAccountService {
	@Autowired
	private UserRepository repository;

	@Override
	public User getUser(String email) {
		return repository.findUserByEmail(email).get();
	}

	@Override
	@Transactional
	public User updateUser(User user) {
		repository.findById(user.getId()).ifPresent(bo -> {
			try {
				Converter.convert(user, bo);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		return user;
	}

}
