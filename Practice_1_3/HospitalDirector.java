
public class HospitalDirector {
    public HospitalBuilder hospitalBuilder = null;
    
    public HospitalDirector(HospitalBuilder hospitalBuilder){
        this.hospitalBuilder = hospitalBuilder;
    }
    
    public void constructHospital(){
    	hospitalBuilder.buildName();
    	hospitalBuilder.buildType();
    	hospitalBuilder.buildAddress();
    	hospitalBuilder.buildRooms();
    	hospitalBuilder.buildOffices();
    	hospitalBuilder.buildPatients();
    	hospitalBuilder.buildDoctors();
    }
    
    public Hospital getHospital(){
        return hospitalBuilder.getHospital();
    }
}
