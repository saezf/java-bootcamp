
public class Customer extends Person {
	public int customerid;
	
	public Customer(String name, String lastName, String phoneNumber,
			String mail, String address, int id) {
		super(name, lastName, phoneNumber, mail, address, id);
		// TODO Auto-generated constructor stub
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + "]";
	}

}
