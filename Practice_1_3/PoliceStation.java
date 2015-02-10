
public class PoliceStation extends Buildings {
	private String name, address,type;
	private int cels, offices, policeOfficers;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getCels() {
		return cels;
	}



	public void setCels(int cels) {
		this.cels = cels;
	}



	public int getOffices() {
		return offices;
	}



	public void setOffices(int offices) {
		this.offices = offices;
	}



	public int getPoliceOfficers() {
		return policeOfficers;
	}



	public void setPoliceOfficers(int policeOfficers) {
		this.policeOfficers = policeOfficers;
	}



	@Override
	public String toString() {
		return "PoliceStation [name=" + name + ", address=" + address + ", type=" + type + ", cels=" + cels + ", offices=" + offices
				+ ", policeOfficers=" + policeOfficers + "]";
	}



	@Override
	public String publicTypeBuildings() {
		// TODO Auto-generated method stub
		return ("Security");
	}

}
