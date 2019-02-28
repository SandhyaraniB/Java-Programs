package com.bridgeit.functional;

import com.bridgeit.exception.InvalidException;

public class TestWindChill {

	public static void main(String[] args) {
		try {
			
		double t=Double.parseDouble(args[0]);
		double v=Double.parseDouble(args[1]);
		System.out.println("calculating windchill");
		System.out.println(com.bridgeit.util.Util.windChill(t, v));
		}catch(InvalidException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
