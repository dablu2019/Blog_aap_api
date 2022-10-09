package com.example.Blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
