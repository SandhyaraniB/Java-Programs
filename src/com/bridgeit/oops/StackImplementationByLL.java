package com.bridgeit.oops;

public class StackImplementationByLL<T>
{
	Node<T> first;
	Node<T> last;
	  int size;
	  

		public void push(T item) {
			
			Node<T> n = new Node<T>(item);
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
			Node<T> temp=first;
		    Node<T>prev=first;
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
}
