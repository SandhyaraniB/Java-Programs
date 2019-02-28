package com.bridgeit.oops;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Jsonwrite {

	public static void main(String[] args) {
		System.out.println("writing");
		
		JSONObject obj= new JSONObject();
		obj.put("firstName", "John"); 
        obj.put("lastName", "Smith"); 
        obj.put("age", 25); 
        System.out.println(obj);
        Map m = new LinkedHashMap(4); 
        m.put("streetAddress", "21 2nd Street"); 
        m.put("city", "New York"); 
        m.put("state", "NY"); 
        m.put("postalCode", 10021); 
        obj.put("address", m); 
        System.out.println(obj);
        // for phone numbers, first create JSONArray  
        JSONArray ja = new JSONArray(); 
          
        m = new LinkedHashMap(2); 
        m.put("type", "home"); 
        m.put("number", "212 555-1234"); 
          System.out.println(m);
        // adding map to list 
        ja.add(m); 
          System.out.println(ja);
        m = new LinkedHashMap(2); 
        m.put("type", "fax"); 
        m.put("number", "212 555-1234"); 
          
        // adding map to list 
        ja.add(m); 
          System.out.println(m);
        // putting phoneNumbers to JSONObject 
        obj.put("phoneNumbers", ja); 
          System.out.println(obj);
        // writing JSON to file:"JSONExample.json" in cwd 
        PrintWriter pw = null;
		try {
			pw = new PrintWriter("/home/admin1/Desktop/Myjson.json");
		} catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		} 
        pw.write(obj.toJSONString()); 
          
        
        pw.close();

	}

}
