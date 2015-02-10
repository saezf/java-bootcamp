package com.bootcamp;

public class TestMyCircle {        // save as "TestMyCircle.java"
   public static void main(String[] args) {
	   // creamos un punto
	   MyPoint aPoint = new MyPoint (3,4);
	   // Usamos el constructor pasando como argumento un punto y un radio
	   MyCircle aCircle = new MyCircle(aPoint, 5);
	   // Usamos el contructor pasando las coordenadas del centro y el radio
	   MyCircle anotherCircle = new MyCircle(3,4,6);
	   
	   //mostrando por pantalla accediendo a los atributos
	   System.out.println("Circle @ ( " + aCircle.getCenterX() + " , " + aCircle.getCenterY() + " ) radius = "
	   + aCircle.getRadius());
	   System.out.println("Area: " + aCircle.getArea());
	   // mostrando por pantalla por medio del metodo toString
	   System.out.println(anotherCircle);
	   
	   System.out.println("Area: " + anotherCircle.getArea());
   }
}