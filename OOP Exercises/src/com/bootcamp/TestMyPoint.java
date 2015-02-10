package com.bootcamp;

public class TestMyPoint {        // save as "TestMyPoint.java"
   public static void main(String[] args) {
	
	// Test program
	   MyPoint p1 = new MyPoint(3, 0);
	   MyPoint p2 = new MyPoint(0, 4);
	   
	// Testing the overloaded method distance()
		System.out.println(p1.distance(p2));    // this version takes a MyPoint instance as argument
		System.out.println(p1.distance(5, 6));  // this version takes two ints as arguments
   
		MyPoint[] points = new MyPoint[10]; // Declare and allocate an array of MyPoint
		for (int i=0; i<points.length; i++) {
			points[i] = new MyPoint(i+1,i+1);    // Allocate each of MyPoint instances
			System.out.println("Point: " + points[i]);
		}
   }
}