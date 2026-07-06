package com.phaneendra.airline.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phaneendra.airline.backend.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long>{}