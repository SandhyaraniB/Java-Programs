package com.bridgeit.datastructure;

public class QueueImplementation<T> implements Queue<T> {
    int size=0;
    int front=-1;
    int rear=-1;
    Object data;
    protected Object[] Queue;
    
    public QueueImplementation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QueueImplementation(int size) {
		super();
		this.size = size;
		Queue = new Object[size];
	}

	@Override
	public boolean enQueue(T data)
	{
		if(!(rear==size-1))
		{
        Queue[++rear]=data;
       // rear=(rear+1);
        return true;
		}
		else 
		{
			System.out.println("Queue is full");
	   return false;
	   }
        
		
	}

	@Override
	public Object deQueue() {
		if(front==-1)
		{
		System.out.println("queue is empty....");
		}else
		data=Queue[front];
		front++;
		return data;
	}

	/*@Override
	public void show() 
	{    System.out.println(size);
		for(int i=1;i<=size;i++)
      {
    	  System.out.println(Queue[front+i]+" ");
      }
		
	}*/

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public String toString() {
		return "QueueImplementation [size=" + size + ", front=" + front + ", rear=" + rear + "]";
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	

}
