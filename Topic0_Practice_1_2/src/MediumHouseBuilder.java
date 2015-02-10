public class MediumHouseBuilder implements HouseBuilder{
	private House house;
	
	public MediumHouseBuilder(){
		house = new House();
	}
	
	@Override
	public void buildWidth(){
		house.setWidth(200);
	}
	
	@Override
	public void buildLenght(){
		house.setLenght(200);
	}
	
	@Override
	public void buildRooms(){
		house.setRooms(7);
	}
	
	@Override
	public House getHouse(){
		return house;
	}
}