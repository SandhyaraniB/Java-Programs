package com.bridgeit.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgeit.exception.InvalidException;

public class TestBinarySearch {

	public static void main(String[] args)
	{   
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 0 to start time");
	    sc.next();
	    try {
        com.bridgeit.util.Util.start();
	  	System.out.print("enter the range of array:");
		int n=sc.nextInt();
		System.out.print("enter the int arrays:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("sorted int array is:");

		com.bridgeit.util.Util.printInt(arr);
		System.out.print("enter the key to be search:");
		int key=sc.nextInt();
		int result=com.bridgeit.util.Util.binarySearchOfInt(arr, key);
		if(result==-1)
			System.out.println("element not found");
		else
         System.out.println(key+" is found in the position:"+result);
		
        //for strings      
		System.out.print("enter the range of string array:");
		int n1=sc.nextInt();
		System.out.print("enter the String arrays:");
		String[] arr1=new String[n1];
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.next();
		}
		Arrays.sort(arr1);
		System.out.println("sorted string is:");
		com.bridgeit.util.Util.printString(arr1);
		System.out.print("enter the key to be search:");
	    String x=sc.next();
		int result1=com.bridgeit.util.Util.binarySearchOfString(arr1, x);
		if(result1==-1)
			System.out.println("element not found");
		else
         System.out.println(x+" is found in the position:"+result1);
		System.out.println("enter 1 to end  time");
	    sc.next();
	    com.bridgeit.util.Util.end();
	    System.out.println(com.bridgeit.util.Util.getElapsedTime());
	
	}catch(InvalidException e)
	{
		System.out.println(e.getMessage());
	}

}
}
