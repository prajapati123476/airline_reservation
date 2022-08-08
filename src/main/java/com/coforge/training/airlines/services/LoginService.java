package com.coforge.training.airlines.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.training.airlines.model.User;
import com.coforge.training.airlines.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository repo;
	
	
	public User login(String email) {
		User user = repo.findByEmail(email);
		return user;
	}
	
}
	

