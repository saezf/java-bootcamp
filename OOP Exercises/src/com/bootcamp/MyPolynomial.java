package com.bootcamp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyPolynomial {           // save as "MyPolynomial.java"
	private double[] coeffs;
	public MyPolynomial(double... coeffs) {  // varargs
	this.coeffs = coeffs;                 // varargs is treated as array
	}
	
	//Obtain the Polinomial from a file
	public MyPolynomial(String filename) {
		Scanner in = null;
		try {
			in = new Scanner(new File(filename));  // open file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int degree = in.nextInt();      // read the degree
		coeffs = new double[degree+1];  // allocate the array
		for (int i=0; i<coeffs.length; ++i) {
			coeffs[i] = in.nextDouble();
		}
	}
	
	// getters and setters

}