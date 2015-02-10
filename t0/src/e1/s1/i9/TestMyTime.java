package e1.s1.i9;

public class TestMyTime {

	public static void main(String[] args) {

		MyTime time;

		System.out.println("Create new time with (23,59,59): \n" + (time = new MyTime(23, 59, 59)));
		System.out.println("Next second: \n" + time.nextSecond());
		System.out.println("Previous second: \n" + time.previousSecond());
		time.setTime(6, 6, 7);
		System.out.println("Set time to (6,6,7): \n" + time);
		System.out.println("All methods on this class were called");

	}
}