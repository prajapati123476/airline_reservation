package com.coforge.training.airlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.airlines.model.User;
import com.coforge.training.airlines.services.UserService;

@RestController
public class RegisterContoller {
	
	@Autowired
	private UserService userService;
	
	// http://localhost:8080/register
	/*@GetMapping("/register")
	public String registerPassenger() {
		return "Hello Passenger!!";
	}*/
	
	@GetMapping("/passengers")
	public List<User> getUsers(){
	
		return this.userService.getUsers();
	}
	
	@GetMapping("/passengers/{passengerId}")
	public User getUser(@PathVariable Long userId) {
		
		return this.userService.getUser(userId);
	}
	
	@PostMapping("/register")
	public User addUser(@RequestBody User user) {
		
		return this.userService.addUser(user);
		
	}
	
	// update passenger 
	@PutMapping("/passengers")
	public User updateUser(@RequestBody User user) {
		return this.userService.updateUser(user);
	}
	
//	@DeleteMapping("/passengers/{passengerId}")
//	public Passenger delPassenger(@PathVariable Long passengerId) {
//		
//		return this.passengerService.getPassenger(passengerId);
//	}
	
	
	
	

}
