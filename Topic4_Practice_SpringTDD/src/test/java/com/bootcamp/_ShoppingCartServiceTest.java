package com.bootcamp;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bootcamp.service.ShoppingCartService;
import com.bootcamp.service.ShoppingCartServiceFactory;
import com.bootcamp.shoppingcart.Product;
import com.bootcamp.shoppingcart.ProductDetails;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/test-servlet-context.xml")
public class _ShoppingCartServiceTest {
	@Autowired
	ApplicationContext applicationContext;
	
	private static ProductDetails listaPruebadatos;
	private static ShoppingCartService serviceWebService;
	
	@BeforeClass
	public static void testsetup() {
		listaPruebadatos = new ProductDetails();
		//cart = ShoppingCartServiceFactory.getLocalService();
		listaPruebadatos.getItems().add(
				new Product(1, "New Iphone 6", 456.99).toJson());
		listaPruebadatos.getItems().add(
				new Product(2, "Samsung Galaxy Tab", 399.99).toJson());
	}

	@Test
	public void testGetLocal() {
		// Test getLocalService()
		listaPruebadatos.getItems().add(new Product(3, "Samsung Smart TV", 1230.99).toJson());
		System.out.println("Added: " + listaPruebadatos.getItems());
		// Test - obtaining the from the Proxy
	}
	
	@Test
	public void testGetRemoteUsingWebService() {
		// Test WebService
		serviceWebService = ShoppingCartServiceFactory.getRemoteServiceUsingWebService();
		serviceWebService.getAllItems();
	}
	
	@Test
	public void testContext() {
		
		Assert.assertNotNull(applicationContext.getBean("test"));
	}
	
}	

/*import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("test-servlet-context.xml")
public class ShoppingCartServiceTest {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
}*/