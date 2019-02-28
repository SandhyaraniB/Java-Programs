package com.bridgeit.functional;

import java.util.Scanner;

public class TestElapsedTime {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter 0 to start time");
	     long startTime=sc.nextInt();
         com.bridgeit.util.Util.start();
         System.out.println("enter 1 to end  time");
	     long enfTime=sc.nextInt();
	     com.bridgeit.util.Util.end();
		long elapsedTime=com.bridgeit.util.Util.getElapsedTime();
		System.out.println(elapsedTime);
	    // util.Util.getElapsedTime();
	}

}
