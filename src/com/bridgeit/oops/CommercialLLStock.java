package com.bridgeit.oops;

import java.util.Scanner;

import com.bridgeit.util.Util;

public class CommercialLLStock {

	public static void main(String[] args) throws Exception
	{
		LinkedListImplementation<String> ll=new LinkedListImplementation<>();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		@SuppressWarnings("unused")
		Util utility = new Util();
		CommercialLLStockMethod stock = new CommercialLLStockMethod();
		char ch;
		System.out.println("****Welcome to Stock Market****");
		do
		{
			System.out.println("Enter What you wants to do n ");
			System.out.println("1. Add Detail");
			System.out.println("2. Buy");
			System.out.println("3. Sell");
			System.out.println("4. Print Reporty");
			int choice = scanner.nextInt();//utility.inputInteger();			
			switch(choice)
			{
				case 1 : 
					stock.addDetails();
					break;
				case 2 : 
					stock.buyStock();
					break;
				case 3:
					stock.sellStock();
					break;
				case 4 : 
					stock.printReport();
				default :
					break;			
			}
			System.out.println("Do you wants to continue...(Y/N)");
			ch = scanner.next().charAt(0);
		}while(ch=='Y' || ch == 'y');
	}
//		System.out.println("list is empty:"+ll.isEmpty());
//		ll.add("1");
//		ll.add("2");
//		//ll.add("muru");
//		System.out.println(ll.size());
//		ll.print();
//		System.out.println(ll.remove("1"));
//		ll.print();
//		System.out.println("size is:"+ll.size());
//		System.out.println(ll.isEmpty());
	}


