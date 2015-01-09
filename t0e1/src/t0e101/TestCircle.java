package t0e101;

public class TestCircle {       
	/*
	 * Try 3 public vs. private: In TestCircle, can you access the instance
	 * variable radius directly (e.g., System.out.println(c1.radius)); or assign
	 * a new value to radius (e.g., c1.radius=5.0)? Try it out and explain the
	 * error messages.
	 * 
	 * On the class Circle the attributes are declared as private, and you can't
	 * access them directly, thats why you made the getters and setters and you
	 * declare those methods as public methods. this allows you to encapsulate
	 * the state/behavior of your class, i.g: you could add some other
	 * modification like "times you changed the color"(stored on a private
	 * variable that doesn't exist here), to the setColor method (adding
	 * variable++) and don't provide a setter for that variable, only a getter.
	 */

	   public static void main(String[] args) {
	      // Declare and allocate an instance of class Circle called c1
	      //  with default radius and color
	      Circle c1 = new Circle();
	      // Use the dot operator to invoke methods of instance c1.
	      System.out.println("The 1 circle has radius of " 
	         + c1.getRadius() + " and area of " + c1.getArea());
	   
	      // Declare and allocate an instance of class circle called c2
	      //  with the given radius and default color
	      Circle c2 = new Circle(2.0);
	      // Use the dot operator to invoke methods of instance c2.
	      System.out.println("The 2 circle has radius of " 
	         + c2.getRadius() + " and area of " + c2.getArea());
	      Circle c3 = new Circle();   // construct an instance of Circle
	      c3.setRadius(5.0);          // change radius
	      c3.setColor("Transparent");
	      System.out.println("The 3 circle has radius of " 
	 	         + c3.getRadius() + " and area of " + c3.getArea() + " and the color is" +c3.getColor());        // change color
	   
	      
	      System.out.println(c1.toString());   // explicit call

	   
	      System.out.println(c2.toString());  // explicit call
	      System.out.println(c2);             // println() calls toString() implicitly, same as above
	      System.out.println("Operator '+' invokes toString() too: " + c2);  // '+' invokes toString() too
	   
	   }
	}	
