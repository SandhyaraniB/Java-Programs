package com.bridgeit.datastructure;

import java.util.Scanner;
import java.util.Stack;

import com.bridgeit.util.Util;

public class TestStack {

	public static void main(String[] args)
	{
	    Scanner sc= new Scanner(System.in);
	    Util ds=new Util();
	   /* System.out.println("enter the expression:");
	    String str="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
	    char c[]= str.toCharArray();
	    ds.isExpressionBalanced(c);*/
	    
	  //  System.out.println("Enter max size: ");
		//int n=sc.nextInt();
	
	    String str="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		/* Creating Stack */
		StackImplementation stack = new StackImplementation();
		System.out.println("Parenthesis Matching");
		/* Accepting expression */
		System.out.println("expression: ");
		String exp = sc.next();        
		int len = exp.length();
		System.out.println("Matches and Mismatches: ");
        boolean flag=true;
		for (int i = 0; i < len; i++)
		{    
		Character ch = exp.charAt(i);

			if (ch == '(')
			{
			stack.push(ch);
			}
				else if (ch == ')')
				{
					
					Object p = (stack.pop());
					System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
					flag=true;
				}            
			}
		/*while (!stack.isempty() )
		{
		System.out.println("'(' at index "+(stack.pop())+" is unmatched");
		} */
		if(flag)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
    }
	    
	    
	    
	}
