package com.bridgeit.datastructure;

public class Queueusinglinkedlistimpl<T> 
{    
	protected Qnode<T>front=null;
    protected Qnode<T>rear=null;
    int size=0;
    T data;

	public void enQueue(T data) 
		    { 
		          
		        // Create a new LL node 
		        Qnode<T> node = new Qnode<T>(data);
		       
		        // If queue is empty, then new node is front and rear both 
		        if (front==null&&rear == null) 
		        { 
		           front = rear = node; 
		          
		        } 
		        else
		        // Add the new node at the end of queue and change rear 
		        { 
		        	rear.next = node; 
		        	rear = node;
		        } 
		        size++;
				 
		    } 
		      

	public Object deQueue()
	{  // If queue is empty, return NULL. 
        if (front == null) 
            return 0; 
        
         // Store previous front and move front one node ahead 
         Qnode temp = front; 
         front = front.next; 
        
         // If front becomes NULL, then change rear also as NULL 
         if (front == null) 
            rear = null; 
         return temp.data; 
	  
		
	}

	public void print()
	{  
		if(front==null)
	     {
		System.out.println("queuelinked list is empty");
	     }
		Qnode<T> temp=front;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
	public int size() {
		
		return size;
	}

	public boolean isEmpty() {
		
		return size()==0;
	}

}
