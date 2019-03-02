package com.bridgeit.oops;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StockReport 
{
	public static void main(String[] args) 
	{ 
		stockDetailss();
	}					
	public static void stockDetailss()
	{
		JSONParser parser = new JSONParser();
		try
		{
			JSONObject obj = (JSONObject) parser.parse(new FileReader("/home/admin1/Desktop/jj/myjson.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray jsonArr = (JSONArray)jsonObject.get("Stock");

			long totalValue=0;
			long total=0;

			System.out.println("\nStock Details\n");
			System.out.println("Stock Name\tNo Of Shares\tShare Price\tTotal Value Of Stock");
			for(int i=0;i<jsonArr.size();i++) 
			{
				//calculating each stock price
				JSONObject simple =(JSONObject) jsonArr.get(i);
				total=(long)simple.get("No of share")*(long)simple.get("Share price");
				//System.out.println("Value of "+simple.get("Stock Name")+" is "+total);
				System.out.println(simple.get("Stock Name")+"\t\t"+simple.get("No of share")+"\t\t"+simple.get("Share price")+"\t\t"+total);
				totalValue=totalValue+total;
			}
			System.out.println("\nTotal value is:- "+totalValue);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	}