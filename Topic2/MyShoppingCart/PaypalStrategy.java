
public class PaypalStrategy implements PaymentStrategy{

	public String passPaypal;
	public String mailPaypal;
	public double paymentTotal;
	
	public PaypalStrategy(String passPaypal, String mailPaypal) {
		this.passPaypal = passPaypal;
		this.mailPaypal = mailPaypal;
	}

	public String getPassPaypal() {
		return passPaypal;
	}

	public void setPassPaypal(String passPaypal) {
		this.passPaypal = passPaypal;
	}

	public String getMailPaypal() {
		return mailPaypal;
	}

	public void setMailPaypal(String mailPaypal) {
		this.mailPaypal = mailPaypal;
	}

	public double getPaymentTotal() {
		return paymentTotal;
	}

	public void setPaymentTotal(double paymentTotal) {
		this.paymentTotal = paymentTotal;
	}
	@Override
	public void pay(MyShoppingCart cart) {
		double min = cart.getItems()[0].getItemPrice();
		
		for (Item item : cart.getItems()) {
			if (item.getItemPrice() > min) {
				min = item.getItemPrice();
			}

		}

		this.setPaymentTotal((cart.calculateTotal() - min));
		 System.out.println("Paying By Paypal has 100% off on cheapest item, your total with discount is " + this.getPaymentTotal());

		}


}


