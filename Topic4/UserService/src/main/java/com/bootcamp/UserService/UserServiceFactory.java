/**
 * 
 */
package com.bootcamp.UserService;


/**
 * @author RoDoX
 *
 */
public class UserServiceFactory {
	private UserServiceFactory(){
		
	}
	
	public static UserService getLocalService(){
		return new UserServiceImp();
	}

	/**
	 * @return
	 */
	public static UserService getRemoteServiceUsingWebService() {
		return new UserServiceProxy(new UserWebServiceClient());
	}
	
	
}
