package com.bridgeit.algorithm;

import java.util.Scanner;

public class TestPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the range:");
		int n= sc.nextInt();
         int[] arr= new int[n];
         arr=com.bridgeit.util.Util.primeNum(n);
         
         for(int i=0;i<arr.length;i++)
         {
        	 if(arr[i]!=0)
        	 {
    	    System.out.print(arr[i]+" ");
        	 }
         }
   
	}
}
