package org.myapp;
import java.io.*;
/**
 * Hello world!
 *
 */
public class App 
{
	  public static void main( String[] args )throws IOException
	    {
	      
	        System.out.println("What´s your name?");
	        try
	        {
	            InputStreamReader in=new InputStreamReader(System.in);
	            BufferedReader br=new BufferedReader(in);
	            String a=br.readLine();
	            System.out.println("Hi "+a+" nice to meet you!");
	       
	        }
	        catch(Exception e){}

	            }  
}
