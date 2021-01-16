package com.tmdt.app.service;

import com.tmdt.app.model.User;

public interface LoginService {
	public User authenticate(String username, String password);
}
