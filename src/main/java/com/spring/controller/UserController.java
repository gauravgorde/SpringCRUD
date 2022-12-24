package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.spring.modal.User;
import com.spring.service.UserService;

import jakarta.websocket.server.PathParam;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	// add user
	@PostMapping("/user")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		User addUser = this.userService.addUser(user);
		return ResponseEntity.ok().body(addUser);
	}

	// get user by id
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") int id) {
		User userById = this.userService.getUserById(id);
		return ResponseEntity.ok().body(userById);
	}

	// get all user list
	@GetMapping("/user")
	public ResponseEntity<List<User>> getAllUser() {
		List<User> allUsers = this.userService.getAllUsers();
		return ResponseEntity.ok().body(allUsers);
	}

	// get filter user by city
	@GetMapping("/userlist/{city}")
	public ResponseEntity<List<User>> getUserByCity(@PathVariable("city") String city) {
		List<User> userListByCity = this.userService.getUserListByCity(city);
		return ResponseEntity.ok().body(userListByCity);
	}

	// delete user
	@DeleteMapping("/user/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable("id") int id) {
		User user = this.userService.deleteUser(id);
		return ResponseEntity.ok().body(user);
	}

	// get user list with same name
	@GetMapping("/users/{name}")
	public ResponseEntity<User> getUserByName(@PathParam("name") String name) {
		User userByName = this.userService.getUserByName(name);
		return ResponseEntity.ok().body(userByName);
	}

	// update user
	@PutMapping("/user/{id}")
	public void updateUser(@RequestBody User user, @PathVariable("id") int id) {
		user.setId(id);
		this.userService.updateUser(user, id);

	}
}
