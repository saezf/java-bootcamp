
public class MyComplex {
	private double real,imag;

	public MyComplex(double real, double imag) {
		super();
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

	public void  setValue(double real, double imag){
		this.real = real;
		this.imag = imag;
	}

	@Override
	public String toString() {
		return  "("+ real + " + " + imag + "i) where x and y are the real and imaginary parts respectively.";
	}
	
	public boolean isReal(){
		return (imag == 0);
	}
	
	public boolean isImaginary(){
		return (real == 0);
	}
	
	public boolean equal(double real, double imag){
        if (this.real == real && this.imag == imag) {
        	return true;
        } else { 
        	return false; 
        }
    }
	
	public boolean equal(MyComplex another){
		 if (this.real == another.real && this.imag == another.imag) {
			 return true;
		    } else { 
		    	return false; 
		    }
    }
	
	public double magnitude(){
		return Math.sqrt(real*real + imag*imag);
	}
	

	public double argumentInRadians(){
        return Math.atan2(imag, real);
    }
    
    public int argumentInDegrees(){
        double temp = this.argumentInRadians();
        return (int) ((180*temp)/Math.PI); 
    }
    
    public MyComplex conjugate(){
        return new MyComplex(real, -imag);
    }
    
    public MyComplex add(MyComplex another){
        return new MyComplex(this.real+another.real, this.imag+another.imag);
       
    }
    
    public MyComplex subtract(MyComplex another){
        return new MyComplex(this.real-another.real, this.imag-another.imag);
       
    }
    
    public MyComplex multiplyWith(MyComplex another){
        double a = (this.real*another.real - this.imag*another.imag);
        double b = (this.real*another.imag + this.imag*another.real);
        this.setValue(a, b);
        return this;
    }
    
     public MyComplex divideBy(MyComplex another){
        double a = (this.real/another.real - this.imag/another.imag);
        double b = (this.real/another.imag + this.imag/another.real);
        this.setValue(a, b);
        return this;
    }
}

