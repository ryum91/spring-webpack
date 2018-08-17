package com.ryum.example.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ryum.example.dto.User;
import com.ryum.example.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	@GetMapping("/user/{idx}")
	public User getUser(HttpServletResponse res, @PathVariable int idx) throws IOException {
		User user = userService.getUser(idx);
		if( null == user ) {
			res.sendError(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}
		return user;
	}
	
}
