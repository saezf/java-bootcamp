package e3.Services;

import e3.Medic;

public class Surgery implements ServiceBuilder {

	private Service service;

	public Surgery() {
		service = new Service();
	}
	public Surgery(String name) {
		service = new Service(name);
	}

	@Override
	public void buildEquipment() {
		service.setEquipment(new String[] { "Anaesthetic machine", "Operating room", "X-ray Unit" });
	}

	@Override
	public void buildEspecialists() {
	
		service.addMedics(new Medic(  "Radiologist",1.3) );
		service.addMedics(new Medic(  "Surgeon",0.4) );
		service.addMedics(new Medic(  "Anesthetist",0.4) );
	}

	@Override
	public Service getService() {
		return service;
	}
}