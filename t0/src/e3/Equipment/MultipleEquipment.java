package e3.Equipment;

public class MultipleEquipment extends Equipment {
	
	private double usage = 0.0;
	
	

	
	public MultipleEquipment(String name, double usage){
		 this.setName(name);
		 this.usage = usage;
	 }
	@Override
	public void setUsage(double usage) {
		this.usage = usage;
	}
	
	@Override
	public double getUsage() {
		return this.usage;
	}

}
