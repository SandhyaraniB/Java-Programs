package com.bridgeit.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgeit.exception.InvalidException;
import com.bridgeit.util.Util;

public class Testprimefact 
{    public static void main(String args[])
	{  
	   Scanner sc=new Scanner(System.in);
	   Util util=new Util();
	   ArrayList<Integer> primefactors = new ArrayList<>();
	   try {
		   System.out.println("enter the number ");
		   int num=sc.nextInt();
		   
          
          primefactors=util.primeFactor(num);
		  
           System.out.println(primefactors);
	   }
     catch(InvalidException e)
	   {
		   System.out.println(e.getMessage());
	   }
     }
}
