package t0e106;

public class TestMyComplex {

	public static void main(String[] args) {
		MyComplex complex = new MyComplex(1.1 , 2.2);
		MyComplex complex2 = new MyComplex(3.3 , 4.4);
		System.out.println("Number 1 is: "+ complex.toString());
		System.out.println(complex.toString()+ " is "+complex.isReal() +" pure real number");
		System.out.println(complex.toString()+ " is "+complex.isImaginary() +" pure imaginary number");
		System.out.println("in degrees: " + complex.argumentDegrees());
		System.out.println("in radians: " + complex.argumentInRadians());
		System.out.println("");
		System.out.println("Number 2 is: "+ complex.toString());
		System.out.println(complex2.toString()+ " is "+complex2.isReal() +" pure real number");
		System.out.println(complex2.toString()+ " is "+complex2.isImaginary() +" pure imaginary number");
		System.out.println("in degrees: " + complex2.argumentDegrees());
		System.out.println("in radians: " + complex2.argumentInRadians());
		System.out.println("");
		System.out.println(complex.toString()+ " is " + complex.equals(complex2.getReal(), complex2.getImag()) + " equal to " +complex2.toString() +  " // method(double, double)");
		System.out.println(complex.toString()+ " is " + complex.equals(complex2) + " equal to " +complex2.toString() +  " // method(mycomplex another)");
		System.out.println("equals (double,double): " + complex.toString()+ " == " + complex2.toString() + ": " + complex.equals(complex2.getReal(), complex2.getImag()));
		System.out.println("equals (mycomplex another): " + complex.toString()+ " == " + complex2.toString() + ": " +  complex.equals(complex2));
		System.out.println("magnitude: " + complex.magnitude());
		System.out.println("conjugate: " + complex.conjugate());
		System.out.println("add: "+complex.toString()+ " + " +   complex2 + " =" + complex.add(complex2));
		System.out.println("substract: " + complex2 + " =" + complex.subtract(complex2));
		System.out.println("multiply: "+complex.toString()+ " * " + complex2 + " = " + complex.multiplyWith(complex2));
		System.out.println("divide: "+complex.toString()+ " / " + complex2 + " = " + complex.divideBy(complex2));


	
	}

}