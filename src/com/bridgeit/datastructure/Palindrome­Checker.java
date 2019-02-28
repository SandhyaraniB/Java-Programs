package com.bridgeit.datastructure;

import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome­Checker {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		String s;
		 
		//taking string as a i/p from user
		System.out.println("Enter the string for palindrome " );
		 s=sc.next();

		 char[] c= s.toCharArray();
		
		 
		//HERE we pass the size of String to {Mystack ---constructor} 
	   //and ceate new STACK
		 Dequeimplemenatation<Object> m=new Dequeimplemenatation<Object>(c.length);	//c.length---is the Char array length
		
		//inserting the i/p string---> in reverse order in the the DEQUE 
		for(int i=c.length-1 ; i>=0 ;i--)
		{
			m.addRear(c[i]);	
		}
			
		//to print the MyDeque detials
		System.out.println("\n"+"The New MyDeque array is: "+"\n"+ m);
		System.out.println("\n"+"Matching both the queue:----input String and MyDeque");
			
	    	boolean status=true; //to store condition-->matched or not
	    	
	    	/**
	    	 *to traverse each element of the Deque and match with Char Array{i/p string} 
	    	 */
			for(int i=0 ; i<c.length ;i++)
			{
				if(c[i]!=(char) m.removeFront())
				{
					status=false;	
					break;
				}
				status=true;
			}
			
			if(status)
			{
				System.out.println("it is palindrome");
			}
			else
				System.out.println("not a plindrome");
			sc.close();


	}

}
