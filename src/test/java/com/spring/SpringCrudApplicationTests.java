package com.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.modal.User;
import com.spring.repository.UserRepository;
import com.spring.service.UserService;

@SpringBootTest
class SpringCrudApplicationTests {

	@InjectMocks
	private UserService userService;

	@Mock
	private UserRepository userRepository;

//	@Test
//	public void addUser() {
//		User user = new User("ABCDEF", "Nashik");
//		userService.addUser(user);
//	}

//	@Test
//	public void getAllUser() {
//		List<User> list = Arrays.asList(new User("Abhishek", "Nashik"), new User("Sagar", "Pune"),
//				new User("Swapnil", "Pune"));
//		when(userRepository.findAll()).thenReturn(list);
//
//		List<User> allUsers = userService.getAllUsers();
//		assertEquals(allUsers, list);
//
//	}

//	@Test
//	public void getSingleUser() {
//
//	}

//
	@Test
	public void getUserByName() {
		assertEquals(userRepository.findByName("XYZ"), userService.getUserByName("ABC"));
	}
//
//	@Test
//	public void getUserByCity() {
//		userService.getUserListByCity("Nashik");
//	}
}
