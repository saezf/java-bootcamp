package com.bootcamp.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingSpring {

	public static ShoppingCartService loadFromSpring() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bootcamp/service/beans.xml");
		return (ShoppingCartService) context.getBean("shoppingCartServiceProxy");
	}
}
