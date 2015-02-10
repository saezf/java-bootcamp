
public class HospitalFactory {
	public Buildings getBuilding(String type){
        if ("Hospital".equals(type)){
            return new Hospital();
        } else { 
            return new PoliceStation();
        } 
        
	} 
	
} 