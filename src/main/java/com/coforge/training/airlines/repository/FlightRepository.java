package com.coforge.training.airlines.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.airlines.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
	
	Optional<Flight> findById(String id);

}
