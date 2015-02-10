
public class CreditCardStrategy implements PaymentStrategy {
	public double paymentTotal;
	public int numberCreditCard;
	public String nameCreditCard;
	
	public CreditCardStrategy(int numberCreditCard, String nameCreditCard) {
		super();
		this.numberCreditCard = numberCreditCard;
		this.nameCreditCard = nameCreditCard;
	}
	
	
	public int getNumberCreditCard() {
		return numberCreditCard;
	}


	public void setNumberCreditCard(int numberCreditCard) {
		this.numberCreditCard = numberCreditCard;
	}


	public String getNameCreditCard() {
		return nameCreditCard;
	}


	public void setNameCreditCard(String nameCreditCard) {
		this.nameCreditCard = nameCreditCard;
	}
	
	public double getPaymentTotal() {
		return paymentTotal;
	}

	public void setPaymentTotal(double paymentTotal) {
		this.paymentTotal = paymentTotal;
	}
	
	@Override
	public void pay(MyShoppingCart msc) {
		this.setPaymentTotal((msc.calculateTotal() * 0.9));

		System.out.println("Paying By Credit Card you have a 10% off on your entire buy, your total with discount is " + this.getPaymentTotal());
	}

}
