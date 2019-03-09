package com.bridgeit.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InventoryDataManagmnt
{
	
		public  static void main(String[] args) throws IOException, JSONException 
		{  
			Scanner sc= new Scanner(System.in);
			ObjectMapper obm= new ObjectMapper(); 
		      File file= new File("/home/admin1/Desktop/jsonfile/Myjson.json");
		      ProductList productList=obm.readValue(file,ProductList.class);
		      
		      Product product=new Product();
		      System.out.println("enter the product type");
		      String Inputname=sc.next();
		      InventoryManagement inventmanagement=new InventoryManagement();
		      inventmanagement.setAny(Inputname);
		      Inputname=Inputname.toLowerCase();
		      
		      if(Inputname.equals("rice")||Inputname.equals("wheats")||Inputname.equals("pulses")||Inputname.equals(inventmanagement.getAny()))//inventmanagement.getAny())
		      {
		       product.setProductname(Inputname);
		       //product properties will display from user
		       ProductProperty productproperty=input();
		       //adding all the properties to the list of array
		       List <ProductProperty> productproperties=new ArrayList<>();
		       productproperties.add(productproperty);
		       
		       //product Pojo class which contains product name with list of product properties
		       product.setProperties(productproperties);
		       
		        List<Product> products=productList.getInventory();
		       //all the product will added into the list
		       products.add(product);
		       productList.setInventory(products);
		       
		       //writing into the jsonfile
		       obm.writeValue(file,productList);
		       //sop for displaying json object on console
		       System.out.println(obm.writerWithDefaultPrettyPrinter().writeValueAsString(productList));
		      }
		      else
		      { 
		    	  System.out.println("Incurrect input please run code again");}
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
		   sc.close();
		   return productProperty;
		        
		 }
          
	}


