package com.bootcamp;

public class TestCircle {        // save as "TestCircle.java"
   public static void main(String[] args) {
      // Declare and allocate an instance of class Circle called c1
      //  with default radius and color
      Circle c1 = new Circle();
      // Use the dot operator to invoke methods of instance c1.
      System.out.println("The circle has radius of " 
         + c1.getRadius() + " and area of " + c1.getArea());
      System.out.println("The circle color is: " + c1.getColor());
      System.out.println(c1.toString());   // explicit call
   
      // Declare and allocate an instance of class circle called c2
      //  with the given radius and default color
      Circle c2 = new Circle(2.0);
      // Use the dot operator to invoke methods of instance c2.
      System.out.println("The circle has radius of " 
         + c2.getRadius() + " and area of " + c2.getArea());
      System.out.println("The circle color is: " + c2.getColor());
      System.out.println(c2);             // println() calls toString() implicitly, same as above
      System.out.println("Operator '+' invokes toString() too: " + c2);  // '+' invokes toString() too
      
      // Declare and allocate an instance of class circle called c3
      //  with the given radius and color
      Circle c3 = new Circle(3.0, "blue");
      // Use the dot operator to invoke methods of instance c2.
      System.out.println("The circle has radius of " 
         + c3.getRadius() + " and area of " + c3.getArea());
      System.out.println("The circle color is: " + c3.getColor());
      
      Circle c4 = new Circle();   // construct an instance of Circle
      c4.setRadius(5.0);          // change radius
      c4.setColor("green");       // change color
      System.out.println("The circle has radius of " 
      + c4.getRadius() + " and area of " + c4.getArea());
      System.out.println("The circle color is: " + c4.getColor());
      
      /* System.out.println(c1.radius); el atributo del radio no se puede obtener
       * ni reasignar directamente. Los atributos de la clase Circle son visibles solo por la clase misma
       * Para acceder a estos atributos (privados) fuera de la clase Circle debe ser por medio 
       * de los metodos set y get
       */
   }
}