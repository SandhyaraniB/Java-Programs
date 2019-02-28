package com.bridgeit.datastructure;

public class Qnode<T> implements Comparable<T>
{
	
	Qnode next;
	public T data;

	public Qnode(T data) {
		super();
		this.data = data;
	}

	public Qnode() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
