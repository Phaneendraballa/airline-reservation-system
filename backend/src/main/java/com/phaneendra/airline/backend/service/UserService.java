package com.phaneendra.airline.backend.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.phaneendra.airline.backend.entity.User;
import com.phaneendra.airline.backend.repository.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;
	
	// Constructor Injection (Dependency injection)
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	// Business Logic: Register a new user
	public User registerUser(User user) {
		// Business Rule: Check if email is already taken
		Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
		if(existingUser.isPresent()) {
			throw new RuntimeException("Email is already registered!");
		}
		
		return userRepository.save(user);
	}
}