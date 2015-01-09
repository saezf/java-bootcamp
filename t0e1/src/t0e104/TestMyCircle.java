package t0e104;

import t0e103.MyPoint;

public class TestMyCircle { 
	public static void main(String[] args) {
		MyCircle c1 = new MyCircle(new MyPoint(1, 2), 3);
		MyCircle c2 = new MyCircle(2, 4, 3);
		System.out.println(c1.toString());
		System.out.println(c2.getArea());
		System.out.println(c2.toString());
		System.out.println(c2.getCenterX());
		System.out.println(c2.getCenterY());
		System.out.println(c2.getCenter());
		System.out.println(c2.getRadius());
	
	}
}
