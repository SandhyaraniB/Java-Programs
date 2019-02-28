package com.bridgeit.datastructure;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) 
	{
		
		Queueusinglinkedlistimpl<String> Qll= new Queueusinglinkedlistimpl<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("queue using linked list");
		Qll.enQueue("sandhya");
		Qll.enQueue("hi");
		Qll.enQueue("how are u");
		Qll.enQueue("what are u doing");
		System.out.println("queue size is:"+Qll.size());
		Qll.print();
		System.out.println("");
		System.out.println(Qll.deQueue());
		Qll.print();
		System.out.println();
		System.out.println("queue size is:"+Qll.size());
		
		
		
	}

}
