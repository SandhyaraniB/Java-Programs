package com.bridgeit.oops;
import java.util.Scanner;

import com.bridgeit.util.Util;

public class CommercialStock
{
	public static void main(String[] args) throws Exception 
	{		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		@SuppressWarnings("unused")
		Util utility = new Util();
		CommercialStockMethods stock = new CommercialStockMethods();
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
}
