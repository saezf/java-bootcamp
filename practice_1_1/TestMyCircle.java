
public class TestMyCircle {
	public static void main(String[] Args){
		
		MyPoint p1 = new MyPoint(3, 1);
		MyCircle c2 = new MyCircle (p1,7);
		MyCircle c1 = new MyCircle (1, 1, 1);
		System.out.println(c1.getArea());
		System.out.println(c2);
		}
}
