package com.bridgeit.oops;

public class CompanyShareObj 
{
  private  String stocksymbol;
  private int noOfShares;
public CompanyShareObj(String stocksymbol, int noOfShares) 
{
	super();
	this.stocksymbol = stocksymbol;
	this.noOfShares = noOfShares;
}
public String getStocksymbol() 
{
	return stocksymbol;
}
public void setStocksymbol(String stocksymbol)
{
	this.stocksymbol = stocksymbol;
}
public int getNoOfShares() 
{
	return noOfShares;
}
public void setNoOfShares(int noOfShares) 
{
	this.noOfShares = noOfShares;
}
  
}
