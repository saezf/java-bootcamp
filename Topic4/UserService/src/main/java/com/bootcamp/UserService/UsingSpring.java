/**
 * 
 */
package com.bootcamp.UserService;

/**
 * @author RoDoX
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingSpring {

	
	public static UserService loadFromSpring() {
		ApplicationContext context = new ClassPathXmlApplicationContext ("com/bootcamp/UserService/beans.xml");
		return (UserService) context.getBean("userServiceProxy");  
	}

}
