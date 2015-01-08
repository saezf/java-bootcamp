package t0e2;

public class House10x20Builder implements BuildingBuilder {

	private Building building;

	public House10x20Builder() {
		building = new Building();
	}

	@Override
	public Building getBuilding() {
		return building;
	}

	@Override
	public void buildRoof() {
		building.setRoof("Gable Roof");
	}

	@Override
	public void buildFloors() {
		Floor thefloor = new Floor();
		thefloor.setWidth(10.0f);
		thefloor.setLength(20.0f);
		Floor[] floors = { thefloor };
		building.setFloors(floors);
	}

	public void buildFloors(Floor[] thefloors) {

		building.setFloors(thefloors);
	}
}
