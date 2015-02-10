package com.bootcamp;

public class TestMyTriangle {        // save as "TestMyTriangle.java"
   public static void main(String[] args) {
	   // Test program
	   MyTriangle t1 = new MyTriangle(-1,5,0,-4,8,4);
	   System.out.println(t1);
	   System.out.println(t1.getPerimeter());
	   System.out.println(t1.printType());
	   
	   MyTriangle t2 = new MyTriangle(-2,-1,3,2,5,-5);
	   System.out.println(t2);
	   System.out.println(t2.getPerimeter());
	   System.out.println(t2.printType());
   }
}