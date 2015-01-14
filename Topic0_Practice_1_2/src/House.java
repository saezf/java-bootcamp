public class House{
	
	private int width;
	private int lenght;
	private int rooms;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	
	public int getArea(int width,int lenght){
		return width*lenght;
	}

	public String toString(){
		return  rooms + " rooms, " + width + " widht, " + lenght  + " height, "
				+ " total area: " + getArea(width,lenght);
	}
}