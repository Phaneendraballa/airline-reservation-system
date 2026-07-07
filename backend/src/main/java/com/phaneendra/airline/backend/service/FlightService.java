package com.phaneendra.airline.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.phaneendra.airline.backend.entity.Flight;
import com.phaneendra.airline.backend.repository.FlightRepository;

@Service
public class FlightService {
	private final FlightRepository flightRepository;
	
	// Constructor Injection to link our repository layer
	public FlightService(FlightRepository flightRepository) {
		this.flightRepository = flightRepository;
	}
	
	// Business Logic: Retrieve all flights currently in the system
	public List<Flight> getAllFlights() {
		return flightRepository.findAll();
	}
	
	// Business Logic: Search flights by source and destination cities
	public List<Flight> serchFlights(String source, String destination) {
		return flightRepository.findBySourceAndDestination(source, destination);
	}
}