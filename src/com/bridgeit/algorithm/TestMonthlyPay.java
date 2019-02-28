package com.bridgeit.algorithm;

import com.bridgeit.exception.InvalidException;

public class TestMonthlyPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principle=Double.parseDouble(args[0]);
		double	year=Double.parseDouble(args[1]);
		double	RateofIntreset=Double.parseDouble(args[2]);
		//System.out.println("enter some thing");
		if(args.length<3)
  	    {
  		  System.out.println("arguments must be 3 ");
  	    }
		else 
  		  try {
		com.bridgeit.util.Util.monthlyPay(principle,year,RateofIntreset);
  		  }
		catch (InvalidException e) 
        {
			System.out.println("caught the exception");
			System.out.println(e.getMessage());
		}
		}
	}
