package com.bridgeit.algorithm;

import java.util.Scanner;

public class TestMergeSort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s1;
        int k;
        try 
        {
        do {
			  System.out.println("enter the range");
			  s1=sc.next();
			  }while(!com.bridgeit.util.Util.isNumber(s1));
		      int n=Integer.parseInt(s1);
		        
		      String[] str= new String[n];
		      System.out.println("enter the string");
		      for(k=0;k<n;k++)
		      {
			      str[k]=sc.next();
		      }
		       com.bridgeit.util.Util.sort(str,0,str.length-1);
		       System.out.print("sorted array is:");
		       com.bridgeit.util.Util.printString(str); 
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage()+"error in code");
        }
	}

}
