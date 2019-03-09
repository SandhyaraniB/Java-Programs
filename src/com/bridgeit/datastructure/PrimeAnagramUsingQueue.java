package com.bridgeit.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.bridgeit.util.Util;

public class PrimeAnagramUsingQueue<T> 
{

	public static void main(String[] args) 
	{
		Util util=new Util();
		//creating stack
		Queueusinglinkedlistimpl<Integer> queue= new Queueusinglinkedlistimpl<Integer>();
		Scanner sc= new Scanner(System.in);
		Set<String>set=new HashSet<String>();
		ArrayList<Integer>list=new ArrayList<Integer>();
		ArrayList<Integer>list1=new ArrayList<Integer>();
		ArrayList<String>l1=new ArrayList<String>();
		list=Util.isPrime(0,1000);
		for(int i:list)
		{
			l1.add(String.valueOf(i));
		}
		set=Util.PrimeAnagram(l1);
		for(String str:set)
		{
			list1.add(Integer.valueOf(str));
		}
		List<Integer>reverseList=new ArrayList<Integer>();
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println("inserted in QUEUE");
		for(int i=0;i<list1.size();i++)
		{
			queue.enQueue(list1.get(i));	// pushing the data to stack
		}
		queue.print();
		System.out.println(" ");
		System.out.println("deleted elements");
		System.out.println(queue.deQueue());
		
		for(int j=0;j<list1.size();j++)
 		{
		   Object obj=queue.deQueue();
		   int k=(Integer) obj;
			//int t=stack.pop();	// Popping the elements from the stack
		   reverseList.add(k);
		}
	
		System.out.print(reverseList);
	}

}
