package com.bridgeit.datastructure;

import java.util.Scanner;

import com.bridgeit.util.Util;

public class CalanderStack {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StackImplementation<Integer> dateQueue=new StackImplementation<Integer>();
		StackImplementation<String> weekDayqueue=new StackImplementation<String>();	
		String[] days= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		String[] months= {"","January","February","March","April","May","June","July","August","September","October","November","December"};
		int [] date= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		System.out.println("Calandar "+"month:"+month+" year:"+year);
		if(month==2 && Util.isLeapYearFourDigits(year)) 
		{
			date[month]=29;
		}
		int day=Util.dayOfWeek(1, month, year);
		
		for(int i=days.length-1;i>=0;i--)
		{
			weekDayqueue.push(days[i]);
		}
		
		int val = date[month];
		for(int i=date[month];i>=1;i--) 
		{
			dateQueue.push(i);
		}
       
		for(int i=0;i<days.length;i++)
        {
			System.out.print(weekDayqueue.pop()+"\t");
		}
		System.out.println();
		//to print starting date of the month in calendar
		for(int i=0;i<(day*4);i++) 
		{
			System.out.print("  ");
		}
		for(int i=1;i<=date[month];i++) //Displaying the date
		{

			System.out.print(" "+dateQueue.pop()+"\t");
			if((i+day)%7==0)  //format for printing the day in calendar
			{
				System.out.println();
			}
		}
sc.close();
	}

}
