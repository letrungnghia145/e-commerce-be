package com.tmdt.app.service;

import com.tmdt.app.model.User;

public interface ManageAccountService {
	public User getUser(String email);
	public User updateUser(User user);
}
