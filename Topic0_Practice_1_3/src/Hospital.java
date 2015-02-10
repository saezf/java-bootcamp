public abstract class Hospital{
	private String name;
	private int medics;
	private boolean maxOfBeds;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMedics() {
		return medics;
	}
	public void setMedics(int medics) {
		this.medics = medics;
	}
	public boolean isMaxOfBeds() {
		return maxOfBeds;
	}
	public void setMaxOfBeds(boolean maxOfBeds) {
		this.maxOfBeds = maxOfBeds;
	}
}