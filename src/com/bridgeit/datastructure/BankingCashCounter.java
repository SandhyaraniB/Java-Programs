package com.bridgeit.datastructure;
import java.util.*;
public class BankingCashCounter {
	interface bank{
		
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To the BANK");
		System.out.println("enter the number of peoples in queue");
		int n=sc.nextInt();
		QueueImplementation<Object> Queue1=new QueueImplementation<Object>(n);
		int ammount,balance=10000;
		for(int i=1;i<=n;i++)
		
		{
		System.out.println("enter the person names:");

		 String name=sc.next();
		// Queue Q=Queue1::enQueue();
		 //Q.enQueue(name);
		 boolean b=Queue1.enQueue(name);
		 if(b==false)
		 {
			 System.out.println("person not added");
		 }
		}
		//System.out.println("list of person in queue:");
		for(int i=1;i<=n;i++)
		
		{
			System.out.println("person number is:"+i);
			System.out.println("person name who have to do operation"+Queue1.toString());
			System.out.println("enter 1 to deposite the money");
			System.out.println("enter 2 to withdraw the money");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:	System.out.println("Welcome To Deposite");
					System.out.println("enter the ammount to Deposite:");
					ammount=sc.nextInt();
					balance+=ammount;
					System.out.println("account balance is:"+balance);
					break;
					
			case 2:	System.out.println("Welcome To Withdraw the money");
			        System.out.println("enter the ammount to withdraw:");
			        ammount=sc.nextInt();
			        balance-=ammount;
			        if(balance>=0)
			        {
			        System.out.println("account balance is:"+balance);
			        }
			        else
			        	System.out.println("canot withdraw money because amount in the account is less ");
			        break;
			}
		}
		Queue1.deQueue();
		System.out.println("........THANK YOU........");
		}

}
