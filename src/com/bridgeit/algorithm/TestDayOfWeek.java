package com.bridgeit.algorithm;

public class TestDayOfWeek {

	public static void main(String[] args) {
		System.out.println("0-sunday , 1-monday , 2-tuesday , 3-wednesday , 4-thursday , 5-friday , 6-saturday");
		System.out.println();
		
			int month ;
			int day;
			int year;
			try {
				month=Integer.parseInt(args[0]);
				day=Integer.parseInt(args[1]);
				year = Integer.parseInt(args[2]);
				int weekDay=com.bridgeit.util.Util.dayOfWeek(month,day,year);
				System.out.println();
				System.out.println("given date : "+month+ ":"+day+ ":"+year);
				System.out.println();
				System.out.println("given day is "+weekDay);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Enter three valid integers as inputs " + e.getMessage());
			}
		}
	}
	


