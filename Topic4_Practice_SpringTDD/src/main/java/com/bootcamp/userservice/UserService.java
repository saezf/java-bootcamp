package com.bootcamp.userservice;

public interface UserService {
	public void deleteUser(User userToDelete);
	public String getUser();
	void addUser(User newUser);
	public void updateUser(User updateUser);
}
