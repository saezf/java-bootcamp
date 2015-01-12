package e3.Services;

import e3.Medic;

public class Diagnosis implements ServiceBuilder {
	private Service service;

	public Diagnosis() {
		service = new Service();
	}
	public Diagnosis(String name) {
		service = new Service(name);
	}
	@Override
	public void buildEquipment() {

		service.setEquipment(new String[] { "Consultorie" });

	}

	@Override
	public void buildEspecialists() {
		//service.medics = new Arraylist();
		service.addMedics(new Medic(  "General Practitioner",1.3) );
	}

	@Override
	public Service getService() {
		return service;
	}
}
