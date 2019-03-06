package com.bridgeit.oops;

import java.util.EmptyStackException;
public class StackImplementationByLL
{
	int length ;
	Nodee top;
	public StackImplementationByLL()
	{
		length = 0;
		top = null;
	}
	
	public void show() 
	{
		Nodee nodee = top;
		while(nodee!=null)
		{
			System.out.print(nodee.data+ " --> ");
			nodee = nodee.next;
		}
		//System.out.println(nodee.data);
	}
	public String push(String data) 
	{
		Nodee node = new Nodee(data, null);
		node.next = top;
		top = node;
		length++;
		return node.data;
	}

	public String peek()
	{
		if(isEmpty())
			throw new EmptyStackException();
		return top.data;
	}
	public boolean isEmpty() 
	{
		if(length == 0)
		{
			return true;
		}
		return false;
	}

	public String pop() 
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		String result = top.data;
		top = top.next;
		length--;
		return result;
	}
}