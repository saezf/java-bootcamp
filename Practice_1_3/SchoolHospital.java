
public class SchoolHospital implements HospitalBuilder {
private Hospital hospital;
    
    public SchoolHospital(){
        hospital = new Hospital();
    }
    
    public void buildName() {
        hospital.setName("Hospital Escuela");
    }

    @Override
	public void buildAddress() {
    	hospital.setAddress("Av. 3 de Abril");
		
	}

	@Override
	public void buildRooms() {
		hospital.setRooms(200);
	}

	@Override
	public void buildOffices() {
		hospital.setOffices(70);
		
	}

           
        
    public void buildType() {
        hospital.setType("School");
    }

     
   
    public void buildPatients() {
        hospital.setPatients(850);
    }

   
    public void buildDoctors() {
        hospital.setDoctors(150);
    }

   
    public Hospital getHospital() {
        return hospital;
    }

	
	
    
}
