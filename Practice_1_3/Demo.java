
public class Demo {

	public static void main(String[] args) {
        
        HospitalFactory f = new HospitalFactory();
        
        
        Buildings b = f.getBuilding("Hospital");
        System.out.println(b.publicTypeBuildings());
        
        
        Buildings b2 = f.getBuilding("security");
        System.out.println(b2.publicTypeBuildings());
        
       
        HospitalBuilder hb = new SchoolHospital();
        HospitalDirector hd = new HospitalDirector(hb);
        hd.constructHospital();
        Hospital hospital = hd.getHospital();
        System.out.println(hospital);
        
    }
}
