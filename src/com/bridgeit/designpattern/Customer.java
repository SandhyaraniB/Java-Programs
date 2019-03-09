package com.bridgeit.designpattern;

public class Customer implements Observer 
{
	private String customerName;
	private subject subject;
	public String getCustomerName()
	{
		return customerName;
	}


	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}


	public subject getSubject() 
	{
		return subject;
	}


	public void setSubject(subject subject)
	{
		this.subject = subject;
	}


	
	

	@Override
	public void update(String productName) 
	{
		System.out.println("Hello "+customerName+", "+productName+" is now available on amazon");

	}

}
