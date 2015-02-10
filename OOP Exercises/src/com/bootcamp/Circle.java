package com.bootcamp;

public class Circle {           // save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   // 1st constructor, which sets both radius and color to default
   public Circle() {
      this.radius = 1.0;
      this.color = "red";
   }
   
   // 2nd constructor with given radius, but color default
   public Circle(double radius) {
	   this.radius = radius;
	   this.color = "red";
   }
   
   // Constructor to construct a new instance of Circle with the given radius and color
   public Circle (double radius, String color) {
	   this.radius = radius;
	   this.color = color;
   }
   
	// Setter for instance variable radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
 
	// Setter for instance variable color
	public void setColor(String color) { 
		this.color = color;
	}

   // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }
   
   // Getter for instance variable color
   public String getColor() {
	   return color;
   }
   
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }
   
   public String toString() {
	   return "Circle: radius=" + radius + " color=" + color;
	}
}