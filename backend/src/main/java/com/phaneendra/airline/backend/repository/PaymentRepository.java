package com.phaneendra.airline.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phaneendra.airline.backend.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{}