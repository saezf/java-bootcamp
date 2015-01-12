package e3.Equipment;

public abstract class Equipment {
	private String name;
	

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public abstract double getUsage();

	public abstract void setUsage(double usage);
}