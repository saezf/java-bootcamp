package t0e106;

public class MyComplex {

	private double real;
	private double imag;

	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public String toString() {
		return ("(" + this.getReal() + " + " + this.getImag() + "i)");
	}
//Methods isReal() and isImaginary() that returns true if this complex number is real or imaginary, respectively. 
	//that was the consing, then on the test they start speacking of pure real or pure imaginary
	// 0 + 0i is a real number... also
	public boolean isReal() {
		return (this.imag == 0.0);
	}

	public boolean isImaginary() {
		return (this.real == 0.0);
	}

	public boolean equals(double real, double imag) {
		return (this.real == real && this.imag == imag);
	}

	public boolean equals(MyComplex another) {
		return (this.real == another.getReal() && this.imag == another.getImag());
	}

	public double magnitude() {
		return (Math.sqrt((real * real) + (imag * imag)));

	}

	public double argumentInRadians() {
		return (Math.atan2(imag, real));
	}

	public int argumentDegrees() {
		return ((int) (argumentInRadians() * 180.0 / Math.PI));
		}

	public MyComplex conjugate() {
		
		return new MyComplex(real, -1.0 * imag);
	}

	public MyComplex add(MyComplex another) {
		return new MyComplex(real + another.getReal(), imag + another.getImag());
	}

	public MyComplex subtract(MyComplex another) {
		  return new MyComplex(real-another.getReal(), imag-another.getImag());
	}

	public MyComplex multiplyWith(MyComplex another) {
		double x = (real * another.getReal() - imag * another.getImag());
		double y = (real * another.getImag() + imag * another.getReal());
		this.setValue(x, y);
        return this;

	}

	public MyComplex divideBy(MyComplex another) {
		double x = (real * another.getReal() + imag * another.getImag());
		double y = (imag * another.getReal() - real * another.getImag());
		double aux = (another.getReal() * another.getReal() + another.getImag() * another.getImag());
		// (a+bi/c+di) = [(ac+bd)/(c^2+d^2)] + [(bc+ad)/(c^2+d^2)]i
		this.setValue(x/aux, y/aux);
		return this;
				
	}


}