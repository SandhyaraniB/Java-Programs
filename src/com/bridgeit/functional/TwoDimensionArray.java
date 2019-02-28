package com.bridgeit.functional;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionArray {

	public static void main(String[] args) {
		 String input;
		 Scanner sc =new Scanner(System.in);
		 int rows,cols;
		do {
			 System.out.println("enter the row number");
			 input=sc.next();
		   }while(!com.bridgeit.util.Util.isNumber(input));
		    rows=Integer.parseInt(input);
		
		do {
		     System.out.println("enter the cols number");
		      input=sc.next();
	       }while(!com.bridgeit.util.Util.isNumber(input));
	         cols =Integer.parseInt(input);
	        
		    System.out.println("totalnumber of elements= " +rows*cols);	
		    //displaying int 2Darray
		    int[][] arra =new int[rows][cols];
		    com.bridgeit.util.Util.readArraysInt(arra, rows, cols);
	     	System.out.println("array in matrix form");
	    	com.bridgeit.util.Util.displayArrays(arra, rows, cols);
	    	
	    	System.out.println("hjh");
	    	 System.out.println("totalnumber of elements= " +rows*cols);	
	    	//displaying double 2Darray
	    	double[][] arra1 =new double[rows][cols];
		    com.bridgeit.util.Util.readArraysDouble(arra1, rows, cols);
	     	System.out.println("array in matrix form");
	    	com.bridgeit.util.Util.displayArraysInDouble(arra1, rows, cols);
	    	
	    	 System.out.println("totalnumber of elements= " +rows*cols);	
	    	//displaying boolean 2Darray
	    	boolean[][] arra2 =new boolean[rows][cols];
		    com.bridgeit.util.Util.readArraysBoolean(arra2, rows, cols);
	     	System.out.println("array in matrix form");
	    	com.bridgeit.util.Util.displayArraysInBoolean(arra2, rows, cols);
	    	
	}

}
