package com.tmdt.app;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Sets;
import com.tmdt.app.model.Domain;
import com.tmdt.app.model.Package;
import com.tmdt.app.model.Post;
import com.tmdt.app.repository.PostRepository;
import com.tmdt.app.repository.UserRepository;
import com.tmdt.app.service.ManageAccountService;
import com.tmdt.app.service.PostingService;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ProjectTmdtApplication implements CommandLineRunner {
	@Autowired
	private PostRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ProjectTmdtApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
//		List<Post> allPostsWithPattern = repository.getAllPostsWithPattern("%hcm city%");
//		System.out.println(allPostsWithPattern);
	}
}
