/**
 * @author Rodrigo Cardozo
 *
 */
package com.bootcamp.ServiceShoppingCartAPI;

public class ShoppingCartFactory {

	private ShoppingCartFactory() {}  
	  
    public static ShoppingCartService getLocalService(){  
        return new ShoppingCartImp ();  
    }  
  
    public static ShoppingCartService getRemoteServiceUsingWebService(){  
        return new ShoppingCartProxy (new ShoppingCartWebServiceClient());  
    }  
	
}
