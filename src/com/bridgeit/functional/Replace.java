package com.bridgeit.functional;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import com.bridgeit.exception.InvalidException;

public class Replace 
{
	public static void main(String[] args) 
	{ 
		String s2;
		Scanner sc=new Scanner(System.in);
		String s1= "Hello user name how are you";
		
	 //to check the given  is number or string
		//do{
			System.out.println("enter the string");
			s2=sc.next();
		 // }
		//while(util.Util.isNumber(s2));
               //length of the string must be 3
	        	
	             //calling replace method
	                try {

	               System.out.println(com.bridgeit.util.Util.replace(s1,s2));
					     } 
	                catch (InvalidException e) 
	                {
						System.out.println("caught the exception:"+s2);
						 e.printStackTrace();
						//System.out.println(e.getMessage()+s2);
						
					}
	                  
	       
		}
	private static void processErrorCodes(InvalidException  e) throws InvalidException  {
		switch(e.getErrorCode()){
		case "STRING_LENGTH_EXCEPTION":
			System.out.println("Bad string length Type, notify user");
			throw e;
		case "STRING_NOT_NUM_EXCEPTION":
			System.out.println("STRING_NOT_NUM, notify user");
			throw e;
		default:
			System.out.println("Unknown exception occured, lets log it for further debugging."+e.getMessage());
			e.printStackTrace();
		}
	}

	private static void processFile(String file) throws InvalidException, IOException 
	{		
		InputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			throw new InvalidException (e.getMessage(),"STRING_LENGTH_EXCEPTION");
		}finally{
			if(fis !=null)
				fis.close();
		}
	}

}
 

    

		
    
    



