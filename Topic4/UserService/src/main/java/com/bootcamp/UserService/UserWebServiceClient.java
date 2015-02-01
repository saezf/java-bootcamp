/**
 * 
 */
package com.bootcamp.UserService;

import org.springframework.stereotype.Component;


/**
 * @author RoDoX
 *
 */

@Component
public class UserWebServiceClient implements UserService {
	UserService imp = new UserServiceImp();
	/* (non-Javadoc)
	 * @see com.bootcamp.UserService.UserService#deleteUser(com.bootcamp.UserService.User)
	 */
	public void deleteUser(User userToDelete) {
		imp.deleteUser(userToDelete);

	}

	/* (non-Javadoc)
	 * @see com.bootcamp.UserService.UserService#getUser()
	 */
	public String getUser() {
		return imp.getUser();
	}

	/* (non-Javadoc)
	 * @see com.bootcamp.UserService.UserService#addUser(com.bootcamp.UserService.User)
	 */
	public void addUser(User newUser) {
		imp.addUser(newUser);

	}

	/* (non-Javadoc)
	 * @see com.bootcamp.UserService.UserService#modifyUser(com.bootcamp.UserService.User)
	 */
	public void updateUser(User user) {
		imp.updateUser(user);

	}

}
