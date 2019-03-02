package com.bridgeit.oops;

import java.util.ArrayList;
import java.util.List;

public class StockList 
{
   private List<StockDetails> list=new ArrayList<>();

public List<StockDetails> getList() {
	return list;
}

public void setList(List<StockDetails> list) {
	this.list = list;
}
   
}
