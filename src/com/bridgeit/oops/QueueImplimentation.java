package com.bridgeit.oops;

public class QueueImplimentation<T> implements Queue<T> 
{
	protected Node<T>front=null;
    protected Node<T>rear=null;
   
    T data;

	@Override
	public void enQueue(T data) 
	{
          Node<T> node=new Node<T>();
		 if (front==null&&rear==null) 
	        { 
	           front = rear = node; 
	          
	        } 
	        else
	        // Add the new node at the end of queue and change rear 
	        { 
	        	rear.setNext(node); 
	        	rear = node;
	        } 
	}

	private boolean search(T data) {
		
		if(front==null)
			return false;
		Node<T> temp=front;
		while(temp!=null) 
		{
			if(temp.getData().equals(data))
			return true;
			temp=temp.getNext();
		}
		return false;
	}

	@Override
	public boolean deQueue() 
	{
		// If queue is empty, return NULL. 
        if (front == null) 
            return false; 
        else {
         // Store previous front and move front one node ahead 
         Node<T> temp = front; 
         front = front.getNext(); 
         System.out.println(temp.getData()); 
         // If front becomes NULL, then change rear also as NULL 
         if (front == null) 
            rear = null; 
        }
         return true;
	  
	}

	@Override
	public int size() {
		int count = 0;
		Node<T> temp=front;
		while(temp!=null) 
		{
			count++;
			temp=temp.getNext();
		}
		return count;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false ;
	}

	@Override
	public void print() 
	{  
		if(front==null)
	     {
		System.out.println("queuelinked list is empty");
	     }
		Node<T> temp=front;
		while(temp!=null)
		{
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}

	}

}
