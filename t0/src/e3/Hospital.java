package e3;

import java.util.ArrayList;
import java.util.List;

import e3.Equipment.Equipment;
import e3.Equipment.EquipmentFactory;
import e3.Services.Service;

public class Hospital {
//	private String type;
	private String name;
	//private int beds;
	private List<Service> services;
	private List<Medic> medics;
	private List<Equipment> equipment;
	public Hospital(String name){

		this.name = name;
		services = new ArrayList<Service>();
		medics = new ArrayList<Medic>();
		equipment = new ArrayList<Equipment>();
	}

	
	public void setName(String name) {this.name = name;	}
	public String getName() {return this.name;}
	

	/**
	 * If not found adds the equipment to the equipment list of the hospital.
	 * If the equipment is already on the list, increases its the usage value.
	 * @param equip
	 */
	public void addEquipment(Equipment equipment) {
boolean flag = false;
		for (Equipment item : this.equipment) {
			if (item.getName() == equipment.getName()) {
				item.setUsage(item.getUsage() + equipment.getUsage());
				flag = true;
			}
		}
		if (flag){this.equipment.add(equipment);}
	}
	public void removeEquipment(String equipment) {
		for (Equipment item : this.equipment) {
			if (item.getName() == equipment) {
				this.equipment.remove(item);
			}
		}
	}

	/**
	 * If not found adds the medic to the medics list of the hospital.
	 * If the medic is already on the list, increases its the amount value.
	 * @param medic
	 */
	public void addMedic(Medic medic) {
boolean flag = true;
		for (Medic item : this.medics) {
			if (item.getKind() == medic.getKind()) {
				item.setAmount(item.getAmount() + medic.getAmount());
				flag = false;
			}
		}
		if (flag){this.medics.add(medic);}
	}
	public void removeMedic(String Kind) {
		for (Medic item : this.medics) {
			if (item.getKind() == Kind) {
				this.medics.remove(item);
			}
		}
	}
	public void addService(Service service) {
	if (!this.services.contains(service))
	{this.services.add(service);}
	}

	//public void setEquipment(String[] equipment) {this.equipment = equipment;}

	//this.equipment
//	public void setDoctors(List<Medic> medics) {this.doctors = medics;}
	public List<Medic> getMedics() {return this.medics;}
	public List<Service> getServices() {return this.services;}
	
//	public abstract String getServices();
	/**
	 * Add the Medic Staff
	 */

	public void setMedics()
	{
		for (Service service: services) {
			for (Medic medic: service.getMedics()) {
				addMedic(medic);	
			}
		}
	}
	public void setEquipment()
	{
		EquipmentFactory equipmentFactory = EquipmentFactory.getInstance();
		for (Service service: services) {
			for (String equipment: service.getEquipment()) {
				addEquipment(equipmentFactory.getEquipment(equipment));	
			}
		}
	}
	private int redon(double n)
	{
		int ent= (int)n;
		double dec= n - ent;
		if (dec < 5.0)
			{return ent +1;}
		return ent;
	}
	public Medic getMedicKind(String Kind) {
		for (Medic item : this.medics) {
			if (item.getKind() == Kind) {
				return (item);
			}
		}
		return new Medic("NO ENCONTRADO",0.0);
	}
	public String toString(){
	return ("Tipos de Medicos: "+ this.medics.size()+"; Anesthetists: "+ redon(getMedicKind("Anesthetist").getAmount())+"; Servicios prestados: "+services.size()+". Y bueno se pueden sacar los datos individuales pero ya no tengo ganas");	
	}
}
