package com.bridgeit.functional;

import com.bridgeit.exception.InvalidException;

public class TestPowerof2 {

	public static void main(String[] args) {
		System.out.println("enter the number to find power of 2:");
		int n= com.bridgeit.util.Util.getInt();
		try {
		while(true)
		{
    	if((0<=n)&&(n<31))
    	{
    		
				System.out.println(com.bridgeit.util.Util.powerOf2(n));
		} 
    	
    	else
    		System.out.println("eneter the n value in the range");
    	   n= com.bridgeit.util.Util.getInt();
		}	  
	}catch (InvalidException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	}

}
