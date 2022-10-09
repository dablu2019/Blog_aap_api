package com.example.Blog.services;

import java.util.List;

import com.example.Blog.entities.Post;
import com.example.Blog.payloads.PostDto;

public interface PostService {
	
	//create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//Get all posts
	List <PostDto>getAllPost();
	
	//get single post
	
	PostDto getPostById(Integer postId);
	
	//get all post by category
	
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all posts by user
	List<PostDto> getPostsByUser(Integer userId);
	
	//Search posts
	List<Post> searchPosts(String keyword);

}
