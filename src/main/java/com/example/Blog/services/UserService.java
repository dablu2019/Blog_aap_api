package com.example.Blog.services;

import java.util.List;

import com.example.Blog.payloads.UserDto;

public interface UserService {
	
	UserDto registerNewUser(UserDto user);
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserBYId(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);
	

}
