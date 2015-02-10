package com.bootcamp;

public class MyTriangle {           // save as "MyTriangle.java"
	// private instance variable, not accessible from outside this class
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.v1 = new MyPoint(x1,y1);
		this.v2 = new MyPoint(x2,y2);
		this.v3 = new MyPoint(x3,y3);
	}
	
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	public String toString() {
		return "Triangle @ ( " + v1.getX() + " , " + v1.getY() +  " ),( " + v2.getX() + " , " 
				+ v2.getY() + " ),( " + v3.getX() + " , " + v3.getY() + " )";
	}
	
	public Double getPerimeter() {
		return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
	}
	
	public String printType(){
		double d1 = v1.distance(v2);
		double d2 = v2.distance(v3);
		double d3 = v3.distance(v1);
		if (d1==d2 && d2==d3){
			return "Equilatero";
		}else {
			if ((d1==d2) || (d2==d3) || (d1==d3)){
				return "Isosceles";
			}else{
				return "Escaleno";
			}
		}
	}
	
}