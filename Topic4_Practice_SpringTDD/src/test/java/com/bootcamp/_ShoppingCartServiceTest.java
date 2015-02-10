package com.bootcamp;


import static org.junit.Assert.*;

import org.junit.*;

import com.bootcamp.service.Product;
import com.bootcamp.service.ShoppingCartService;
import com.bootcamp.service.ShoppingCartServiceFactory;
import com.bootcamp.service.UsingSpring;
import com.bootcamp.userservice.User;
import com.bootcamp.userservice.UserService;
import com.bootcamp.userservice.UserServiceFactory;
import com.bootcamp.userservice.UsingSpringUserService;

public class _ShoppingCartServiceTest {
//	@Autowired
//	ApplicationContext applicationContext;
	
	private static ShoppingCartService serviceWebService,serviceLocal,serviceUsingSpring;
	private static UserService userServiceSpring;
	//private static ShoppingCartServiceImpl listaPruebaProductos;
	@BeforeClass
	public static void testsetup() {
		// Test getLocalService()
		// Insert some products
		serviceLocal = ShoppingCartServiceFactory.getLocalService();
		serviceLocal.addItem(new Product(1, "New Iphone 6", 456.99));
		serviceLocal.addItem(new Product(2, "Samsung Galaxy Tab", 399.99));
		serviceLocal.addItem(new Product(3, "Samsung Smart TV", 1230.99));
		//Setup for UserService Test
		userServiceSpring = UserServiceFactory.getLocalService();
		userServiceSpring.addUser(new User(1, "Homer Simpson", "hjsimpson@nbc.com", 42));
		userServiceSpring.addUser(new User(2, "James Bond", "jbond@007.com", 55));
		System.out.println("Users Added: " + userServiceSpring.getUser());
//		userServiceSpring.addUser(new User(1, "Miles Davis", "mdavis@jazz.com", 87));
	}

	@Test
	public void testGetLocal() {
		// Test getLocalService()
		System.out.println("Added: " + serviceLocal.getItems());
		// Test delete
		Product prod = serviceLocal.getListItems().get(1);
		serviceLocal.removeItem(prod);
		System.out.println("Deleting 1 Item");
		System.out.println("List after delete: " + serviceLocal.getItems());
		//Test clear cart
		serviceLocal.getListItems().clear();
		System.out.println("Clear ShoppingCart");
		System.out.println("List after clear: " + serviceLocal.getItems());
		//Add Back the items
		serviceLocal.addItem(new Product(1, "New Iphone 6", 456.99));
		serviceLocal.addItem(new Product(2, "Samsung Galaxy Tab", 399.99));
		serviceLocal.addItem(new Product(3, "Samsung Smart TV", 1230.99));
		System.out.println("Added Back Items: " + serviceLocal.getItems());
	}
	
	@Test
	public void testGetRemoteUsingWebService() {
		//Add items
		serviceWebService = ShoppingCartServiceFactory.getRemoteServiceUsingWebService();
		serviceWebService.addItem(new Product(1, "New Go Pro Black", 569.99));
		serviceWebService.addItem(new Product(2, "iPad Mini", 299.99));
		serviceWebService.addItem(new Product(3, "Samsung Galaxy S5", 249.99));
		// Test WebService
		serviceWebService.getItems();
		System.out.println("List items using remote web service");
		System.out.println("Added: " + serviceWebService.getItems());
	}
	
	@Test
	public void testUsingSpring() {
		//Test Using Spring
		serviceUsingSpring = UsingSpring.loadFromSpring();
		//Add items
		serviceUsingSpring.addItem(new Product(1, "Product 1", 199.99));
		serviceUsingSpring.addItem(new Product(2, "Product 2", 399.99));
		serviceUsingSpring.addItem(new Product(3, "Product 3", 249.99));
		serviceUsingSpring.getItems();
		System.out.println("List items using spring");
		System.out.println("Added: " + serviceWebService.getItems());
	}
	
	//Test for UserService
	@Test
	public void testUsingSpringUserService(){
		assertEquals(userServiceSpring.getUser(),"[Homer Simpson hjsimpson@nbc.com 42, James Bond jbond@007.com 55]");
	}
}	