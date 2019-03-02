package com.bridgeit.oops;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression 
{
	
	public static String msg="Hello <<name>>, We have your full\n" + 
			"name as <<fullname>> in our system. your contact number is <<91-xxxxxxxxxx>>.\n" + 
			"Please,let us know in case of any clarification Thank you BridgeLabz <<date>>.";
	//long phonumber=91-9987675667;
	public static void main(String[] args) 
	{
		//to display present date in the particular format
		Date date = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
		String date1=sdf.format(date);
		
		List<String> regex= new ArrayList<>();
		regex.add("<<name>>");
		regex.add("<<fullname>>");
		regex.add("<<91-xxxxxxxxxx>>");
		regex.add("<<date>>");
		List<String> replace=new ArrayList<>();
		replace.add("Sandhya");
		replace.add("Sandhyarani");
		replace.add("91-9978654458");
		replace.add(date1);
		System.out.println(msg);
		Pattern p;
		Matcher matcher;
		int count=0;
		while(count!=regex.size())
		{
		 p= Pattern.compile(regex.get(count));
		//to get a matcher object
		 matcher = p.matcher(msg); 
	      msg= matcher.replaceAll(replace.get(count));
	      count++;
		}
		System.out.println();
		System.out.println(msg);
		


	}

}
