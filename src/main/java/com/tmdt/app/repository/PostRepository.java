package com.tmdt.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tmdt.app.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
