package com.bridgeit.algorithm;

import java.util.Scanner;

import com.bridgeit.exception.InvalidException;

public class TestBubbleSort
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in); 
	System.out.println("enter 0 to start time");
    sc.next();
    try {
    com.bridgeit.util.Util.start();
	System.out.println("Enter range");
	int n= sc.nextInt();
	int[] array=new int[n];
	//@SuppressWarnings("unused")
	String[] strArray=new String[n];
	
	
	System.out.println("Enter string array");
	for(int i=0;i<n;i++)
	{
		strArray[i]=sc.next();
	}
	
	com.bridgeit.util.Util.bubbleSortOfStrings(strArray);
	
	System.out.println(" ");

	System.out.println("Enter integer array");
	for(int i=0;i<n;i++)
	{
		array[i]=sc.nextInt();
	}
		com.bridgeit.util.Util.bubbleSortUsingInt(array);	
		System.out.println("enter 1 to end  time");
	    sc.next();
	    com.bridgeit.util.Util.end();
	   System.out.println(com.bridgeit.util.Util.getElapsedTime());
		} catch(InvalidException e)
		    {
			System.out.println(e.getMessage());
		    }

	}
	
}
