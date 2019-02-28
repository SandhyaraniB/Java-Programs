package com.bridgeit.datastructure;

import java.util.Scanner;

import com.bridgeit.exception.InvalidException;

public class Calendar {

	public static void main(String[] args) {
		boolean leapyear;
		Scanner sc = new Scanner(System.in);

		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		int day = com.bridgeit.util.Util.dayOfWeek(1, month, year);
		System.out.println("day is:" + day);
		int[] days = { 0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] months = {" ","January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		try {
			if (month == 1 && com.bridgeit.util.Util.leapYear(year)) {
				days[month] = 29;
			}
		} catch (InvalidException e) {

			System.out.println(e.getMessage());;
		}
		
		System.out.println(" JAVA Calendar "+months[month]+" "+year);
		System.out.println("S\tM\tT\tW\tTH\tF\tS");
		for (int i = 0; i <day; i++) 
			System.out.print("\t");
			for (int i = 1; i <= days[month]; i++) {
				System.out.print(i+"\t");
				if (((i + day) % 7 == 0) || (i == days[month])) 
				{
					System.out.println();

				}
			}

		}

	
}
