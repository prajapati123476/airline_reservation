package com.coforge.training.airlines.services;

import java.util.List;

import com.coforge.training.airlines.model.Flight;

public interface FlightService {

	List<Flight> getFlights();

	Flight addFlight(Flight flight);

	Flight getFlight(long flightId);

}
