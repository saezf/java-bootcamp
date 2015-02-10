package e3;

public class Medic {
	private String kind;
	private double amount;
 public Medic(String kind,double amount)
 {
	 this.kind = kind;
	 this.amount = amount;
 }
	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getKind() {
		return this.kind;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
