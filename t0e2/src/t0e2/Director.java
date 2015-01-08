package t0e2;

public class Director {

	private BuildingBuilder buildingBuilder = null;

	public Director(BuildingBuilder buildingBuilder) {
		this.buildingBuilder = buildingBuilder;
	}

	public void constructBuilding() {
		buildingBuilder.buildRoof();
		buildingBuilder.buildFloors();

	}

	public Building getBuilding() {
		return buildingBuilder.getBuilding();
	}

}