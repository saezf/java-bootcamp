/**
 * 
 */
package com.bootcamp.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RoDoX
 *
 */
public class UserServiceImp implements UserService {
	List<User> userList = new ArrayList<User>();

	/* (non-Javadoc)
	 * @see com.bootcamp.UserService.UserService#deleteUser(com.bootcamp.UserService.User)
	 */
	public void deleteUser(User userToDelete) {
		userList.remove(userToDelete);
		
	}

	/* (non-Javadoc)
	 * @see com.bootcamp.UserService.UserService#getUser()
	 */
	public String getUser() {
		return userList.toString();
	}

	/* (non-Javadoc)
	 * @see com.bootcamp.UserService.UserService#addUser(com.bootcamp.UserService.User)
	 */
	public void addUser(User newUser) {
		userList.add(newUser);
		
	}

	/* (non-Javadoc)
	 * @see com.bootcamp.UserService.UserService#modifyUser()
	 */
	public void updateUser(User updateUser) {
		userList.set(updateUser.getUserId(),updateUser);
		
	}


}
