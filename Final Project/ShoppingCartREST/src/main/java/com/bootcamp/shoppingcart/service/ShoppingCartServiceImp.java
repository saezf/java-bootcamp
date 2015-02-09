package com.bootcamp.shoppingcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.shoppingcart.entity.Category;
import com.bootcamp.shoppingcart.entity.Product;
import com.bootcamp.shoppingcart.entity.ShoppingCart;
import com.bootcamp.shoppingcart.entity.User;
import com.bootcamp.shoppingcart.repository.CategoryRepository;
import com.bootcamp.shoppingcart.repository.ProductRepository;
import com.bootcamp.shoppingcart.repository.ShoppingCartRepository;
import com.bootcamp.shoppingcart.repository.UserRepository;
@Service
public class ShoppingCartServiceImp implements ShoppingCartServiceInterface {

	private CategoryRepository categoryRepository;
	private ProductRepository productRepository;
	private UserRepository userRepository;
	private ShoppingCartRepository shoppingCartRepository;
	
	public ShoppingCartServiceImp() {
	}
	
	
	@Autowired
	public ShoppingCartServiceImp(
			CategoryRepository categoryRepository,
			ProductRepository productRepository, UserRepository userRepository, 
			ShoppingCartRepository shoppingCartRepository) {
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
		this.userRepository = userRepository;
		this.shoppingCartRepository = shoppingCartRepository;
	}



	/* (non-Javadoc)
	 * @see com.bootcamp.shoppingcart.service.ShoppingCartServiceInterface#getProducts()
	 */
	@Override
	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.bootcamp.shoppingcart.service.ShoppingCartServiceInterface#getProduct(java.lang.Long)
	 */
	@Override
	public Product getProduct(Long id) {
		return productRepository.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.bootcamp.shoppingcart.service.ShoppingCartServiceInterface#removeProduct(java.lang.Long)
	 */
	@Override
	public void removeProduct(Long id) {
		this.productRepository.delete(id);
		
	}

	/* (non-Javadoc)
	 * @see com.bootcamp.shoppingcart.service.ShoppingCartServiceInterface#addProduct(java.lang.Long)
	 */
	@Override
	public Product addProduct(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bootcamp.shoppingcart.service.ShoppingCartServiceInterface#getUser(java.lang.Long)
	 */
	@Override
	public User getUser(Long id) {
		return userRepository.findById(id);
	}


	/* (non-Javadoc)
	 * @see com.bootcamp.shoppingcart.service.ShoppingCartServiceInterface#getCategory(java.lang.Long)
	 */
	@Override
	public Category getCategory(Long id) {
		return categoryRepository.findById(id);
	}


	/* (non-Javadoc)
	 * @see com.bootcamp.shoppingcart.service.ShoppingCartServiceInterface#getShoppingCart(java.lang.Long)
	 */
	@Override
	public ShoppingCart getShoppingCart(Long id) {
		return shoppingCartRepository.findById(id);
	}

	
	
		
}