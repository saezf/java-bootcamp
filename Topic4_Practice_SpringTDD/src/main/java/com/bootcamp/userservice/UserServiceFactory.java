package com.bootcamp.userservice;

public class UserServiceFactory {
	private UserServiceFactory(){}
	
	public static UserService getLocalService(){
		return new UserServiceImpl();
	}

	public static UserService getRemoteServiceUsingWebService() {
		return new UserServiceProxy(new UserWebServiceClient());
	}
	
	
}
