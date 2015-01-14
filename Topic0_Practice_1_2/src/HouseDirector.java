public class HouseDirector{
	
	private HouseBuilder houseBuilder = null;
	
	public HouseDirector(HouseBuilder houseBuilder){
		this.houseBuilder = houseBuilder;
	}
	
	public void constructHouse(){
		houseBuilder.buildWidth();
		houseBuilder.buildLenght();
		houseBuilder.buildRooms();
	}
	
	public House getHouse(){
		return houseBuilder.getHouse();
	}
}