package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.exception.InvalidException;

public class TestQuadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String a1,b1,c1;
		try{
			do
			{
				System.out.println("enter the value of a,b,c:");
			 a1= sc.next();
			 b1= sc.next();
		     c1= sc.next();
		     }while((!com.bridgeit.util.Util.isNumber(a1)&&(!com.bridgeit.util.Util.isNumber(b1))&&(!com.bridgeit.util.Util.isNumber(c1))));
		     int a=Integer.parseInt(a1);
		     int b=Integer.parseInt(b1);
		     int c=Integer.parseInt(c1);
             System.out.println(com.bridgeit.util.Util.quadratic(a, b, c));
	    	}
		    catch(InvalidException e)
		   {
			System.out.println(e.getMessage());
	    	}
	}

}
