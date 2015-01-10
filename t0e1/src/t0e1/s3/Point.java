package t0e1.s3;

public class Point {
	// Private variables
	private int x; // x co-ordinate
	private int y; // y co-ordinate

	// Constructor
	public Point(int x, int y) {
		setX(x);
		setY(y);
		
	}

	// Public methods
	public String toString() {
		return "Point: (" + x + "," + y + ")";
	}
 
	public int getX() {return x;}

	public int getY() {return y;}

	public void setX(int x) {this.x = x;}

	public void setY(int y) {this.y = y;}

	public void setXY(int x, int y) {
		setX(x);
		setY(y);}
public Point getMe(){return this;}
}

