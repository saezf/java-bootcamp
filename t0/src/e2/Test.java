package e2;

public class Test {

	public static void main(String[] args) {
		BuildingBuilder builder = new House10x20Builder();
		Director director = new Director(builder);
		director.constructBuilding();
		Building building = director.getBuilding();
		System.out.println("Casa de: " + (building.getFloors())[0].getWidth() + "x" + (building.getFloors())[0].getLength() + "; y "
				+ (building.getFloors().length) + " Planta/s");
		for (int i = 0; i < building.getFloors().length; i++) {
			System.out.println("Area de la planta " + i + ": " + building.getFloors()[i].getArea());
		}
		System.out.println("Area total de la casa: " + building.getTotalArea());
		System.out.println("Tipo de techo: " + building.getRoof());
	}
}
