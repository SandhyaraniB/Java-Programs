package com.bridgeit.algorithm;

import java.util.Scanner;

import com.bridgeit.exception.InvalidException;
import com.bridgeit.util.Util;

public class TestSqrt {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num to find sqrt");
		double num;
		num=sc.nextDouble();
        try {
        	 
        	 Util.sqrt(num);
			
			//System.out.println(task);
		} catch (InvalidException e)
        {
			
			System.out.println(e.getMessage());
		}
        sc.close();
	}

}
