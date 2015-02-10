package com.bootcamp;

public class MyCircle {           // save as "MyCircle.java"
	// private instance variable, not accessible from outside this class
	private MyPoint center;
	private int radius;
	
	public MyCircle(int x, int y, int radius) {
		this.center = new MyPoint(x,y);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getCenterX() {
		return center.getX();
	}
	
	public int getCenterY() {
		return center.getY();
	}
	
	public void setCenterXY(int x, int y) {
		this.center = new MyPoint(x,y);
	}
	
	// A public method for computing the area of circle
	public double getArea() {
	return radius*radius*Math.PI;
	}
	
	public String toString() {
		return "Circle @ ( " + center.getX() + " , " + center.getY() + " ) radius = " + radius;
	}
}