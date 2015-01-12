package e1.s1.i3;

public class TestMyPoint {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(3, 0);
		MyPoint p2 = new MyPoint(0, 4);

		// Testing the overloaded method distance()
		System.out.println(p1.distance(p2) + "  MyPoint.distance(MyPoint another)");

		System.out.println(p1.distance(5, 6) + "  MyPoint.distance(int x, int y)");

		MyPoint[] points = new MyPoint[10];
		for (int i = 0; i < 10; i++) {

			points[i] = new MyPoint(i + 1, i + 1);
			System.out.println(points[i]);

		}
	}
}
