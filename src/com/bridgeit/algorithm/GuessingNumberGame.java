package com.bridgeit.algorithm;
import com.bridgeit.exception.InvalidException;
import com.bridgeit.util.Util;
public class GuessingNumberGame
{
	public static void main(String[] args) 
	{
	
		int num=Integer.parseInt(args[0]);
		if(args.length< 1) 
		{
			System.out.println("Provide a number...!");
			return;
		}
		 
		 
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			   arr[i] = i;
			}
		System.out.println("Think a number in the range : 0 to "+(num-1));
		
        try {
			Util.guess(arr,0,num-1);
			
		} catch (InvalidException e) {
			System.out.println(e.getMessage());
		}
	}

}