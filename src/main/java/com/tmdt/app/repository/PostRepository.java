package com.tmdt.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.tmdt.app.model.Post;

@EnableJpaRepositories
public interface PostRepository extends JpaRepository<Post, Long> {
	@Query("SELECT p FROM Post p WHERE p.title like ?1")
	public List<Post> getAllPostsWithPattern(String pattern);
}
