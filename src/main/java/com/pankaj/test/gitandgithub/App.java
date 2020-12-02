package com.pankaj.test.gitandgithub;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App { 
	
	public void addData(String data) { 
		
		System.out.println("The Local Data is ==> " + LocalDate.now());
		System.out.println("The Local Time is ==> " + LocalTime.now());
	}
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
