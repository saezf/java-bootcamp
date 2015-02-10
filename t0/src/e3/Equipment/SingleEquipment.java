package e3.Equipment;

public class SingleEquipment extends Equipment {

	
	public  SingleEquipment(String name){
		 this.setName(name);
	 }
	@Override
	public void setUsage(double usage) {
	}
	
	@Override
	public double getUsage() {
		return 1.0;
	}
}
