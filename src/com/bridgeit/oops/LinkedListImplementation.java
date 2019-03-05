package com.bridgeit.oops;

public class LinkedListImplementation<T> 
{
	 Node<T> first;
     Node<T> last;
     int size;
     
	public void add(T item) {
		
		Node<T> n = new Node<T>(item);
	    if((first==null)&&(last==null))
		  {           	 
	    	first=last=n;
		  } else
		  {
			  last.next=n;
			  last = n;
		  } size++;
		 
	}
	public boolean remove(T item)
	{
	   Node<T> temp=first;
	   Node<T>prev=null;
	   while(temp!=null)
	   {
		   if(temp.data.equals(item))
		   {
			   if(prev==null)
			   {
			   first=temp.next;
		       
			   size--;
		       return true;
			   }
		       else
		       {
			     prev.next=temp.next;
			     temp.next=null;
			     return true;
		       }  
		 }
	   else
		{
		   prev=temp;
		   temp=temp.next;
		 }
	         }return false;
	}
	public boolean search(T item) {
		
		Node<T> temp=first;
		//System.out.println(temp.data+""+item);
		while(temp!=null)
		{
		if(temp.data.equals(item))
		 
			return true;
			 
		temp=temp.next;
		}
		return false;
	}
	
	public void print() {
	    Node<T> temp=first;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
	public boolean isEmpty() {
		
		return (size==0);
	}
	public int size() {
		
		return size;
	}
	
	public int index(T item) {
		Node<T> temp=first;
		int c=-1;
		if(first==null&last==null)
			return -1;
		else 
			while(temp!=null)
			{
				++c;
				if(temp.data.equals(item))
				{
					break;
				}
				temp=temp.next;
			}
		return c;
	}
	
	
	}