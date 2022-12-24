package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.modal.User;
import com.spring.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	// add user
	public User addUser(User user) {
		return this.userRepository.save(user);
	}

	// delete user
	public User deleteUser(int id) {
		return this.userRepository.deleteById(id);
	}

	// update user
	public void updateUser(User user, int id) {
		this.userRepository.save(user);
	}

	// get User by id
	public User getUserById(int id) {
		return this.userRepository.findById(id);
	}

	// get List of user by city
	public List<User> getUserListByCity(String city) {
		return this.userRepository.findByCity(city);
	}

	// get all users
	public List<User> getAllUsers() {
		return this.userRepository.findAll();
	}

	// get user by name
	public User getUserByName(String name) {
		return this.userRepository.findByName(name);
	}

}
