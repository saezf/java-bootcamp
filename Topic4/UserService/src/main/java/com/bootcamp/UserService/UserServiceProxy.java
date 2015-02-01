/**
 * 
 */
package com.bootcamp.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author RoDoX
 *
 */
@Component
public class UserServiceProxy implements UserService {
	@Autowired
	UserService implementation;
	
	
	
	public UserServiceProxy() {
			}
	
	protected UserServiceProxy (UserService imp){
		this.implementation = imp;
	}
	/* (non-Javadoc)
	 * @see com.bootcamp.UserService.UserService#removeUser(com.bootcamp.UserService.User)
	 */
	public void deleteUser(User userToDelete) {
		implementation.deleteUser(userToDelete);
		
	}

	/* (non-Javadoc)
	 * @see com.bootcamp.UserService.UserService#getUser()
	 */
	public String getUser() {
		return implementation.getUser();
	}

	/* (non-Javadoc)
	 * @see com.bootcamp.UserService.UserService#addUser(com.bootcamp.UserService.User)
	 */
	public void addUser(User newUser) {
		implementation.addUser(newUser);
		
	}

	/* (non-Javadoc)
	 * @see com.bootcamp.UserService.UserService#modifyUser()
	 */
	public void updateUser(User user) {
		implementation.updateUser(user);
		
	}

}
