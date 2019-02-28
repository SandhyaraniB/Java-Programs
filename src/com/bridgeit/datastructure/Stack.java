package com.bridgeit.datastructure;

public interface Stack<T>
{
   public void push(T ele);
   public T pop();
   public void pushArray(T ele);
   public T popArray();
   public void printArray();
   public T peek();
   public void print();
   public int size();
   public boolean isempty();
}
