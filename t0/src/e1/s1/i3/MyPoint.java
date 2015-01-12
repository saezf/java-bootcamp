package e1.s1.i3;

public class MyPoint {
	// Private variables
	private int x; // x co-ordinate
	private int y; // y co-ordinate

	// Constructor
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public MyPoint() {

		this.x = 0;
		this.y = 0;
	}

	// Public methods
	public String toString() {
		return "Point: (" + x + "," + y + ")";
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double distance(int x, int y) {
		int xDiff = Math.abs(this.x - x);
		int yDiff = Math.abs(this.y - y);
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public double distance(MyPoint another) {
		int xDiff = Math.abs(this.x - another.x);
		int yDiff = Math.abs(this.y - another.y);
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public MyPoint getMe() {
		return this;
	}
}
