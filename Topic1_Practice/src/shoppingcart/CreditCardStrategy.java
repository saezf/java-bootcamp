package shoppingcart;

public class CreditCardStrategy implements PaymentStrategy{
	private String name;
	private String cardNumber;
	
	CreditCardStrategy(String n, String c){
		this.name = n;
		this.cardNumber = c;
	}
	
	@Override
	public void pay(int totalAmount){
		//Calculate the amount with the discount
		int totalAmountWDisc = (totalAmount - (10 * totalAmount) % 100);
		System.out.println(totalAmountWDisc + " with Credit Card");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
}