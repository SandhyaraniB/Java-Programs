/**
 * 
 */
package com.bridgeit.datastructure;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author admin1
 *
 */
public class TestUnOrderedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		//int n=sc.nextInt();
        UnOrderedListImplement<String> UOL = new UnOrderedListImplement<>();
        
        System.out.println("enter the file name to read ");
        
         String Line=" ";
         String temp="";
 		 BufferedReader br = null;
 		String path="/home/admin1/Desktop/ss.txt";
 		try 
 		{
 			br=new BufferedReader(new FileReader("/home/admin1/Desktop/"+sc.next()));
 			
 			
 			while((Line=br.readLine())!=null)
 			{
 				temp+=Line;
 				System.out.println(Line);
 			}
 			String[] word=temp.split(",");
 			for(int i=0;i<word.length;i++)
 			{
 				UOL.add(word[i]);
 			}
 				UOL.print();
 				System.out.println("");
 				System.out.println("enter the word to be find:");
 				String str1=sc.next();
 				System.out.println("searching the elemenet:"+UOL.search(str1));
 				if(UOL.search(str1))
 				{
 					System.out.println("removing from list");
 					UOL.remove(str1);
 				}
 				else
 				{   System.out.println("adding to the file");
 				UOL.add(str1);
 				} 
 				UOL.print();
 				System.out.println("");
       
 				UOL.writeToFile(UOL,path);
 			}
 		catch(Exception e)
			{
				System.out.println(e.getMessage()+"error in reading file");
			}
    }

}
