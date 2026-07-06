package com.phaneendra.airline.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phaneendra.airline.backend.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{}