package t0e1.s1.i5;

import t0e1.s1.i3.MyPoint;

public class MyTriangle {

	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;

	/*
	 * public MyPoint getV1() { return v1; } public void setV1(MyPoint v1) {
	 * this.v1 = v1; } public MyPoint getV2() { return v2; } public void
	 * setV2(MyPoint v2) { this.v2 = v2; } public MyPoint getV3() { return v3; }
	 * public void setV3(MyPoint v3) { this.v3 = v3; }
	 */
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.v1 = (new MyPoint(x1, y1));
		this.v2 = (new MyPoint(x2, y2));
		this.v3 = (new MyPoint(x3, y3));
	}

	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	public String toString() {
		return ("Triangle @ " + v1.toString() + ", " + v2.toString() + ", " + v3.toString());
	}

	public double getPerimeter() {
		return (v1.distance(v2) + v2.distance(v3) + v3.distance(v1));
	}

	public String printType() {
		double edge1 = v1.distance(v2);
		double edge2 = v2.distance(v3);
		double edge3 = v3.distance(v1);

		if (edge1 == edge2 && edge2 == edge3) {
			return "Equilateral";
		} else {
			if (edge1 == edge2 || edge1 == edge3 || edge2 == edge3) {
				return "Isosceles";
			} else {
				return "Scalene";
			}
		}
	}

}
