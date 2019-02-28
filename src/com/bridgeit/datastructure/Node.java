/**
 * 
 */
package com.bridgeit.datastructure;

/**
 * @author admin1
 *
 */
public class Node<T> implements Comparable<T>
{
 protected Node<T> next;
 protected T data;


public Node(Node<T> next, T data) 
  {
	super();
	this.next = next;
	this.data = data;
  }


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Node other = (Node) obj;
	if (data == null) {
		if (other.data != null)
			return false;
	} else if (!data.equals(other.data))
		return false;
	if (next == null) {
		if (other.next != null)
			return false;
	} else if (!next.equals(other.next))
		return false;
	return true;
}


@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}


@Override
public String toString()
{   return "null";
	}


@Override
protected void finalize() throws Throwable 
{
	super.finalize();
}

  public Node()//empty constructor
  {
	  
  }
public Node(T data) {
	super();
	this.next = next;
	this.data = data;
}
public Node<T> getNext() {
	return next;
}
public void setNext(Node<T> next) {
	this.next = next;
}
public T getData() {
	return data;
}
public void setData(T data) {
	this.data = data;
}


public int compareTo(T item) {
	
	return ((Comparable<T>) this.getData()).compareTo(item);
}
}
