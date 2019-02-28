package com.bridgeit.algorithm;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgeit.exception.InvalidException;

public class PgmNum4 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str="";
	  	System.out.print("enter the range of array:");
		int n=sc.nextInt();
		//for integers
		System.out.print("enter the int arrays:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("sorted int array is:");
	    com.bridgeit.util.Util.printInt(arr);
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
		

/*..............................................................................................................*/	    
	    //BINARY SEARCH
	    System.out.println("enter 0 to start time");
	    sc.next();
        com.bridgeit.util.Util.start();
		System.out.print("enter the key to be search:");
		int key=sc.nextInt();
		int result = 0;
		try {
			result = com.bridgeit.util.Util.binarySearchOfInt(arr, key);
		} catch (InvalidException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		if(result==-1)
			System.out.println("element not found");
		else
         System.out.println(key+" is found in the position:"+result);
		
       //BINARY SEARCH FOR STRING
		System.out.print("enter the key to be search:");
	    String x=sc.next();
		int result1 = 0;
		try {
			result1 = com.bridgeit.util.Util.binarySearchOfString(arr1, x);
		} catch (InvalidException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		if(result1==-1)
			System.out.println("element not found");
		else
         System.out.println(x+" is found in the position:"+result1);
		System.out.println("enter 1 to end  time");
	    sc.next();
	    com.bridgeit.util.Util.end();
	    str=str+com.bridgeit.util.Util.getElapsedTime()+" ";
		System.out.println("binary search elapsed time is:"+str);

/*.........................................................................................................................*/
//BUBBLESORT
		//for string
	    System.out.println("enter 0 to start time");
	    sc.next();
        com.bridgeit.util.Util.start();
		try {
			com.bridgeit.util.Util.bubbleSortOfStrings(arr1);
		} catch (InvalidException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
        System.out.println(" ");
		
		//for INTEGER
        com.bridgeit.util.Util.bubbleSortUsingInt(arr);	
    	System.out.println("enter 1 to end  time");
	    sc.next();
	    com.bridgeit.util.Util.end();
	  str=str+com.bridgeit.util.Util.getElapsedTime()+" ";
		System.out.println("bubble sort elapsed time is:"+str);
/*.................................................................................................................*/
//INSERTION SORT
        //for STRING
	    System.out.println("enter 0 to start time");
	    sc.next();
        com.bridgeit.util.Util.start();
        
        try {
			com.bridgeit.util.Util.insertionSortUsingString(arr1);
		} catch (InvalidException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
        System.out.println("insertion elapsed time:"+str);
        // for INTEGER
		
        try {
			com.bridgeit.util.Util.insertionSortUsingInt(arr);
		} catch (InvalidException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}	
		System.out.println("enter 1 to end  time");
	    sc.next();
    	com.bridgeit.util.Util.end();
	    str=str+com.bridgeit.util.Util.getElapsedTime();
		System.out.println(str);
		String[] str1=str.split(" ");
		Arrays.sort(str1);
		

}
}
