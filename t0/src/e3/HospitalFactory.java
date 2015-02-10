package e3;

import e3.Services.Diagnosis;
import e3.Services.FollowUp;
import e3.Services.Service;
import e3.Services.ServiceBuilder;
import e3.Services.ServiceDirector;
import e3.Services.Surgery;
import e3.Services.Therapy;


//This calss doesn't implements factory pattern, at the beginning it was going to,I have to change the name to something else
public class HospitalFactory {
	private Hospital hospitaldeprueba = null;
	
	public Hospital getHospital(String[] services ) {
	
		 hospitaldeprueba = new Hospital("Some Hospital");
		ServiceBuilder serviceBuilder = null;
		for (String item : services) {
			switch(item) {
			 case "Diagnosis": 
				 serviceBuilder = new Diagnosis(item);
			     break;
			 case "Therapy": 
				 serviceBuilder = new Therapy(item);
			     break;
			 case "Follow-up": 
				 serviceBuilder = new FollowUp(item);
			     break;
			 case "Surgery 1": 
				 serviceBuilder = new Surgery(item);
			     break;
			 case "Surgery 2": 
				 serviceBuilder = new Surgery(item);
			     break;
			 }
			
			ServiceDirector serviceDirector = new ServiceDirector(serviceBuilder);
			serviceDirector.constructService();
			Service service = serviceDirector.getService();
			hospitaldeprueba.addService(service);
	
		}
		hospitaldeprueba.setMedics();
		hospitaldeprueba.setEquipment();
		return hospitaldeprueba;
	}

}