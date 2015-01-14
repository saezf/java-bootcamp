public class Demo{
	
	public static void main(String[] args) {
		
		HouseBuilder houseBuilder = new SmallHouseBuilder();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		House house = houseDirector.getHouse();
		System.out.println("House with: " + house);
		
		houseBuilder = new MediumHouseBuilder();
		houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		house = houseDirector.getHouse();
		System.out.println("House with: " + house);
	}
}