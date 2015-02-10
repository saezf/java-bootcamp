package e1.s1.i5;

import e1.s1.i3.MyPoint;

public class TestMyTriangle {

	public static void main(String[] args) {
		MyTriangle t1 = new MyTriangle(new MyPoint(-5, 0), new MyPoint(5, 0), new MyPoint(0, 43));
		MyTriangle t2 = new MyTriangle(new MyPoint(71, 12), new MyPoint(52, 42), new MyPoint(55, 25));

		System.out.println(t1);
		System.out.println("perimeter t1:  " + t1.getPerimeter());
		System.out.println("Type t1:  " + t1.printType());
		System.out.println(t2);
		System.out.println("perimeter t2:  " + t2.getPerimeter());
		System.out.println("Type t2:  " + t2.printType());

	}

}
