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
    	
    	Scanner in = new Scanner(System.in);
        System.out.println( "Insert your name: " );
        System.out.println( "Hello: " + in.next() + "!" );
        in.close();
    }
}