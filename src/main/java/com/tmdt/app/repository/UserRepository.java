package com.tmdt.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.tmdt.app.model.User;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long> {
	public Optional<User> findUserByEmail(String email);
}
