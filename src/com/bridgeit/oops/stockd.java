package com.bridgeit.oops;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.ObjectMapper;
public class stockd
{    static long totalValue=0;
	static Scanner sc=new Scanner(System.in);
	@SuppressWarnings("unchecked")
	public  void  StockDetails()
	{       File file=new File("/home/admin1/Desktop/jj/jsoon.json");
           
			JSONParser parser=new JSONParser();
			JSONObject jobj = null;
			StockList slist;
			
			try
			{
				Object objj=parser.parse(new FileReader(file));
				 JSONObject obj=(JSONObject)objj;
				//StockList slist=obj.readValue(file,StockList.class);
			    slist=new StockList();
			    jobj=new JSONObject();
			    System.out.println("stack details:");
			    System.out.println("enter the number of stocks:");
			    int n=sc.nextInt();
			    //Stocks stooo= obj.readValue(file, Stocks.class);
			    
			   
			    Stock stock;
			    JSONArray list;
			    StockDetails stockdetail=new StockDetails();
			    
			    for(int i=0;i<n;i++)
			    {
				    stock=stockpro();
				    List <Stock> stockproperties=new ArrayList<>();
				    stockproperties.add(stock);
				    stockdetail.setList(stockproperties);
				    List<com.bridgeit.oops.StockDetails> stocks=slist.getList();
				    stocks.add(stockdetail);
				    slist.setList(stocks);
				    totalValue=totalValue+stock.getTotal();
			    	((ObjectMapper) objj).writeValue(file, slist);
			    	
			    	System.out.println("totalValue:"+totalValue);
			         
			    }
			    System.out.println(obj);
			}
				catch(Exception e)
				{
					 e.printStackTrace();
				}
			//obj.readValue(file, StockList.class);
			
}
	public static Stock stockpro()
	{   
		
	    long total=0;
		Stock stock= new Stock();
		System.out.println("enter the stock name");
		String name=sc.next();
		stock.setStockname(name);
		System.out.println("enter the no of share");
	    int share=sc.nextInt();
	    stock.setStockshares(share);
	    System.out.println("enter the no of price");
	    int  price=sc.nextInt();
	    stock.setShareprice(price);
	   total=share*price;
	   stock.setTotal(total);
	 //  totalValue=totalValue+total;
	  // stock.setTotalvalue(totalValue);
	   return stock;
	    
	}
}
