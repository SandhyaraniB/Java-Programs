package com.bridgeit.datastructure;

public class Dequeimplemenatation<T> implements Deque<T> 
{
	int size,capacity=100;	//size of the DEQUE
	Object s[];		//create object array 
	int front,rear = -1;
   
	public Dequeimplemenatation() 
	{
		super();
		
	}
    public Dequeimplemenatation(int size)
    {
		
		this.size=size;
		s= new Object[size];
	}


	
	public void addFront(Object o)
	{
		if(isEmpty())
		{
			System.out.println("queue underflow");
			
		}
		else
		if(front-1>=0)   //as arr start index is----0 , so front should not exceed 0
		{
			s[front-1]= o;
			
			front--;     
			size++;
		}
		
		
	  
	}
	
	
	public Object removeFront() //remove element from front //here
	{   
		if(front==-1)
		{
			System.out.println("Queue is underflow ");
		} 
		
	    Object e= s[front++];
	    size--;
	    //front++;
		  return e;
	}
	
	public boolean addRear(Object o)
	{
		if(rear==size-1)
		{
			System.out.println("queue OVERflow");
			return false;
		}
		
		s[++rear]= o;
         size++;
		   return true;
	}
	
	
	public Object removeRear() //remove element from rear //here
	{   
		if(rear==-1)
		{
			System.out.println("Queue is underflow ");
		} 
		
	    Object e= s[rear];
	    
	    rear--;
	    size--;
		  return e;
	}
	

	@Override
	public String toString() {
		return "Dequeimplemenatation [front=" + front + ", rear=" + rear + ", size=" + size + "]";
	}



	@Override
	public boolean isEmpty() {
		if(rear==-1&&front==-1)
		{
			return true;
		}else
		return false;
	}

	@Override
	public int size() {
		
		return size;
	}
	

}
