/**
 * @author Rodrigo Cardozo
 *
 */
package com.bootcamp.ServiceShoppingCartAPI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingSpring {

	
	public static ShoppingCartService loadFromSpring() {
		ApplicationContext context = new ClassPathXmlApplicationContext ("com/bootcamp/ServiceShoppingCartAPI/beans.xml");
		return (ShoppingCartService) context.getBean("shoppingCartProxy");  
	}

}
