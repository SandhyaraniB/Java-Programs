package com.bridgeit.datastructure;

public interface Deque<T>
{
   public void addFront(T item);
   public boolean addRear(T item);
   public Object removeFront();
   public Object removeRear();
   public boolean isEmpty();
   public int size();


}
