/**
 * 
 */
package com.bridgeit.datastructure;

/**
 * @author admin1
 *
 * @param <T> Creating the T generic List of interface 
 */
public interface List<T> 
{
	public void add(T item);
	public boolean remove(T item);
	public boolean search(T item);
	public boolean isEmpty();
	public int size();
	public  void append(T item);
	public int index(T item);
	public void insert(int pos,T item);
	public T pop();
	public T pop(int pos);
    public void print();
    void writeToFile(UnOrderedListImplement<T> list, String filePath);
	
	

}
