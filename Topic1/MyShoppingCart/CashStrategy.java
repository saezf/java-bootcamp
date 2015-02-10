
public class CashStrategy implements PaymentStrategy{
	public double paymentTotal;

	public double getPaymentTotal() {
		return paymentTotal;
	}

	public void setPaymentTotal(double paymentTotal) {
		this.paymentTotal = paymentTotal;
	}
	@Override
	public void pay(MyShoppingCart cart) {
	
			double max = cart.getItems()[0].getItemPrice();

			for (Item item : cart.getItems()) {

				if (item.getItemPrice() > max) {
					max = item.getItemPrice();
				}

			}

			this.setPaymentTotal((cart.calculateTotal() - (max * 0.9)));

			System.out.println("Paying By Cash has 90% off on the expensivest item, your total with discount is " + this.getPaymentTotal());

		}

	
}

