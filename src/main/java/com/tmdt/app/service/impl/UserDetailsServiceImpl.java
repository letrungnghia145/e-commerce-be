package com.tmdt.app.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tmdt.app.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetailsImpl userDetails = new UserDetailsImpl();
		repository.findUserByEmail(username).ifPresentOrElse(user -> {
			userDetails.setUsername(username);
			userDetails.setPassword(user.getPassword());
			Set<GrantedAuthority> authorities = new HashSet<>();
			user.getRole().getUserRole().permissions.forEach(permission -> {
				authorities.add(new SimpleGrantedAuthority(permission.toString()));
			});
			userDetails.setAuthorities(authorities);
		}, () -> {
			throw new UsernameNotFoundException("User not found");
		});
		return userDetails;
	}
}
