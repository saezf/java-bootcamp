package com.bootcamp;

public class TestMyPolynomial {        // save as "TestMyPolynomial.java"
   public static void main(String[] args) {
	// Test program
	// Can invoke with a variable number of arguments
	MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
	MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
	
	// Can also invoke with an array
	double[] coeffs = {1.2, 3.4, 5.6, 7.8};
	MyPolynomial p3 = new MyPolynomial(coeffs);
	

	//File f = new File("E:\\Bootcamp\\java-bootcamp\\OOP Exercises\\bin\\com\\bootcamp\\polinomials.txt");
    //File f = new File("src/com/bootcamp/polinomials.txt"); 
    MyPolynomial p4 = new MyPolynomial("src/com/bootcamp/polinomials.txt");
    //System.out.println(f.getAbsolutePath());
	
	System.out.println("Polinomio de grado: " + p1.getDegree() + " , " + p1);
	System.out.println("Polinomio de grado: " + p2.getDegree() + " , " + p2);
	System.out.println("Polinomio de grado: " + p3.getDegree() + " , " + p3);
	System.out.println("Polinomio de grado: " + p4.getDegree() + " , " + p4);
	
	System.out.println("Sum of polynomials p1 and p2: "+p1.add(p2));
	
	System.out.println("Sum of polynomials p2 and p1: "+p2.add(p1)); 

	p1 = new MyPolynomial(1.1, 2.2, 3.3);
	p2 = new MyPolynomial(1.1, 2.2, 3.3);
	System.out.println("Muliply of polynomials p1 and p2: "+p1.multiply(p2));  
   }
}