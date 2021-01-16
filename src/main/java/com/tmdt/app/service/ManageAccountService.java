package com.tmdt.app.service;

import com.tmdt.app.model.User;

public interface ManageAccountService {
	public void getUser(Long id);
	public void updateUser(User user);
}
