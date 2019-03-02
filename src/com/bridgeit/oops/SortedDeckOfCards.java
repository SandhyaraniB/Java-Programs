package com.bridgeit.oops;

public class SortedDeckOfCards {

	public static void main(String[] args) 
	{
		QueueImplimentation<String> queue=new QueueImplimentation<>();
		queue.enQueue("sandhya");
		queue.enQueue("yooo");
	    queue.enQueue("heeee");
		queue.enQueue("qqq");
		queue.enQueue("qqq");
		 queue.print();
		System.out.println(queue.size());
		System.out.println("deleting");
		System.out.println(queue.deQueue());
		System.out.println(queue.size());
        queue.print();
	}

}
