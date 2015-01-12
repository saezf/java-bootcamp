/**
 * 
 */
package e1.s1.i10;

/**
 * @author Christian db
 *
 */
public class TestMydate {
	static double t1;
	static double t2;
	static int asd;
//static MyDate date = new MyDate(2000,10,10);
	public static void main(String[] args) {
		

		MyDate d1 = new MyDate(2013, 12, 31);
		System.out.println(d1);
		System.out.println("Next day: " + d1.nextDay());
		System.out.println("Previous day: " +d1.previousDay());
		System.out.println("Next month: " +d1.nextMonth());
		System.out.println("Next Year: " +d1.nextYear() + "\n");


		d1.setDate(1, 1, 1);
		System.out.println(d1);
		System.out.print("Previous Year: ");
		try
		{System.out.print( d1.previousYear());}
		catch(IllegalArgumentException e){System.out.println(e.toString() + "\n");}
		d1.setDate(9999, 1, 1);
		System.out.println(d1);
		System.out.print("Next Year: ");
		try
		{System.out.print( d1.nextYear());}
		catch(IllegalArgumentException e){System.out.println(e.toString() + "\n");}
		System.out.println( d1);
		d1.setDate(2011, 2, 28);
		System.out.println(d1);
		System.out.println("Next day: " + d1.nextDay());
		System.out.print("Set to 2011/2/29: " );
		try
		{d1.setDate(2011,2,29);}
		catch(IllegalArgumentException e){System.out.println(e.toString() + "\n");}
	}

}
