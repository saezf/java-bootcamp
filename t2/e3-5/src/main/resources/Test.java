import java.net.UnknownHostException;

/**
 * 
 */

/**
 * @author Christian db
 *
 */
public class Test {
    public static void main( String[] args )
    {
    	String	asd = null;
    	//java.net.InetAddress asd =null;
		try {
			asd = java.net.InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("Hi " + asd);
    }
}
