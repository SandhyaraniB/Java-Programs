package com.bridgeit.designpattern;

public class ObserverPatternTest {

	public static void main(String[] args) {
		Customer customer1=new Customer();
		customer1.setCustomerName("Poojitha");
		
		Customer customer2=new Customer();
		customer2.setCustomerName("Diksha");
		
		Product iphone6=new Product();
		iphone6.setProductName("appleiphone 6");
		iphone6.setAvailable(false);
		
		iphone6.registerObserver(customer1);
		iphone6.registerObserver(customer2);
		
		//after few days iphone not available
		
		iphone6.setAvailable(true);
		
		//
		iphone6.removeObserver(customer2);
		iphone6.setAvailable(true);
		
	}

}
