package com.tmdt.app;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.tmdt.app.repository.UserRepository;

@SpringBootApplication
public class ProjectTmdtApplication implements CommandLineRunner {
	@Autowired
	private UserRepository repository;
	@Autowired
	private EntityManager em;

	public static void main(String[] args) {
		SpringApplication.run(ProjectTmdtApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception { 
	}
}
