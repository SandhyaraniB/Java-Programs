package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.exception.InvalidException;

public class Flipcoin {

	public static void main(String[] args) {
		int counttail=0,counthead=0;
		System.out.println("enter the number of time to toss the coin");
    	   Scanner sc = new Scanner(System.in);
    	   int n=sc.nextInt();
    	   if(n>0)
    	   {
    	   for(int i=0;i<n;i++)
    	   {
    	      double result=Math.random();
    	      if(result<0.5)
    	        { 
    		       counttail= counttail +1;
    	        }
    	       else 
    	       {
    		   counthead=counthead+1;
    	         }
    	   }  
    	      float perOfTail=((counttail*100)/counttail+counthead);
    	      float perOfHead=(counthead*100)/counttail+counthead ;
    	      System.out.println(perOfTail+" and "+perOfHead);
         
           }
       else
    	   System.out.println("enter the +ve number");
	}

}
