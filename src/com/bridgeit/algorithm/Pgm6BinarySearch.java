package com.bridgeit.algorithm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgeit.exception.InvalidException;

public class Pgm6BinarySearch {

	public static void main(String[] args) throws InvalidException {
		Scanner sc =new Scanner(System.in);
        BufferedReader br = null;
        String Line=null;
        String s=" ";
        System.out.println("enter the file name to read ");
        try
        {
        	br=new BufferedReader(new FileReader("/home/admin1/Desktop/"+sc.next()));
        }
        catch(FileNotFoundException fnfe)
        {
        	System.out.println(fnfe.getMessage()+"the file was not exist");
        	System.exit(0);
        }
        try {
			while((Line=br.readLine())!=null)
			{    s=Line;
				System.out.println(s);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        String[] word=s.split(" ");
        
		Arrays.sort(word);
		System.out.println("sorted string is:");
	    com.bridgeit.util.Util.printString(word);
		System.out.print("enter the key to be search:");
	    String x=sc.next();
		int result1 = 0;
		try {
			result1 = com.bridgeit.util.Util.binarySearchOfString(word, x);
		} catch (InvalidException e)
		{
			System.out.println(e.getMessage());
		}
		if(result1==-1)
			System.out.println("element not found");
		else
         System.out.println(x+" is found in the position:"+result1);

        
         }
	}

