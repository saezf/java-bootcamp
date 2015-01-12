package t0e1.s1.i7;
import java.io.File;

import javax.swing.JFileChooser;
public class TestMyPolynomial {

	 public static void main(String[] args)
	    {
	        
	        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3,4.4);
	       	        System.out.println("Polynomial p1: "+p1+"  Constructor with varargs");
	      
	       
	        
	        double[] coeffs = {1.3, 4.5,6.7};
	        MyPolynomial p2 = new MyPolynomial(coeffs);
	        System.out.println("Polynomial p2: "+p2 +"  Constructor with array");

		   
		   MyPolynomial p3 = new MyPolynomial("src/t0e1/s1/i7/testfile.txt");
		   System.out.println("Polynomial p3: "+ p3 + "  From file loaded directly from a string");
	      
		  
		   String path = OpenPolynomialFile().getAbsolutePath();
		  // Yes I know i would be a lot easier to overload the builder to pass a file instead a string with the path of the file
		   if (path != null){try{
			   if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
			   { path = path.replace("\\", "/");}
			    p3 = new MyPolynomial(path);
			   System.out.println("Polynomial p3x: "+ p3 +"if you didn't see the window forget this Polynomial");
		   }catch(Exception e){ }}
	   
		   MyPolynomial p4 = new MyPolynomial(1, 0, 2);
	        System.out.println("Polynomial p4: "+p4+ "\n");
	        System.out.println("Polynomial evaluated with x = 3: "+p4.evaluate(3)+ "\n");
	        
	        System.out.println("Sum of polynomials p2 ("  + p2 + ")  + p1  ("+  p1 + ")\nEcuals: "+p2.add(p1)+ "\n"); 
	        System.out.println("Sum of polynomials  p1 ("  + p1 + ")  + p2  ("+  p2 + ")\nEcuals: "+p1.add(p2)+ "\n");        

	        System.out.println("Muliply of polynomials: \np1: "  + p1 + "\np2: "+  p2 + "\np1*p2 Equals: \n"+p1.multiply(p2));       
	    }
		public static File OpenPolynomialFile()
		{
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir") + "/src/t0e1/s1/i7"));
			

			if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			    return (fileChooser.getSelectedFile());
			}
		return null;
		}
}