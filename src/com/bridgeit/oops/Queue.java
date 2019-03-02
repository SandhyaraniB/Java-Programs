package com.bridgeit.oops;

public interface Queue<T>
{
	public void enQueue(T data);
	public boolean deQueue();
	public int size();
	public boolean isEmpty();
	public void print();
}
