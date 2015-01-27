/**
 * @author Rodrigo Cardozo
 *
 */

package com.bootcamp.ServiceShoppingCartAPI;

import org.junit.Test;

import junit.framework.TestCase;

public class ShoppingCartTest extends TestCase {

	
	@Test
	public void test() {
		ShoppingCartImp cart = new ShoppingCartImp();
		Item itemTest = new Item(1,"toy",20);
		cart.addItem(itemTest);
		assertEquals(cart.getItems(),"[toy $20.0]");
	}
		
	@Test
	public void testLocalService() {
		ShoppingCartService cart = ShoppingCartFactory.getLocalService();
		Item itemTest = new Item(1,"toy",20);
		cart.addItem(itemTest);
		assertEquals(cart.getItems(),"[toy $20.0]");
	}
	
	@Test
	public void testWebService() {
		ShoppingCartService cart = ShoppingCartFactory.getRemoteServiceUsingWebService();
		Item itemTest = new Item(1,"pet",20);
		cart.addItem(itemTest);
		assertEquals(cart.getItems(),"[pet $20.0]");
	}
	
	@Test
	public void testUsingSpring(){
		ShoppingCartService cart = UsingSpring.loadFromSpring();
		Item itemTest = new Item(1,"pet",20);
		cart.addItem(itemTest);
		assertEquals(cart.getItems(),"[pet $20.0]");
	}

}