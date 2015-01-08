package t0e2;

public class Building {
	private Floor[] floors;
	private String roof;

	public void setRoof(String roofType) {
		this.roof = roofType;
	}

	public String getRoof() {
		return this.roof;
	}

	public void setFloors(Floor[] floors) {
		this.floors = floors;
	}

	public Floor[] getFloors() {
		return this.floors;
	}

	public float getTotalArea() {
		float areatotal = 0.0f;
		for (Floor item : floors) {
			areatotal += item.getArea();
		}
		return areatotal;
	}

}

class Floor {
	private float width;
	private float length;

	public void setWidth(float width) {
		this.width = width;
	}

	public float getWidth() {
		return this.width;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getLength() {
		return this.length;
	}

	public float getArea() {
		return width * length;
	}

}
