package com.example.Blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Blog.entities.Role;

public interface RoleRepo extends JpaRepository<Role,Integer> {

}
