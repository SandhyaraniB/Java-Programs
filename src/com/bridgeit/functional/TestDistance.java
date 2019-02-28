package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.exception.InvalidException;

public class TestDistance {

	public static void main(String[] args)
	{
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
         try {
			System.out.println(com.bridgeit.util.Util.distance(x,y));
		} catch (InvalidException e) {
			
			System.out.println(e.getMessage());
		}
         
	}

}
