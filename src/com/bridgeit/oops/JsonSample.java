package com.bridgeit.oops;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonSample {

	public static void main(String[] args) {
		System.out.println("writing");
		JSONObject obj= new JSONObject();
		obj.put("name","bridgelabz");
		obj.put("Location","Mumbai");
		obj.put("Type","Training company");
		JSONArray arr=new JSONArray();
		arr.add("Java");
		arr.add("JavaScript");
		arr.add("php");
		obj.put("Taining on", arr);
		
       try
       {
		FileWriter fw= new FileWriter("/home/admin1/Desktop/Myjson.json");
		fw.write(obj.toString());
		fw.close();
	   } 
       catch (IOException e) 
       {
		
		e.printStackTrace();
	   } 
	}

}
