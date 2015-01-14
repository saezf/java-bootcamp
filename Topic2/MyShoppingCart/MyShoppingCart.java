
public class MyShoppingCart {
	private Item[] items;
	private Customer customer;
	private double totalToPay;

	
	public MyShoppingCart(Item[] items, Customer customer) {
		super();
		this.items = items;
		this.customer = customer;
	}
	

		public Item[] getItems() {
			return items;
		}

		public void setItems(Item[] items) {
			this.items = items;
		}

		
		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public double getTotalToPay() {
			return totalToPay;
		}

		public void setTotalToPay(double totalToPay) {
			this.totalToPay = totalToPay;
		}

	public void pay(PaymentStrategy paymentMethod){
		paymentMethod.pay(this);
	}
	// methods

	public double calculateTotal() {

		double sum = 0;

		for (Item items : this.items) {
			sum = sum + items.getItemPrice();
		}

		this.setTotalToPay(sum);

		return sum;
	}

	

}
