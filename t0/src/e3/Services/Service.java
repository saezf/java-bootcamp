package e3.Services;

import java.util.ArrayList;
import java.util.List;

import e3.Medic;


public  class Service {

	private String[] equipment;
	private List<Medic> medics;
	public List<Medic>  getMedics(){ return medics;}
	public String[]  getEquipment(){ return equipment;}
	public void setEquipment(String[] equipment) {this.equipment = equipment;	}
	public void addMedics(Medic medic) {
		if (medics == null){medics= new ArrayList<Medic>();}
		this.medics.add(medic);	}
	private String name;
	public void setName(String name) {this.name = name;	}
	public String getName() {return this.name;}
	public Service(){};
	public Service(String name){
    setName(name);
	}
//	public abstract String giveService();
	}

