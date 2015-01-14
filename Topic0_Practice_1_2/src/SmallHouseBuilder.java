public class SmallHouseBuilder implements HouseBuilder{
	private House house;
	
	public SmallHouseBuilder(){
		house = new House();
	}
	
	@Override
	public void buildWidth(){
		house.setWidth(100);
	}
	
	@Override
	public void buildLenght(){
		house.setLenght(100);
	}
	
	@Override
	public void buildRooms(){
		house.setRooms(3);
	}
	
	@Override
	public House getHouse(){
		return house;
	}
}