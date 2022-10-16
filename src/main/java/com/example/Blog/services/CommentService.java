package com.example.Blog.services;

import com.example.Blog.payloads.CommentDto;

public interface CommentService {
	//create comment
	
	CommentDto createComment(CommentDto commentDto, Integer postId);
	
	//delete comment
	void deleteComment(Integer commmentId);

}
