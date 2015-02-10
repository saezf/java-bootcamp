package shoppingcart;

public class CashStrategy implements PaymentStrategy{
	@Override
	public void pay(int totalAmount){
		//The purpose of this practice is knowing the pattern designs. The search for the most expensive
		//product of the shopping cart and the deduction on the total amount are excluded here
		System.out.println(totalAmount + " paid in Cash");
	}
}