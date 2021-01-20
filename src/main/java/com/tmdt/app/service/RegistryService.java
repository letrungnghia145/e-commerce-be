package com.tmdt.app.service;

import com.tmdt.app.model.User;

public interface RegistryService {
	public User doRegistry(User user);
	
	public void sendMail(String username);
}
