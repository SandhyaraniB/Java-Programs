package com.bridgeit.algorithm;
import java.util.Scanner;

public class TestInsertion {
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try 
		{
		String s;
		System.out.println("enter 0 to start time");
	    sc.next();
        com.bridgeit.util.Util.start();
        do {
		System.out.println("Enter range");
		s= sc.next();
        }while(!com.bridgeit.util.Util.isNumber(s));
        int num=Integer.parseInt(s);
		int[] array=new int[num];
		String[] str=new String[num];
	    System.out.println("Enter String array");
		for(int i=0;i<num;i++)
		{ 
			try 
			{
			str[i]=sc.next();
		    }
			catch(Exception e)
			{
				System.out.println(e.getMessage()+"input must be string");
			}
		
		}
		
		com.bridgeit.util.Util.insertionSortUsingString(str);	
		
        
		
		System.out.println("Enter Int array");
		for(int i=0;i<num;i++)
		{  
			array[i]=sc.nextInt();
		
		}
		
		com.bridgeit.util.Util.insertionSortUsingInt(array);	
		System.out.println("enter 1 to end  time");
	    sc.next();
    	com.bridgeit.util.Util.end();
	   System.out.println(com.bridgeit.util.Util.getElapsedTime());
	 	}
		catch(Exception e)
		{
			System.out.println(e.getMessage()+"enter the proper input"); 
		}
		sc.close();
	}

}
