package com.bootcamp.shoppingcart;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bootcamp.shoppingcart.ShoppingCartRestApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ShoppingCartRestApplication.class)
@WebAppConfiguration
public class ShoppingCartRestApplicationTests {

	@Test
	public void contextLoads() {
	}

}
