package com.bootcamp;

public class MyComplexApp {        // save as "MyComplexApp.java"
	public static void main(String[] args) {
		// Test program
		MyComplex c1 = new MyComplex(1.1, 2.2); 
		MyComplex c2 = new MyComplex(3.3, 4.4); 
		
		// Operations with Number 1: toString(), isReal(), IsImaginry(), magnitude()
		System.out.println("Number 1 is: " + c1);
		if(c1.isReal()){
			System.out.println(c1 + " is a pure real number.");
		}else{
			System.out.println(c1 + " is NOT a pure real number.");
		}
		if(c1.isImaginary()){
			System.out.println(c1 + " is a pure imaginary number.");
		}else{
			System.out.println(c1 + " is NOT a pure imaginary number.");
		}
		System.out.println("The magnitude of Number 1 is: " + c1.magnitud());
		
		// Operations with Number 2: toString(), isReal(), IsImaginry(), magnitude()
		System.out.println("Number 2 is: " + c2);
		if(c2.isReal()){
			System.out.println(c2 + " is a pure real number.");
		}else{
			System.out.println(c2 + " is NOT a pure real number.");
		}
		if(c2.isImaginary()){
			System.out.println(c2 + " is a pure imaginary number.");
		}else{
			System.out.println(c2 + " is NOT a pure imaginary number.");
		}
		System.out.println("The magnitude of Number 2 is: " + c2.magnitud());
		
		// Compare Equals?
		if(c1.equals(c2)){
			System.out.println(c1 + " is equal to " + c2);
		}else{
			System.out.println(c1 + " is NOT equal to " + c2);
		}
		
		//arguments inRadians, inDegrees
		System.out.println(c1.argumentInRadians());
		System.out.println(c2.argumentInDegrees());
		
		//Conjugate Numbers. produce new instances
		System.out.println(c1.conjugate());
		System.out.println(c2.conjugate());
		
		//Add Number 1 and 2. produce new instances
		System.out.println("The add result is: " + c1.add(c2));
		
		//Sustract Number 1 and 2. produce new instances
		System.out.println("The add result is: " + c1.subtract(c2));
		
		// multiplyWith(). modify this instance (c1)
		System.out.println("The result of Multiply" + c1 + " with " + c2 + "is: " + c1.multiplyWith(c2));
		
		// divideBy(). modify this instance (c1)
		System.out.println("The result of Multiply" + c1 + " with " + c2 + "is: " + c1.divideBy(c2));
		//
	}
}