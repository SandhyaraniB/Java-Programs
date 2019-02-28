package com.bridgeit.algorithm;

import java.util.Scanner;

import com.bridgeit.exception.InvalidException;

public class TestNinaryNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the decimal number");
       int num = sc.nextInt();
       
       try {
		com.bridgeit.util.Util.toBinary(num);
	} catch (InvalidException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
       
	}

}
