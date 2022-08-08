package com.coforge.training.airlines.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.training.airlines.model.Flight;
import com.coforge.training.airlines.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightRepository frepo;
	
	public FlightServiceImpl() {
		
	}
	
	@Override
	public List<Flight> getFlights() {
		
		return frepo.findAll();
	}

	@Override
	public Flight addFlight(Flight flight) {
		
		frepo.save(flight);
		return flight;
	}

	@Override
	public Flight getFlight(long flightId) {
		
		return frepo.getOne(flightId);
	}

}
