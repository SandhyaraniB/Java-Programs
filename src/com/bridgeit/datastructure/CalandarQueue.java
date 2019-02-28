package com.bridgeit.datastructure;

import java.util.Scanner;

import com.bridgeit.util.Util;

public class CalandarQueue {

	static int n=1,counter=0,space=0;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		//creating main object for Queue using linkedlist class  
		QueueUsingLinkedListObjecttype  mainqueue= new QueueUsingLinkedListObjecttype ();
		
		//creating sub  object for Queue using linkedlist class to store week days  
		QueueUsingLinkedListObjecttype  qll= new QueueUsingLinkedListObjecttype ();
		
				//input valid month
				System.out.println("Enter a month between 1 to 12");
				int month = sc.nextInt();
				
				//input valid year
				System.out.println("Enter the year which is valid ");
				int year =  sc.nextInt();
				
				//input valid date
				

		
		//method to find DAY---for which the inputs are given By USEr
		int count= Util.dayOfWeek(1, month, year);
		System.out.println(count);
		System.out.println("Calendar "+month+" "+year);
		//Days of week a ARRAY is Char created 
		char c[]= {'S','M','T','W','T','F','S'};
		
		
			//display the DAYS 
			for(int i=0;i<c.length;i++)
			{
				System.out.print(c[i]+"\t");
			}
		
		
		System.out.println("\n");

		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		// condition for checking year is a leap year are not
		if( year%4==0 && year%100!=0||year%400==0)
		{
			days[1] = 29;
		}
		
		/*this for is to store days to sub queues and storing sub queues in main queue*/
		for (int i = 1; i <= days[month]; i++) 
		{  
			qll.insertAtEnd(i);//calling insert method to insert elements in SUBQUEUE
			
				//condition to create new sub queue
				if ((i + count) % 7 == 0 || i==days[month] ) 
				{
					mainqueue.insertAtEnd(qll);// inserting subqueue to main queue 
					
					qll=new QueueUsingLinkedListObjecttype (); // creating new sub queue
	            }
		}
		
		/*for to print space where there is no day falls*/
		for (int i=0;i<count;i++)
		{
			System.out.print("\t");
		}
		
		/*for loop to print all subqueues in main queue*/
		for (int i=0 ;i<mainqueue.size();i++)
		{
			//removing top queue from main queue and coping it to variable
			QueueUsingLinkedListObjecttype  week=(QueueUsingLinkedListObjecttype ) mainqueue.pop();
			
				//for loop to print ekements in sub queue
				for (int j=0;j<week.size();j++)
				{
					//printing sub object elements
					System.out.print(week.pop()+"\t");
				}
				System.out.println();
				//System.out.println((Object)mainqueue.pop());
				sc.close();
			
		}
	}
	}
