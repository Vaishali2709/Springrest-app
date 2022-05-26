package com.springrest.springrest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.User;
import com.springrest.springrest.services.UserService;

@RestController
public class UserController {
	
@Autowired
private UserService userservice; 
	
	@GetMapping("/users")
	public List<User>getAllUser()
	{
		return userservice.getAllUsers();
	}
	
	//Create User 
	//Request body 
	//@Post Mapping 
	@PostMapping("/users")
	public User creatUser(@RequestBody User user) {
		return userservice.createUser(user);
	}
	
	//getUserById
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable("id") Long id)
	{
		return userservice.getUserById(id);
	}
	
	
	//updateUserid 
	@PutMapping("/users/{id}")
	public User updateUserById(@PathVariable("id") Long id , @RequestBody User user)
	{
		return userservice.updateUserID(id, user);
	}
	
	//getUserByUsername 
	@GetMapping("/users/byusername/{username}")
	public User getUserByUsername(@PathVariable("username") String username)
	{
		return userservice.getUserByUsername(username);
	}

}
