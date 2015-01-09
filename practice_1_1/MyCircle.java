
public class MyCircle {
	private static final double PI = 3.14159265;
	private MyPoint center;
	private int radius;
	
	public MyCircle(int x, int y, int radius){
		this.center.setXY(x, y);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint center, int radius){
		this.center = center;
		this.radius = radius;
	}
	
	public MyPoint getCenter(){
		return this.center;
	}
	
	public void setCenter(MyPoint center){
		this.center = center;
	}
	
	public int getRadius(){
		return this.radius;
	}
	
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	public int getCenterX(){
		return this.center.getX();
	}
	
	public int getCenterY(){
		return this.center.getY();
	}
	
	public String toString() {
		   return  "Circle @ (" + this.getCenterX() + "," + this.getCenterY() + ") radius=" + radius;
		}
	
	public double getArea(){
		return(radius*radius*PI);
	}
	
}
