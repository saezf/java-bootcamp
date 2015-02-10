package e3;

import e3.Services.Service;


public class Prueba {

	public static void main(String[] args) {

			HospitalFactory hospitalFactory = new HospitalFactory();

			Hospital h1 = hospitalFactory.getHospital(new String[] { "Therapy","Surgery 2","Surgery 1"});
System.out.println(h1.toString());
for (Service service: h1.getServices()) {
	System.out.println( "" + service.getName());
}
	
}}
