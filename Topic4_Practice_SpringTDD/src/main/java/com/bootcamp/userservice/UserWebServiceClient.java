package com.bootcamp.userservice;

public class UserWebServiceClient implements UserService {
	UserService imp = new UserServiceImpl();

	public void deleteUser(User userToDelete) {
		imp.deleteUser(userToDelete);
	}

	public String getUser() {
		return imp.getUser();
	}

	public void addUser(User newUser) {
		imp.addUser(newUser);
	}

	public void updateUser(User user) {
		imp.updateUser(user);
	}
}
