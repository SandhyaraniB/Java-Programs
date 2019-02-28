package com.bridgeit.datastructure;

import java.io.BufferedReader;

/*package DataStructure;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class orderedlistimplementation<T> implements list<T>
{
	 node<T> first=null;
	 node<T> last=null;
	 int size;

	@Override
	public void add(T item)
	{
		 node<T> n= new node<>();
		 n.data=item;
		 n.next=null;
		 if((first==null)&&(last==null))
		 {
			 first=last=n;
		 }
		 if(!search(item))
		 {
			 node<T> temp=first;
			 node<T> prev=null;
			 while((temp!=null)&&(temp.compareTo(item)>0))
				{
					prev=temp;
					temp=temp.next;
				}
				if(temp!=null&&temp==first) 
				{//at first position
					n.next=temp;
					first=n;
				}
				else if(temp!=null)
				{//in-between position
					prev.next=n;
					n.next=temp;
				}
				else
				{ //last position
					last.next=n;
					last=n;
				}
			}
			else 
				System.out.printf("element already exits in the list");
		 }
         

	@Override
	public boolean remove(T item) 
	{
		 node<T> temp=first;
		   node<T>prev=null;
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
		         }
		return false;
	}

	@Override
	public boolean search(T item) 
	{
		node<T> temp=first;
		while(temp!=null)
		{
		if(temp.data.equals(item))
		 
			return true;
			 
		temp=temp.next;
		}
		return false;
	}

	@Override
	public boolean isEmpty() 
	{
		return (size==0);
	}

	@Override
	public int size() 
	{
		return size;
	}

	@Override
	public void append(T item) {
		node<T> temp=first;
		node<T> n= new node<T>(item);
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

	@Override
	public int index(T item)
	{
		node<T> temp=first;
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

	@Override
	public void insert(int pos, T item) 
	{
		
		
	}

	@Override
	public T pop() {
		node<T> temp=first;
		node<T>prev=first;
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

	@Override
	public T pop(int pos) {
		int c=-1;
		node<T> temp=first;
		node<T> prev=first;
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

	@Override
	public void print() {
		node<T> temp=first;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		
	}
/***************************************************************************************************************************************************
 *writing the content into the file
 *by using the bufferedwriter and filewriter
 * 
 */

/*	public void writeToFile(orderedlistimplementation<Integer> oL, String filePath) 
	{
		if(oL == null)//checking the list is empty or not
			return ;
		node<T> curr = first;
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,false))){
			while(curr != null) {
				bw.write(curr.data+", ");
				curr = curr.getNext();
			}
		} 
	catch(Exception e)
		{
			System.out.println(e.getMessage()+"error while writing");
		}
		
		
	}


@Override
public void writeToFile(unorderedlistimplement<T> list, String filePath) {
	// TODO Auto-generated method stub
	
}

}*/



	import java.io.BufferedWriter;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.InputMismatchException;
	import java.util.Scanner;

		
		
	public class OrderedListImplementation<T>
	{
		private Node<T> first;
		private Node<T> last;


			public OrderedListImplementation() {
			super();
			this.first = first;
			this.last = last;
		}

			//public add 
			public void add(T item)
			{
				if(isEmpty())
				{
					first=new Node<T>(item);
					last=first;
					return;
				}
				if(!search(item))
				{
					Node<T> newnode=new Node(item);
					Node<T> curr=first;
					Node<T> prev=null;
					while(curr!=null && curr.compareTo(item)<0) 
					{
						prev=curr;
						curr=curr.getNext();
					}
					if(curr!=null && curr==first) //at first position
					{
						newnode.setNext(curr);
						first=newnode;
					}
					else if(curr!=null) //in-between position
					{
						prev.setNext(newnode);
						newnode.setNext(curr);
					}
					else //last position
					{
						last.setNext(newnode);
						last=newnode;
					}
				}
				else
					System.out.printf("Item already exits in the list...!");
			}

			//remove item
			public void remove(T item) 
			{
				Node<T>	temp=null;
				Node<T> curr=null;
				if(isEmpty())
					System.out.println("List is empty...!");
				else if(first.getData().equals(item) &&first.getNext()==null)// one item list
				{
					first=null;
					last=null;
					//System.out.println(item + " removed from the list...!");
				}
				else if(first.getData().equals(item) &&first.getNext()!=null)
				{
					//update only first
					temp=first;
					first=first.getNext();
					temp=null;
					System.out.println(item+" removed from the list...!");
				}
				else 
				{
					temp=first;
					curr=first.getNext();
					while(curr!=null) {
						if(curr.getData().equals(item))
						{
							temp.setNext(curr.getNext());
							curr.setNext(null);
							System.out.println(item+" removed from the list...!");
							break;
						}
						else {
							temp=curr;
							curr=curr.getNext();
						}
					}
				}
			}
			//check the item is present in the list
			public boolean search(T item) 
			{
				if(first==null)
					return false;
				Node<T> temp=first;
				while(temp!=null) 
				{
					if(temp.getData().equals(item))
					return true;
					temp=temp.getNext();
				}
				return false;
			}

			//remove and return the last item in the list
			public T pop() 
			{
				if(isEmpty())
				{
					System.out.println("List is empty...!");
					return null;
				}
				if(first==last)//remove the only item in the list
				{
					Node<T> temp=first;
					first=last=null;
					return temp.getData();
				}
				Node<T> curr=first;
				Node<T> prev=first;
				while(curr.getNext()!=null)
				{//traverse to reach the last item in the list
					prev = curr;
					curr = curr.getNext();
				}
				//remove the curr item which is the last item in the list
				last=prev;
				last.setNext(null);
				return curr.getData();
			}

			//remove and return item at the given position
			public T pop(int pos)
			{
				if(isEmpty())
				{
					System.out.println("List is empty...!");
					return null;
				}
				Node<T> curr=first;
				Node<T> prev=first;

				int  count=-1;
				while(curr!=null) //traverse to reach to reach the given position
				{
					count++;
					if(count==pos &&count==0)// removal at 0th position, update first
					{
						first=curr.getNext();
						curr.setNext(null);
						return curr.getData();
					}
					else if(count==pos&&curr==last) // remove at the last position
					{
						last=prev;
						last.setNext(null);
						return curr.getData();
					}
					else if(count==pos)//removal in-between
					{
						prev.setNext(curr.getNext());
						curr.setNext(null);
						return curr.getData();
					}
					prev=curr;
					curr=curr.getNext();
				}
				System.out.println("Given position is not found in the lsit...!");
				return null;
			}
			//check  empty
			/**
			 * @return node is empty or not
			 */
			public boolean isEmpty() 
			{
				if(first==null)
					return true;
				else
					return false;
			}
			//size of list
			/**
			 * @return size of the Linked List
			 */
			public int size()
			{
				int count = 0;
				Node<T> temp=first;
				while(temp!=null) 
				{
					count++;
					temp=temp.getNext();
				}
				return count;
			}
			/**
			 * @param item give the Generic type 
			 * @return  the index of that item
			 */
			public int index(T item) 
			{
				if(isEmpty())
				{
					System.out.println("List is empty...!");
					return -1;//error case
				}
				Node<T> curr=first;
				int  count=-1;
				while(curr!=null) 
				{
					count++;
					if(curr.getData()==item)
						return count;
				}
				System.out.println(item+"not found in the list...!");
				return -1;
			}
			//display the nodes of the UnorderedList
			/**
			 * 
			 */
			public void printOrderedList() 
			{
				Node<T> curr=first;
				while(curr!=null)
				{
					System.out.print(" "+curr.getData());
					curr=curr.getNext();
				}
				System.out.println();
			}

			//
			/**
			 * @param list taking list of items
			 * @param filePath writing into the file
			 */
			public void writeToFile(OrderedListImplementation<T> list,String filePath) 
			{
				if(list==null)
					return;

				Node<T> curr=first;
				try(BufferedWriter bw=new BufferedWriter(new FileWriter(filePath,false)))
				{
					while(curr!=null) 
					{
						bw.write(curr.getData().toString()+", ");
						curr=curr.getNext();
					}
				} catch(IOException e) 
				{
					e.printStackTrace();
				}
			}

		/*	public static void main(String[] args) 
			{
				String path="/home/admin1/Desktop/file.txt";
				String[] numbers;
				String line="";
				int key;

				try(BufferedReader br=new BufferedReader(new FileReader(path)))
				{
					String temp=null;
					while((temp=br.readLine())!= null)
					{
						line+=temp;
					}
					numbers=line.split(", ");
					//create a linked list for the words
					OrderedListImplementation<Integer> list=new OrderedListImplementation<>();
					for(int i=0;i<numbers.length;i++) {
						list.add(Integer.parseInt(numbers[i]));
					}
					System.out.println("***************** Numbers list : *****************************");
					//display data of each node in the list
					list.printOrderedList();
					//read the key to be searched
					System.out.println("************** Enter the key...! **********************");
					try {Scanner sc1=new Scanner(System.in);
						key=sc1.nextInt();
						boolean isKeyPresent=list.search(key);
						if(isKeyPresent)
						{
							System.out.printf("key '%s' is present in the list\n",key);
							list.remove(key);
						}
						else {
							System.out.printf("key '%s' is not present in the list\n",key);
							list.add(key);
						}
						//display data of each node in the list
						list.printOrderedList();
						sc1.close();
					}
					catch(InputMismatchException e)
					{
						System.out.println("Key must be a number ...!");
					}
					//write back the list to file
					list.writeToFile(list,path);
				} catch (FileNotFoundException e) 
				{
					e.printStackTrace();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}

			}
		  
			/**
			 * gives the first pointer
			 * @return first node
			 */
			public Node<T> getFirst()
			{
				return this.first;
			}
		}

		

		

	
                                                                  