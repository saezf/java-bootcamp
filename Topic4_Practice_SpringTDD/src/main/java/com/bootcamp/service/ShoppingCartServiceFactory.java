package com.bootcamp.service;


public class ShoppingCartServiceFactory {
    private ShoppingCartServiceFactory() {}  
    
    public static ShoppingCartService getLocalService(){  
        return new ShoppingCartServiceImpl();  
    }  
  
    public static ShoppingCartService getRemoteServiceUsingJms(){  
        return new ShoppingCartServiceProxy(new ShoppingCartServiceJmsClient());  
    }  
  
    public static ShoppingCartService getRemoteServiceUsingWebService(){  
        return new ShoppingCartServiceProxy (new ShoppingCartServiceWebServiceClient());  
    }
}
