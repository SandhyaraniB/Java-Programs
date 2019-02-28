package com.bridgeit.algorithm;

import java.util.Scanner;

import com.bridgeit.exception.InvalidException;

public class TestTemperature {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the fahreheit:");
		float f=sc.nextFloat();
		System.out.println("enter the celsius:");
		float c=sc.nextFloat();
			
		System.out.println(com.bridgeit.util.Util.celsiusToFahrenheit(c));
		System.out.println(com.bridgeit.util.Util.fahrenheitTocelsius(f));
		
		sc.close();
	}

}
