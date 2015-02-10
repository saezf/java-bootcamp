package com.bootcamp.userservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingSpringUserService {

	
	public static UserService loadFromSpring() {
		ApplicationContext context = new ClassPathXmlApplicationContext ("com/bootcamp/userservice/beans.xml");
		return (UserService) context.getBean("userProxy");  
	}
}
