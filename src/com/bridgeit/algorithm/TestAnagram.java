package com.bridgeit.algorithm;

import java.util.Scanner;

import com.bridgeit.exception.InvalidException;

public class TestAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     String str1;
     String str2;
     try {
     
     System.out.println("enter the two strings");
     str1=sc.next();
     str2=sc.next();
   System.out.println(com.bridgeit.util.Util.anagram(str1, str2));
	} catch (InvalidException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
     }
	}
	


