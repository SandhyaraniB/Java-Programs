package com.bridgeit.oops;

public class Stock
{
  private  String stockname;
  private int stockshares;
  private long shareprice;
  private long total;
 
  
public Stock() {
	super();
	// TODO Auto-generated constructor stub
}
public String getStockname() {
	return stockname;
}
public void setStockname(String stockname) {
	this.stockname = stockname;
}
public int getStockshares() {
	return stockshares;
}
public void setStockshares(int stockshares) {
	this.stockshares = stockshares;
}
public long getShareprice() {
	return shareprice;
}
public void setShareprice(long shareprice) {
	this.shareprice = shareprice;
}
public Stock(String stockname, int stockshares, long shareprice) 
{
	super();
	this.stockname = stockname;
	this.stockshares = stockshares;
	this.shareprice = shareprice;
}
public long getTotal() {
	return total;
}
public void setTotal(long total2) {
	this.total = total2;
}

@Override
public String toString() {
	return "Stocks [stockname=" + stockname + ", stockshares=" + stockshares + ", shareprice=" + shareprice + "]";
}
  
}
