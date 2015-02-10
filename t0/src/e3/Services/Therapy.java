package e3.Services;

import e3.Medic;

public class Therapy implements ServiceBuilder {

	private Service service;

	public Therapy() {
		service = new Service();
	}
	public Therapy(String name) {
		service = new Service(name);
	}
	@Override
	public void buildEquipment() {

		service.setEquipment(new String[] { "Consultorie" });
	}

	@Override
	public void buildEspecialists() {
		service.addMedics(new Medic(  "General Practitioner", 1.3) );
	}

	@Override
	public Service getService() {
		return service;
	}
}