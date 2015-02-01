/**
 * 
 */
package com.bootcamp.UserService;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author RoDoX
 *
 */
public class UserServiceTest {


	@Test
	public void test() {
		UserServiceImp userService = new UserServiceImp();
		User user = new User(1,"rodrigo","rodrigo@gmail.com",32);
		userService.addUser(user);
		assertEquals(userService.getUser(),"[rodrigo rodrigo@gmail.com 32]");
	}
	
	@Test
	public void testLocalService() {
		UserService userService = UserServiceFactory.getLocalService();
		User user = new User(1,"rodrigo","rodrigo@gmail.com",32);
		userService.addUser(user);
		assertEquals(userService.getUser(),"[rodrigo rodrigo@gmail.com 32]");
	}
	
	@Test
	public void testWebService() {
		
			UserService userService = UserServiceFactory.getRemoteServiceUsingWebService();
			User user = new User(1,"rodrigo","rodrigo@gmail.com",32);
			userService.addUser(user);
			User user2 = new User(1,"emiliano","rodrigo@gmail.com",32);
			userService.addUser(user2);
			assertEquals(userService.getUser(),"[rodrigo rodrigo@gmail.com 32, emiliano rodrigo@gmail.com 32]");
		}
	
	@Test
	public void testUsingSpring(){
		UserService userService = UsingSpring.loadFromSpring();
		User user = new User(1,"rodrigo","rodrigo@gmail.com",32);
		userService.addUser(user);
		assertEquals(userService.getUser(),"[rodrigo rodrigo@gmail.com 32]");
	}
}
	

