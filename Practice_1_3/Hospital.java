
public class Hospital extends Buildings {
	private String name, address,type;
	private int rooms, offices, patients, doctors;
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getType(){
		return this.type;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	
	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public int getOffices() {
		return offices;
	}

	public void setOffices(int offices) {
		this.offices = offices;
	}

	public int getPatients() {
		return patients;
	}

	public void setPatients(int patients) {
		this.patients = patients;
	}

	public int getDoctors() {
		return doctors;
	}

	public void setDoctors(int doctors) {
		this.doctors = doctors;
	}

	
	public String toString() {
        return "Hospital" + "name=" + name + ", addres=" + address +", type=" + type + ", rooms=" + rooms + ", offices=" + offices +", patients=" + patients + ", number of doctors=" + doctors;
    }
	@Override
	public String publicTypeBuildings() {
		return ("Hospital");
	}

	

	
	
}
