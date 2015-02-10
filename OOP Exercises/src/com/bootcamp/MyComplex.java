package com.bootcamp;

public class MyComplex {           // save as "MyComplex.java"
	private Double real;
	private Double imag;
	
	public MyComplex (double x, double y) {
		this.real = x;
		this.imag = y;
	}

	public Double getReal() {
		return real;
	}

	public void setReal(Double real) {
		this.real = real;
	}

	public Double getImag() {
		return imag;
	}

	public void setImag(Double imag) {
		this.imag = imag;
	}
	
	public void setValue(Double real, Double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public String toString() {
		return "( " + real + " , " + imag + "i )";
	}
	
	public boolean equals(double real, double imag){
		if(this.real==real && this.imag==imag){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean equals(MyComplex another){
		if(this.real==another.getReal() && this.imag==another.getImag()){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isReal(){
		if(this.imag==0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isImaginary(){
		if(this.real==0){
			return true;
		}else{
			return false;
		}
	}
	
	public Double magnitud(){
		double r = getReal();
		double i = getImag();
		return Math.sqrt((r*r)+(i*i));
	}
	
	public Double argumentInRadians(){
		return Math.atan2(real, imag);
	}
	
	public int argumentInDegrees(){
		int r = (argumentInRadians()).intValue();
		return r;
	}
	
	public MyComplex conjugate(){
		MyComplex comp = new MyComplex(this.getReal(),-this.getImag());
		return comp;
	}
	
	public MyComplex add(MyComplex another){
		double r = this.getReal()+another.getReal();
		double i = this.getImag()+another.getImag();
		MyComplex comp = new MyComplex(r,i);
		return comp;
	}
	
	public MyComplex subtract(MyComplex another){
		double r = this.getReal()-another.getReal();
		double i = this.getImag()-another.getImag();
		MyComplex comp = new MyComplex(r,i);
		return comp;		
	}
	
	public MyComplex multiplyWith(MyComplex another){
		double r = (this.getReal()*another.getReal())-(this.getImag()+another.getImag());
		double c = (this.getReal()*another.getImag())+(this.getImag()+another.getReal());
		this.setValue(r, c);
		return this;		
	}
	
	public MyComplex divideBy(MyComplex another){
		MyComplex conj = another.conjugate();
		Double c = another.getReal();
		Double d = another.getImag();
		Double cxd = (c*c)+(d*d);
		MyComplex mult = (this.multiplyWith(conj));
		this.setValue((mult.getReal()/cxd), (mult.getImag()/cxd));
		return this;
	}
}