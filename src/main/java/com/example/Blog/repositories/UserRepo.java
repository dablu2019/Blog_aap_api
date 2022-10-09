package com.example.Blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Blog.entities.User;

public interface UserRepo  extends JpaRepository<User,Integer>{

}
