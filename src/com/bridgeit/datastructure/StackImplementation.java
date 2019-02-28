package com.bridgeit.datastructure;

public class StackImplementation<T> implements Stack<T> 
  {   
	protected com.bridgeit.datastructure.Node<T> first;
  protected com.bridgeit.datastructure.Node<T> last;
  int size;
  

	public void push(T item) {
		
		com.bridgeit.datastructure.Node<T> n = new com.bridgeit.datastructure.Node<T>(item);
	    if((first==null)&&(last==null))
		  {           	 
	    	first=last=n;
		  } else
		  {
			  last.next=n;
			  last = n;
			 // System.out.println("yyuy");
		  } size++;
		 
	}
	public T pop() {
		com.bridgeit.datastructure.Node<T> temp=first;
		com.bridgeit.datastructure.Node<T>prev=first;
		if(isEmpty())
		{
			return null;
		}
		if(first==last)
		{
			first.next=null;
			last.next=null;
			return first.data;
		}
		while(temp.next!=null)
		{
			prev=temp;
		    temp=temp.next;
		}
		last=prev;
		last.next=null;
		return temp.data;
		
	}public boolean isEmpty() {
		
		return (size==0);
	}
	public int size() {
		
		return size;
	}
	@Override
	public void pushArray(T ele) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public T popArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void printArray() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isempty() {
		// TODO Auto-generated method stub
		return false;
	}

	}


