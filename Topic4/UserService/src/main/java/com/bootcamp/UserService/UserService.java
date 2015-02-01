/**
 * 
 */
package com.bootcamp.UserService;

import org.springframework.stereotype.Service;

/**
 * @author RoDoX
 *
 */
@Service
public interface UserService {
	public void deleteUser(User userToDelete);
	public String getUser();
	void addUser(User newUser);
	public void updateUser(User updateUser);
}
