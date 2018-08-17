package com.ryum.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ryum.example.dto.User;

@Service
public class UserService {

	private List<User> userList = Arrays.asList(
		new User(1, "박지성", 28, "010-1111-2222"),
		new User(2, "손흥민", 27, "010-1234-2234"),
		new User(3, "홍길동", 18, "010-2211-3232"),
		new User(4, "이승우", 19, "010-3322-1121"),
		new User(5, "아이유", 19, "010-3333-4545")
	);
	
	public List<User> getUsers() {
		return userList;
	}
	
	public User getUser(int idx) {
		for( User user : userList ) {
			if( user.getIdx() == idx ) {
				return user;
			}
		}
		return null;
	}
	
}
