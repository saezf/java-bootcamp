package t0e131;

public class LineSub extends Point {
	   // A line needs two points: begin and end.
	   // The begin point is inherited from its superclass Point.
	   // Private variables
	   Point end;               // Ending point
	   
	   // Constructors
	   public LineSub (int beginX, int beginY, int endX, int endY) {
	      super(beginX, beginY);             // construct the begin Point
	      this.end = new Point(endX, endY);  // construct the end Point
	   }
	   public LineSub (Point begin, Point end) {  // caller to construct the Points
	      super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
	      this.end = end;
	   }
	   
	   // Public methods
	   // Inherits methods getX() and getY() from superclass Point
	   public Point getBegin() { return super.getMe(); }
	   public Point getEnd() {  return this.end;  }
	   public void setBegin(int x, int y) { super.setXY(x, y); }
	   public void setEnd(int x, int y) { end.setXY(x, y); }
	   
	   public int getBeginX() { return super.getX();}
	   public int getBeginY() { return super.getY(); }
	   public int getEndX() { return this.end.getX(); }
	   public int getEndY() { return this.end.getY(); }
	   
	   public void setBeginX(int x) { super.setX(x); }
	   public void setBeginY(int y) { super.setX(y); }
	   public void setBeginXY(int x, int y) { super.setXY(x, y); }
	   public void setEndX(int x) { this.end.setX(x); }
	   public void setEndY(int y) { this.end.setY(y); }
	   public void setEndXY(int x, int y) { this.end.setXY(x, y); }
  
	   public double getLength() { 
int xDiff = Math.abs(super.getX() - end.getX());
int yDiff = Math.abs(super.getY() - end.getY());
return Math.sqrt(xDiff*xDiff + yDiff*yDiff); }
	   public double getGradient() { 
		   int xDiff = Math.abs(super.getX() - end.getX());
		   int yDiff = Math.abs(super.getY() - end.getY());
	   return Math.atan2(yDiff, xDiff);} 
	}