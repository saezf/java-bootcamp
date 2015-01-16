package com.bootcamp;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String inStr;
    	
    	Scanner in = new Scanner(System.in);
        System.out.println( "Insert your name: " );
        inStr = in.next();
        System.out.println( "Hello: " + inStr + "!" );
    }
}