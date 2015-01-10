package t0e1.s1.i7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MyPolynomial {
	
	
	private double[] coeffs;	
	
	
	public MyPolynomial(double... coeffs) {
		this.coeffs = coeffs;
	}

	public MyPolynomial(String filename) {
		Scanner in = null;
		try {
			in = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	//	try {
			int degree = Integer.parseInt(in.nextLine());
			coeffs = new double[degree + 1];
			for (int i = 0; i < coeffs.length; ++i) {
				coeffs[i] = Double.parseDouble(in.nextLine());
			}
	//	} catch (NumberFormatException e) {
	//		e.printStackTrace();
	//	}
	}

	public int getDegree() {
		return coeffs.length - 1;
  }

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int n = coeffs.length - 1; n >= 0; n--) {
			sb.append(coeffs[n] + (n != 0 ? "*x^" + n + " + " : ""));
		}
		return sb.toString();
	}
	
	public double evaluate(double x)
    {
        double sum  = 0.0;
        double item = 1.0;
        for (int i = 0; i < coeffs.length; i++) {
            item *= (i == 0 ? 1.0 : x);
            sum  += item * coeffs[i] ;
        }
        return sum;
    }
	
	

	public MyPolynomial add(MyPolynomial another)
    {
        if (this.getDegree() < another.getDegree()) {
        	//recursion to avoid have the same method twice on an if structure.
        	return another.add(this);
        }
        //Now this is has the bigger degree
        double[] ret  = new double[this.getCoeffs().length];
        double[] aux = another.getCoeffs();
        //passes it to an auxiliary variable
        System.arraycopy(this.getCoeffs(),0 ,ret, 0, this.getCoeffs().length);
        //iterates the polynomial with the smaller degree adding each element to the auxiliary
        for (int i = 0; i < another.getCoeffs().length; i++)
        {
        	ret[i] += aux[i];
        }
        return new MyPolynomial(ret);
    }
	
	
	public MyPolynomial multiply(MyPolynomial another)
    {
        double[] ret  = new double[this.getDegree() + another.getDegree()+1];
        //Starts with 0.0
        double[] arg = another.getCoeffs();
        for (int mine =0; mine < this.coeffs.length; mine++) // iterates this.coeffs 
        {
            for (int other = 0; other <arg.length; other++) //iterates another.coeffs 
            {
            	//Acumulaes the multiplied coeffs in the respective position
            	ret[mine + other] += this.coeffs[mine] * arg[other];
            }
          
        }
        return new MyPolynomial(ret);
    }
	    

 
	public double[] getCoeffs() {
		return coeffs;
	}

	public void setCoeffs(double[] coeffs) {
		this.coeffs = coeffs;
	}
	
	
}