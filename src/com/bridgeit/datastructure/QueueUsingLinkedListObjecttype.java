package com.bridgeit.datastructure;

class NodeObject 
{
	Object data ;
	NodeObject next;

	public NodeObject()
	{
		this.data= 0;
		this.next= null;
	}
}

	
	public class QueueUsingLinkedListObjecttype 
	{
		NodeObject front;
		NodeObject rear;
		
	   int size=0; 
		
		//###NOTE: in LINKED LIST ,initially
				//####NOTE : Head---always initally it is NULL only ,ONLY when the LIST is EMPTY
					//INITIALLY HEAD will point to NULL only 
							//Condition---ONLY when the LIST is EMPTY
			
			//Like the LinkedList program---the method insertAtBeginning is same---ata)
					//Here like--- InsertAtTop 
						//both method have same working ,//### REFER book for it
			
			
			//public void insertAtBeginning(int data)
			
			public void insertAtEnd(Object data)  //like
			{
				
				NodeObject node=new NodeObject();
				node.data = data;
				node.next = null;
				
					//if the LIST is empty  then insert node---when List is empty
					if(front==null)
					{
						 front=node;
						 rear =node;
						 
						 node.next= null;	/*same as---another way
						 						front.next= null;
						 					     rear.next= null;
						 					*/
					
						 size++;
					}
					else
					{   
					//here i.e rear++
						rear.next = node;  //#1 //joining the rear--pointed ele  with
													//to the new node
						     rear = node;  //#2 //then {change---rear} , point the rear to the node 
						
					    node.next = null;  //#3 //now point the new node.next to NULL
					
					    size++;
					}
			}		
			
			public Object pop()
			{
				Object z=0;
				
				if(front==null)
				{
					System.out.println("Queue underflow");
				}
				else
				{
					    z =front.data;
					 
					 front=front.next;
					
				}
				return z;
			}
			
			public int size()
			{
				return size;
			}
			
			public void show()
			{
				NodeObject temp;
				
				temp= front;
				
					if(front== null)
					{
						 System.out.println("QUeue is empty");
					}
					else
					{
						System.out.println("printitng the elements of Queue");
						while(temp!= null)
						{
							System.out.println(temp.data+" ");
							temp =temp.next;
						}
					}
			}	
	}

