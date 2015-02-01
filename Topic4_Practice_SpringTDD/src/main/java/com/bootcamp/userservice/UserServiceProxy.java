package com.bootcamp.userservice;

public class UserServiceProxy implements UserService {
	UserService implementation;
	
	protected UserServiceProxy (UserService imp){
		this.implementation = imp;
	}

	public void deleteUser(User userToDelete) {
		implementation.deleteUser(userToDelete);
	}
	
	public String getUser() {
		return implementation.getUser();
	}

	public void addUser(User newUser) {
		implementation.addUser(newUser);
	}

	public void updateUser(User user) {
		implementation.updateUser(user);	
	}
}

