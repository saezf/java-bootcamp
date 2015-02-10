package com.bootcamp.userservice;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
	List<User> userList = new ArrayList<User>();

	public void deleteUser(User userToDelete) {
		userList.remove(userToDelete);	
	}

	public String getUser() {
		return userList.toString();
	}
	
	public void addUser(User newUser) {
		userList.add(newUser);
	}

	public void updateUser(User updateUser) {
		userList.set(updateUser.getUserId(),updateUser);
	}
}