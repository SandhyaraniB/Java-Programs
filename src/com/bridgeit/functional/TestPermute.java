package com.bridgeit.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgeit.exception.InvalidException;

public class TestPermute {

	public static  void main(String[] args) 
	{   String s;
		Scanner sc= new Scanner(System.in);
		try {
		do {
		System.out.println("enter the string to be permute");
         s=sc.next();
		}while(com.bridgeit.util.Util.isNumber(s));
        com.bridgeit.util.Util.permute(s,0,s.length());
     
        
         // using iterator
         String[] a=com.bridgeit.util.Util.permuteUsingIte(s);
         System.out.println("String Permutation Using Iterative ");
         List<String> ll=new ArrayList<>();
 		for(String s1:a){
 			System.out.print(s1+",");
 			ll.add(s1);
 			}System.out.println(" ");
 	  //finding the total number of permuted strings
 		System.out.println("total number of strings:"+ll.size());
	}
    catch(InvalidException e)
		{
	System.out.println(e.getMessage());
		}
	}
}


