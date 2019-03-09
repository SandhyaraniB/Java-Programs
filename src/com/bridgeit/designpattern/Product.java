package com.bridgeit.designpattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements subject
{
	private boolean available;
	private String productName;
	private List<Observer> listOfObserver=new ArrayList<>();

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
		if(available==true)
		{
			notifyObservers();
		}
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Observer> getListOfObserver() {
		return listOfObserver;
	}

	public void setListOfObserver(List<Observer> listOfObserver) {
		this.listOfObserver = listOfObserver;
	}

	@Override
	public void registerObserver(Observer observer) {
		listOfObserver.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		listOfObserver.remove(observer);
	}
 
	@Override
	public void notifyObservers()
	{
		System.out.println(" Notifying all register customers ");
		listOfObserver.forEach(observer->observer.update(productName));
	}
	

}
