package com.phaneendra.airline.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phaneendra.airline.backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	// Custom query method: Spring Data JPA automatically writes the SQL query 
    // to find a user by their email behind the scenes!
    Optional<User> findByEmail(String email);
}