package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.exception.InvalidException;

public class TestLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	     Scanner sc = new Scanner(System.in);
	    int year;
	     try
			{
	    	 System.out.println("enetr the year to find  the leapyear:");

	    	 year=sc.nextInt();
 	  
		System.out.println(com.bridgeit.util.Util.leapYear(year));
		}
		 catch (InvalidException e) 
        {
			System.out.println("caught the exception");
			System.out.println(e.getMessage());
		}
	}
	
	

}

