
public class MyComplexApp {
	public static void main(String[] args) {
		MyComplex complex1 = new MyComplex(1.1 , 2.2);
		MyComplex complex2 = new MyComplex(3.3 , 4.4);
		System.out.println("Number 1 is: "+ complex1.toString());
		System.out.println(complex1.toString()+ " is "+complex1.isReal() +" pure real number");
		System.out.println(complex1.toString()+ " is "+complex1.isImaginary() +" pure imaginary number");
		System.out.println("in degrees: " + complex1.argumentInDegrees());
		System.out.println("in radians: " + complex1.argumentInRadians());
		System.out.println("");
		System.out.println("Number 2 is: "+ complex2.toString());
		System.out.println(complex2.toString()+ " is "+complex2.isReal() +" pure real number");
		System.out.println(complex2.toString()+ " is "+complex2.isImaginary() +" pure imaginary number");
		System.out.println("in degrees: " + complex2.argumentInDegrees());
		System.out.println("in radians: " + complex2.argumentInRadians());
		System.out.println("");
		System.out.println(complex1.toString()+ " is " + complex1.equal(complex2.getReal(), complex2.getImag()) + " equal to " +complex2.toString() +  " // method(double, double)");
		System.out.println(complex1.toString()+ " is " + complex1.equal(complex2) + " equal to " +complex2.toString() +  " // method(mycomplex another)");
		System.out.println("equal: " + complex1.toString()+ " == " + complex2.toString() + ": " + complex1.equal(complex2.getReal(), complex2.getImag()));
		System.out.println("add: "+complex1.toString()+ " + " +   complex2 + " =" + complex1.add(complex2));
		System.out.println("substract: " + complex2 + " =" + complex1.subtract(complex2));
	
	}
}
