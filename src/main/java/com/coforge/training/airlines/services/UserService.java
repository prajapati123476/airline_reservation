package com.coforge.training.airlines.services;

import java.util.List;

import com.coforge.training.airlines.model.User;

public interface UserService {

	public List<User> getUsers();
	
	public User getUser(long userId);
	
	public User updateUser(User user);
	
	public User delUser(long userId);
	
	public User addUser(User user);

	

	

}
