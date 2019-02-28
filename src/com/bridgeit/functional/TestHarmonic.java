package com.bridgeit.functional;

import com.bridgeit.exception.InvalidException;

public class TestHarmonic {

	public static void main(String[] args)
	{
		System.out.print("harmooooo:");
		int num=com.bridgeit.util.Util.getInt();
		try {
		if(num>0)
			{
			System.out.println(com.bridgeit.util.Util.harmonicValue(num));
			}
		else 
			System.out.println("num must be positive");
		}catch(InvalidException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
