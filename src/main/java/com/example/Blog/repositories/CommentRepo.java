package com.example.Blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
