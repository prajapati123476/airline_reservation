package com.coforge.training.airlines.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.airlines.model.User;

public interface LoginRepository extends JpaRepository<User, Long> {
	
	User findByEmail( String email);
	

}
