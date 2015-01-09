
public class MyTriangle {
	private MyPoint v1,v2,v3;
	
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.v1.setXY(x1, y1);
		this.v2.setXY(x2,y2);
		this.v3.setXY(x3,y3);
		
	}
	
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		
	}
	
	public double getPerimeter(){
		return (v1.distance(v2) + v2.distance(v3) + v3.distance(v1));
	}
	
	public void getType(){
		
		double s1 = v1.distance(v2);
	    double s2 = v1.distance(v3);
	    double s3 = v2.distance(v3);
	        
	    if (s1 == s2 && s2 == s3)
	    	System.out.println("equilateral");
	    else if (s1 == s2 || s2 == s3)
	        	System.out.println("isosceles");
	          	else System.out.println("scalene");
			
	}
	
	public String toString() {
		   return  "Triangle @" + this.v1.getX() + "," + this.v1.getY() + this.v2.getX() + "," + this.v2.getY() + this.v3.getX() + "," + this.v3.getY();
		}
}
