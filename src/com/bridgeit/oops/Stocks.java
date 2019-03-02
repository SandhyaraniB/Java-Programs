package com.bridgeit.oops;
public class Stocks{

	String stocksname;
	String stockssymbol;
	int numberofshare;
	int pricepershare;
	public Stocks()
	{

	}
	public Stocks(String stocksname,String stockssymbol,int numberofshare, int pricepershare)
	{
		this.stocksname = stocksname;
		this.stockssymbol = stockssymbol;
		this.numberofshare = numberofshare;
		this.pricepershare = pricepershare;
	}

	public String getstocksname() 
	{
		return stocksname;
	}

	public void setstocksname(String stocksname) 
	{
		this.stocksname = stocksname;
	}

	public String getstockssymbol() 
	{
		return stockssymbol;
	}

	public void setstockssymbol(String stockssymbol) 
	{
		this.stockssymbol = stockssymbol;
	}

	public int getNumberofshare() 
	{
		return numberofshare;
	}

	public void setNumberofshare(int numberofshare) 
	{
		this.numberofshare = numberofshare;
	}

	public int getPricepershare() 
	{
		return pricepershare;
	}

	public void setPricepershare(int pricepershare) 
	{
		this.pricepershare = pricepershare;
	}

	

}