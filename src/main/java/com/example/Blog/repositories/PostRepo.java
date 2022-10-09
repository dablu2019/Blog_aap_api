package com.example.Blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Blog.entities.Category;
import com.example.Blog.entities.Post;
import com.example.Blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);
	
	List<Post> findByCategory(Category category);
	
}
