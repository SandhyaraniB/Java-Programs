package com.bridgeit.oops;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class InventoryDataManagmnt
{

	public static void main(String[] args) 
	{  
		Scanner sc= new Scanner(System.in);
		try
		{
	      ObjectMapper obm= new ObjectMapper(); 
	      File file= new File("/home/admin1/Desktop/jsonfile/Myjson.json");
	     ProductList productList=obm.readValue(file,ProductList.class);
	     
	      Product product=new Product();
	      System.out.println("enter the product type");
	      String Inputname=sc.next();
	     
	      Inputname=Inputname.toLowerCase();
	     
	      if(Inputname.equals("rice")||Inputname.equals("wheats")||Inputname.equals("pulses"))
	      {
	       product.setProductname(Inputname);
	       
	       ProductProperty productproperty=input();
	       
	       List <ProductProperty> productproperties=new ArrayList<>();
	       
	       productproperties.add(productproperty);
	       
	       product.setProperties(productproperties);
	       
	       List<Product> products=productList.getInventory();
	       
	       products.add(product);
	       
	       productList.setInventory(products);
	       
	       obm.writeValue(file, productList);
	       //productproperty=obm.readValue(file, ProductProperty.class);
	       //System.out.println(productList);
	       System.out.println(obm.writerWithDefaultPrettyPrinter().writeValueAsString(productList));
	      }
	      else
	      { 
	    	  System.out.println("Incurrect input please run code again");}
		  } 
		catch(Exception e)
			{   e.printStackTrace();
				//System.out.println(e.getMessage()+"error in code");
			}
	}
	       
	       /**
	     * @return product property which contains the type of product and weight,price;
	     */
	    public static ProductProperty input()
	       
	       { 
	    	   Scanner sc= new Scanner(System.in);
		       ProductProperty productProperty=new ProductProperty();
		      System.out.println("enter the product property");
		      System.out.println("enter the type:");
		      String name=sc.next();
		      productProperty.setName(name);
		      System.out.println("enter the weight:");
		      float weight=sc.nextFloat();
		      productProperty.setWeight(weight);
		      System.out.println("enter the price:");
		      int price=sc.nextInt();
		      productProperty.setPrice(price);
		      return productProperty;
	      
	       
	      }
          
	}


