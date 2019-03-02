package com.bridgeit.oops;

import java.util.List;
import java.util.Properties;

public class Product 
{
   private String productname;
   private List<ProductProperty> properties;
   
		public String getProductname() {
			return productname;
		}
		public void setProductname(String inputname) 
		{
			this.productname = inputname;
		}
		public List<ProductProperty> getProperties() 
		{
			return properties;
		}
		public void setProperties(List<ProductProperty> properties) 
		{
			this.properties = properties;
		}

   
}
