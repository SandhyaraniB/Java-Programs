package com.bridgeit.datastructure;

public interface Queue<T>
{
	public boolean enQueue(T data);
	public Object deQueue();
	//public void show();
	public int size();
	public boolean isEmpty();
	
}
