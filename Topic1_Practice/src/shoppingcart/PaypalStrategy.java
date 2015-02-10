package shoppingcart;

public class PaypalStrategy implements PaymentStrategy{
	private	String email;
	private String password;
	
	PaypalStrategy(String eMail, String pwd){
		this.email = eMail;
		this.password = pwd;
	}
	@Override
	public void pay(int totalAmount){
		//The purpose of this practice is knowing the pattern designs. The search for the cheaper
		//product of the shopping cart and the deduction on the total amount are excluded here
		System.out.println(totalAmount + " paid with Paypal");
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}