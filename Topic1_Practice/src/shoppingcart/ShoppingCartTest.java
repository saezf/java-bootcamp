package shoppingcart;

public class ShoppingCartTest{
	public static void main(String[] args) {
		//initialize the sequence
		//UniqueSequenceSingleton.getInstance();
		Transaction trans = new Transaction();
		
		
		User userTest = new User("George Smith", 555557859);
		ShoppingCart cart = new ShoppingCart(userTest);
		
        Item item1 = new Item("1234","Product 1", 10);
        Item item2 = new Item("5678","Product 2",40);
         
        cart.addItem(item1);
        cart.addItem(item2);
        cart.ListAllItems();
         
        //pay by paypal
        System.out.println("Order Number: " + trans.getId());
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
         
        //pay by credit card
        System.out.println("Order Number: " + trans.getId());
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456"));
        
        //add an offer
        Offer offerTest = new Offer("Promo Verano",25,item2);
        System.out.println(offerTest);
	}
}