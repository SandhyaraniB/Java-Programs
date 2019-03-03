package com.bridgeit.oops;

public class QueueLL 
{

	QueueNode front ;
	QueueNode rear ;
	public QueueLL()
	{
		this.front = null;
		this.rear = null;
	}
	int length = 0;
	public void enqueue(String str) 
	{
		// TODO Auto-generated method stub		
		QueueNode temp = new QueueNode(str, null,null);
		if(isEmpty())
		{
			front = temp;
		}
		else
		{
			rear.next = temp;
		}
		rear = temp ; 
		length++ ;
	}
	
	public void dequeue() 
	{		
		QueueNode withdrawl ;
		if(isEmpty())
		{
			System.out.println("No elements in queue !!");
		}
		else
		{
			withdrawl = front ;
			front = withdrawl.next;
		}		
	}
	public String frontElement()
	{
		return front.data;		
	}
	
	public boolean isEmpty()
	{
		return length == 0;
	}
	
	public void show()
	{
		QueueNode temp ;
		temp = front;
		while(temp.next!=null)
		{
			System.out.print(temp.data+" --> ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}
