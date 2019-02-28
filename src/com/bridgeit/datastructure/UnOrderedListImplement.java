
package com.bridgeit.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.soap.Node;

/**
 * @author admin1
 *
 */
public   class UnOrderedListImplement<T> //implements List<T> 
{
    protected com.bridgeit.datastructure.Node<T> first;
     protected com.bridgeit.datastructure.Node<T> last;
     int size;
     
	public void add(T item) {
		
		com.bridgeit.datastructure.Node<T> n = new com.bridgeit.datastructure.Node<T>(item);
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
	   com.bridgeit.datastructure.Node<T> temp=first;
	   com.bridgeit.datastructure.Node<T>prev=null;
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
		
		com.bridgeit.datastructure.Node<T> temp=first;
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
		com.bridgeit.datastructure.Node<T> temp=first;
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
	public void append(T item) 
	{
		com.bridgeit.datastructure.Node<T> temp=first;
		com.bridgeit.datastructure.Node<T> n= new com.bridgeit.datastructure.Node<T>(item);
		if(isEmpty())
		{     
			System.out.println("list is empty");
			first=last=n;
		}else {
		while(temp!=null)
		{
			temp=temp.next;
		}
		
		last.next=n;
		last=n;
		}
		
	}
	public int index(T item) {
		com.bridgeit.datastructure.Node<T> temp=first;
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
	
	public void insert(int pos, T item) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * @return delete all the  element from the list 
	 */
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
		
	}
	
	/**
	 * @param pos integer
	 * @return the element from the list
	 */
	public T pop(int pos) 
	{
		int c=-1;
		com.bridgeit.datastructure.Node<T> temp=first;
		com.bridgeit.datastructure.Node<T> prev=first;
		if(isEmpty())
		{
			return null;
		}
		if(temp!=null)
		{
			c++;
			if(c==0&&c==pos)
			{
				first=temp.next;
				temp.next=null;
				return temp.data;
			}
			else if(c==pos&&temp==last)
			{
				prev=last;
				last.next=null;
				return last.data;
				
			}
			else if(c==pos)
			{
				prev.next=temp.next;
				temp.next=null;
				return temp.data;
			}
			prev=temp;
			temp=temp.next;
		}
		return null;
	}

	/**
	 * @param list
	 * @param filePath writing the list into the file
	 */
	public void writeToFile(UnOrderedListImplement<T> list, String filePath) 
	{
		System.out.println("writing to the file");
		if(list == null)
			return;
			//System.out.println("list is empty");
		else {
				com.bridgeit.datastructure.Node<T> curr = first;
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,false)))
				{
					while(curr!=null)
					{
						bw.write(curr.data.toString()+", ");
						curr = curr.next;
					}
			}
		catch(Exception e)
		{
			System.out.println(e.getMessage()+"error while writing");
		}
		}
		
	}
	
}
