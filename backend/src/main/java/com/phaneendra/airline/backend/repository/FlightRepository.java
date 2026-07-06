package com.phaneendra.airline.backend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import com.phaneendra.airline.backend.entity.Flight;

import jakarta.persistence.LockModeType;

public interface FlightRepository extends JpaRepository<Flight, Long>{
	List<Flight> findBySourceAndDestination(String source, String destination);
	
	@Lock(LockModeType.PESSIMISTIC_WRITE)
	Optional<Flight> findWithLockByFlightId(Long flightId);
}