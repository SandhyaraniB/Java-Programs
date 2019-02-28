package com.bridgeit.algorithm;

import java.util.Scanner;

public class TestCountNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String input;
		
		do {
			System.out.println("enter the valid number in rupees");
			input = sc.next();
		   }while(!com.bridgeit.util.Util.isNumber(input));
		   int number = Integer.parseInt(input);
		   int note=com.bridgeit.util.Util.countNote(number);
		   System.out.println("total nos of notes:"+note);
		   sc.close();

	}

}
