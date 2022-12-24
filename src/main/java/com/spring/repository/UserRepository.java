package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.modal.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findById(int id);

	public List<User> findByCity(String city);

	public User findByName(String name);
	public User deleteById(int id);
}
