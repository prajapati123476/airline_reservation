package com.coforge.training.airlines.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.training.airlines.model.User;
import com.coforge.training.airlines.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository prepo;
	
	public void saveUser(User user) {
		
		prepo.save(user);
	}
	
	//List<Passenger> list;
	
	public UserServiceImpl() {
		
		//list = new ArrayList<>();	
		//.add(new Passenger(1,"Mr.","Hari","Mishra","hari@gmail.com","123456", "09/08/1999", 98989898));
	}
	
	// get all passengers list
	@Override
	public List<User> getUsers() {
		
		return prepo.findAll();
	}
	
	// get single passenger by id
	@Override
	public User getUser(long userId) {
		
		return prepo.getOne(userId);
	}
	// update passenger
	@Override
	public User updateUser(User user) {
		
		prepo.save(user);
		return user;
	}
	
	// delete passenger by id
	@Override
	public User delUser(long userId) {
		
		User entity =prepo.getOne(userId);
		prepo.delete(entity);
		return null;
	}

	@Override
	public User addUser(User user) {
		
		prepo.save(user);
		return user;
	}

	

	

	

	

}
