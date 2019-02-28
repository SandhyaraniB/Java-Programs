package com.bridgeit.algorithm;

import java.util.Scanner;

public class TestNibble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner (System.in);
   String num;
   try {
	   do {
		   System.out.println("enter the decimal number");
		   num= sc.next();
          }while(!com.bridgeit.util.Util.isNumber(num));
	      int num1=Integer.parseInt(num);
	       System.out.println(com.bridgeit.util.Util.nibble(num1));
    	}catch(Exception e)
         {
	      	System.out.println(e.getMessage()+"error");
         }
   sc.close();
	   }

     }
