package com.bridgeit.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.bridgeit.exception.InvalidException;
import com.bridgeit.util.Util;

//implemented the java 8 features that is lambda expression
  interface print
   {
	  //method without defined
   void abs(int s);	
       //method with defined in interface
	   static void ppp(int s1)
	   {
		 System.out.println("this is my number :"+s1);
	   }
		 
}
public class AnagramOfPrimeIn2DArray {
	public static void main(String[] args) 
	    {
		List<Integer>list=new ArrayList<Integer>();
			Util u=new Util();
			Set<String>set=new HashSet<String>();
			
			List<Integer>list1=new ArrayList<Integer>();
			List<String>l1=new ArrayList<String>();
			Scanner sc= new Scanner(System.in);
			System.out.println(" anagram primes in 2D array:");
			list=Util.isPrime(0, 1000);
			for(int i:list)
			{
				l1.add(String.valueOf(i));
			}
			l1.forEach(i->System.out.print(i));
			set=Util.PrimeAnogram(l1);
			for(String str:set)
			{
				list1.add(Integer.valueOf(str));
			}
			System.out.println("using java 8");
			list1.forEach(str->System.out.print(str+" "));
			
			Collections.sort(list1);
			u.AnagramPrime(list1);
			//lambda expression
			print obj=(s)->System.out.println(s);
			System.out.println("enter the n value");
	        int m=sc.nextInt();
	        print.ppp(m);
	        //print.printInt(list1);
		
	        
	        
	        
	        /*Util u= new Util();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the range:");
		int n= sc.nextInt();
		int arr[]=u.primeNum(n);
		String str1=" ";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				str1+=arr[i]+" ";
			}
		}
		System.out.println(str1);
		String str=" ";
		for(int i=0;i<arr.length;i++)
		{      
			if(arr[i]!=0)
			{

			str+=u.revNum(arr[i])+" ";
			}
         }
		System.out.println(str);
		System.out.println("checking anagram:"+u.checkAnagram(str1, str));
		if(u.checkAnagram(str1, str))
		{
			System.out.println(str+" ");
		}
		else
			System.out.println("not found");
			int ar[]=u.convert("str");
	        print obj=(s)->System.out.println(s);
	       // System.out.println("enter the n value");
	        //int m=sc.nextInt();
	        //print.ppp(m);
	        //print.printInt(ar);*/
	    }
	    
			}

						

	


