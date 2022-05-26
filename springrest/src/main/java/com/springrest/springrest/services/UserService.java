package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springrest.springrest.entities.User;
import com.springrest.springrest.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepository; 
	
	
	public List<User> getAllUsers(){
	
		return userrepository.findAll(); 
	}
	
	//create User method 
	public User createUser(User user) {
		return userrepository.save(user);
	}

	//getUserByID 
	public Optional<User> getUserById(Long Id)
	{
		Optional<User> user =userrepository.findById(Id);
		return user ;
		
		}
	
	//updateUserID 
	public User updateUserID(Long id , User user)
	{
		user.setId(id);
		return userrepository.save(user);
	}
	
	//getUserByUsername
	
	public User getUserByUsername(String username)
	{
		return userrepository.findByUsername(username);
	}
	
	
	
}
