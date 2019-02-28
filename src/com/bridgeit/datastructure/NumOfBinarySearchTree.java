package com.bridgeit.datastructure;

import java.util.Scanner;

import com.bridgeit.util.Util;

public class NumOfBinarySearchTree
{
	public static void main (String[] args) 
	{ 
		Util util=new Util(); 
	    int count1, count2; 
	    Scanner sc= new Scanner(System.in);
	    System.out.println("enter the number to find number of Binary search tree");
	    int n= sc.nextInt();
	    // find count of BST and  
	    // binary trees with n nodes 
	    count1 = util.countBST(n); 
	    
	  
	    System.out.println("Count of BST with "+ n +" nodes is "+  count1); 
	    
	   
	} 
	} 


