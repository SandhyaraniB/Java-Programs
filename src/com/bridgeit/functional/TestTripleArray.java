package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.exception.InvalidException;

public class TestTripleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc =new Scanner(System.in);
     try {
    String s;
    do {
    System.out.print("enetr the length of array");
    s=sc.next();
    } 
    while(!com.bridgeit.util.Util.isNumber(s));
    
    int n = Integer.parseInt(s);
    int[] a = new int[n];
    System.out.println("enter the array elements");
    for(int i=0;i<n;i++)
       {//for reading array
        a[i]=sc.nextInt();
        }
   
    System.out.println(com.bridgeit.util.Util.tripletArray(a,n));
     }
     catch(InvalidException e)
     {
    	 System.out.println(e.getMessage());
     }
    
    sc.close();
	}
}
