package com.phaneendra.airline.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phaneendra.airline.backend.entity.FlightSeat;

public interface FlightSeatRepository extends JpaRepository<FlightSeat, Long>{
	Optional<FlightSeat> findByFlightFlightIdAndSeatNumber(Long flightId, String seatNumber);
}
