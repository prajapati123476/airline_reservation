package com.coforge.training.airlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.airlines.model.Flight;
import com.coforge.training.airlines.services.FlightService;

@RestController
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	// http://localhost:8080/flights
	@GetMapping("/flights")
	public List<Flight> getFlights(){
		
		return this.flightService.getFlights();
	}
	
	@GetMapping("/flights/{flightId}")
	public Flight getFlight(@PathVariable Long flightId) {
		
		return this.flightService.getFlight(flightId);
	}
	
	@PostMapping("/flights")
	public Flight addFlight(@RequestBody Flight flight) {
		
		return this.flightService.addFlight(flight);
	}

}
