/**
 * 
 */
package com.bridgeit.datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author admin1
 *
 */
public class TestOrderedList {

	private static BufferedReader br;

	/**
	 * @param args
	 * @throws IOException 
	 */
	
		 		
	public static void main(String[] args) 
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
			System.out.println("ordered list of elements.........");
			//display data of each node in the list
			list.printOrderedList();
			//read the key to be searched
			System.out.println("key to find in the list:");
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
				} 
		catch (IOException e) 
					{
					e.printStackTrace();
		}

	}
  
				}



