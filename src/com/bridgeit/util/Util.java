package com.bridgeit.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import com.bridgeit.datastructure.List;
import com.bridgeit.datastructure.QueueImplementation;
import com.bridgeit.datastructure.StackImplementation;
import com.bridgeit.exception.InvalidException;
import com.bridgeit.oops.QueueLL;
import com.sun.javafx.scene.paint.GradientUtils.Parser;


public class Util 
{
	static Scanner sc =new Scanner(System.in);
	 
     /**
     * @return take the String from user and print it
     */
    public static String getString()
     {
		
		 return sc.next();
	}
     
    /**
     * @return Take the Integer from the user and prints it
     */
    public static int getInt()
     {
    	 return sc.nextInt();
     }
     /*............................................................................/
      * string replacement
      * do validity check string length must be equals to and less than 3
      * use the string replace method
      * and print the replace string
      */
     /**
     * @param s1 contains String sentance
     * @param s2  String
     * @return  replace the s1  String by s2 String
     * @throws InvalidException if the input is invalid throw the Invalid Exception
     */
    public static String replace(String s1,String s2) throws InvalidException
    {  
    	 String str3=" ";
    	 if(s2.length()>=0)
        {
    	 
	    if(s2.length()<=3)
	    	 {
	    	  str3= s1.replace("user name",s2);
	    	 }
	    	 return str3;
	    }
    	 throw new InvalidException("String is invalid ");
	  
    }
     
     
     
     /**
     * @param s2 String
     * @return  Checks is their space in s2 string,if their return true
     */
    public static boolean isSpace(String s2)
     {  
    	 if(s2.contains(" "))
    		 return true;
    	 else
    		 return false;
     }
     
     
     
    /*........................................................................../
     * you have to find leapyear
     * 
     *  validate the year number must be 4digit
     *  leap year must divide by 4 and 100       
     *        using the for loop get the year  
     */
     
     /**
     * @param year
     * @return  given year is leapyear or not,if leapyear returns true else false.
     * @throws InvalidException if the user enters the wrong input.
     */
    public static boolean leapYear(int year)throws InvalidException
     {
			
			if(year>0)
		   {
				//devide by 4 the year must be leapyear
				if((year%4==0)||(year%400==0)&&(!(year%100==0)))
				{
					return true;
				}
				else
					return false;
		   }
		
		 throw new InvalidException("year is invalid");

        }
     
     /*...................................................................../
      * find the power of 2
      * validate first input must be integer
      * use the forloop to repeat the multiplication
      * and Display
      * 
      */
     /**
     * @param n to find the power of number
     * @return  power of 2
     * @throws InvalidException
     */
    public static long powerOf2(int n)throws InvalidException
     {     
    	 long power=1;
    	
         if(n!=0)
         {
        	 for(int i=0;i<n;i++)
        	 {
        		  
        		 power=power*2; 
        		  
        		 
        	 }
		return power;
         
    	 }throw new InvalidException(" number is invalid"); 
     }
     
     
     
     /*.................................................................../
      * have to find nth harmonic value
      * initialize f as 0
      * use forloop till the nth value
      * using harmonic formula calculate the sum of nth
      * and Display
      */
     
     
     
     /**
     * @param n user input number to find HarmonicValue
     * @return  float of Harmonic value of that number
     * @throws InvalidException
     */
    public static float harmonicValue(int n)throws InvalidException
     {  float value=0,sum;
    	 if(n!=0)
    	 {
    	 // To find the value upto n
    	 for(int i=1;i<=n;i++)
    	 {
    		 value=value+(float)1/i;
    	 }  
    	return value;
    	 } throw new InvalidException("number is invalid");
     }
     
     
     /*.........................................................../
      * find the prime factor
      * use the while loop to check the given number is divide by 2 or not
      * use for loop starts from 3 to num values 
      * use while loop to get the num to reminder
      * diplay the values
      * again devide by 2
      * 
      */
     /**
     * @param num integer number 
     *   To find primeFactor of that number
     * @return  List of Prime Factor
     * @throws InvalidException 
     */
   
    public static ArrayList<Integer> primeFactor(int num) throws InvalidException
     { 
    	//List<Integer> primefactors = new ArrayList<>();
    	ArrayList<Integer> primefactors=new ArrayList<>();
	    if(num>1)
	    {
	    	 while(num%2==0)
	    		 {
	    		primefactors.add(2);
	    			 num/=2;
	    		 }
	    	 //to get prime number,n must be odd in this type
	    		 for(int i=3;i*i<=num;i+=2)
	    		 { while(num%i==0)
	    		    {
	    			 primefactors.add(i);
	    			 num/=i;
	    		    }
	    		 }
	    		 //to print the number and handle the code
	    	    if(num>2)
	    	    {  primefactors.add(num);}
	    	    
	    	    	  return primefactors;
	     }
           
    	    throw new InvalidException("num  is invalid");

    }

     
     
     
   
     /*...........................................................................................
      *gambler problem
      *use the math.random method
      *if random number below 0.5 than he win or he loss.
      * final stake mus be equal to goal
      * get the percentage of win and loss.
      */
     /**
     * @param stake in Integer
     * @param goal  in Integer
     * @param games  in Integer
     * @return count of wins and percentage of win and loss
     */
    public static int gambler(int stake,int goal,int games)
     {
    	 int count=0,bets=0,win=0,loss=0;
    	 float n;
    	 while(stake<goal)
    	 { 
    		 bets++;
    	   n=(float)(Math.random());
    	   if(n<0.5)
    	   {
    		   stake++;
    		   win++;
    		  
    	   }else
    		   {
    		   stake--;
    		   loss++;
    	   
    		   }
    	   count++;
    	 }
    	 System.out.println("percentOfwin="+(win*100)/bets);
    	 System.out.println("percentOfloss="+(loss*100)/bets);
    	return win ;
    	
     }
     
     
   /**
 * @param s as string
 * @return boolean given is number or not
 */
public static boolean isNumber1(String s) 
	 	{ 
	 		
	    	 return s.matches("[[0-9]+]+");
	 	}
     
     //read the int array
     /**
     * @param a integer array,Two Dimensional array to print matrix
     * @param rows in int 
     * @param cols in int
     * @return boolean
     */
    public static boolean readArraysInt(int [][] a,int rows,int cols)
     {    Scanner sc=new Scanner(System.in);
    	 for(int i=0;i<rows;i++)
    	 {
    		 for(int j=0;j<cols;j++)
    		 {
    			 a[i][j]=sc.nextInt();
    		 }
    	 }
		return false;
     } 
     
     //read the double array
     /**
     * @param a double  2D array
     * @param rows integer
     * @param cols integer
     * @return boolean
     */
    public static boolean readArraysDouble(double [][] a,int rows,int cols)
     {    Scanner sc=new Scanner(System.in);
    	 for(int i=0;i<rows;i++)
    	 {
    		 for(int j=0;j<cols;j++)
    		 {
    			 a[i][j]=sc.nextInt();
    		 }
    	 }sc.close();
		return false;
     } 
     
     //read the boolean array
     /**
     * @param a boolean 2D array
     * @param rows as integer
     * @param cols as integer
     * @return
     */
    public static boolean readArraysBoolean(boolean[][] a,int rows,int cols)
     {    Scanner sc=new Scanner(System.in);
    	 for(int i=0;i<rows;i++)
    	 {
    		 for(int j=0;j<cols;j++)
    		 {
    			 a[i][j]=sc.next() != null;
    		 }
    	 }
		return false;
     } 
     
 /*..................................................................................................................../
  *printing two dimensional array 
  */
     /**
     * @param a integer 2D array 
     * @param rows Integer
     * @param cols Integer
     * @return the 2D array if not returns boolean false.
     */
    public static boolean  displayArrays(int a[][],int rows,int cols)
     {    //convert character to stream of bytes
    	try( PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out),true))
    	{
    	 for(int i=0;i<rows;i++)
    		 
    	 {
    		 for(int j=0;j<cols;j++)
    		 {
    			 pw.write(a[i][j]+" ");
    		 }
    		 pw.println();
    	 }
      }
		return false; 
     }
     /*................................................................................................../
      * displaying two dimensional array in double
      */
     /**
     * @param a double 2D array
     * @param rows integer
     * @param cols  integer
     * @return display the array if not false
     */
    public static boolean displayArraysInDouble(double a[][],int rows,int cols)
     {
    	try( PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out),true))
    	{
    	 for(int i=0;i<rows;i++)
    		 
    	 {
    		 for(int j=0;j<cols;j++)
    		 {
    			 pw.write(a[i][j]+" ");
    		 }
    		 pw.println();
    	 }
       }
		return false;
     }
     
     
     /*................................................................................................../
      * displaying two dimensional array in boolean
      */
     public static boolean displayArraysInBoolean(boolean a[][],int rows,int cols)
     {
    	try( PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out),true))
    	{
    	 for(int i=0;i<rows;i++)
    		 
    	 {
    		 for(int j=0;j<cols;j++)
    		 {
    			 pw.write(a[i][j]+" ");
    		 }
    		 pw.println();
    	 }
     }
		return false;
     }
     /*.................................................................................................../
      *sum of three array elements must be 0
      *take the array  and array of size from user in main
      * take for loop from 0to n-2 as i
      * another for loop from 0 to n-1 as j
      * another for loop from 0 to n as k
      * check if condition sum of arr is zero or not if zero go inside if statement display the each array elemnts
      */
     /**
     * @param arr integer array
     * @param n int number
     * @return  integer count of triplets in that array  and those triplet.
     * @throws InvalidException
     */
    public static int tripletArray(int[] arr,int n)throws InvalidException
     {  int count=0;
     if(n>2)
     {
     int[] tripletarr= new  int[3];
    	 for(int i=0;i<n-2;i++)
    	 {
    		 for(int j=i+1;j<n-1;j++)
    		 {
    			 for(int k=j+1;k<n;k++)
    			 {
    				 if((arr[i]+arr[j]+arr[k])==0)
    				 {
    					 System.out.println("distinct triplet are: \n"+arr[i]+" "+arr[j]+" "+arr[k]);
    						++count;
    			     }
    			 } 
    		 }
    	 }
		return count;
     } throw new InvalidException("size of array is invalid");
     }
     
     
     
     /*................................................................................................................./
      * take the value of x and y by user i nput
      * and call the below method
      * initialize the var dist as double
      * use the given formula for sqrt use math.sqrt and for repeated multiplication use math.pow
      * and print the dist                                                                                                                                                           
      */
     /**
     * @param x integer
     * @param y integer
     * @return using the distance formula math.sqrt(math.pow(x,2)+math.pow(y,2))) prints the distance
     * @throws InvalidException
     */
    public static double distance(int x,int y)throws InvalidException
     {
    	 double dist = 0;
    	 if((x>0&&y>0))
    	 {
		//compute the distance to (0,0)
    		 dist=Math.sqrt(Math.pow(x,2)+(Math.pow(y,2)));
    		 //System.out.println(dist);
    		 return dist;
    	 } 
    	 throw new InvalidException("x and y are invalid");
     }
     
     
     
     /*.................................................................................../
      * call the permute method recursively
      * first we have initialize the string from user and assign f as 0 and l as last index
      * for loop from starting index to end index
      * calling the swap method 
      * 
      */
     /**
     * @param str
     * @param first integer index of string
     * @param last integer index of string
     *  to find permutation of the string
     * @return Set of Strings which are permuted
     * @throws InvalidException
     */
    public static String permute(String str,int first,int last)throws InvalidException
     { 
     if(str.length()>1)
     {  String permutedstr="";
        //if f equals to l print the string
    	 if(first==last)
    	 {permutedstr+=str;
    	  //return str;
    	   System.out.println(permutedstr);
    	 }
    	 else 
    	 {   //for loop from f to l
    		 for(int i=first;i<last;i++)
    	    { //caling the swap method
    		 str=swap(str,first,i);
    		 //after swap recursivly call the permute method 
    		 permute(str,first+1,last);
    		//str=swap(str,f,i);
    		 
    	    }
         }   
    	return str;
     } else
    	 throw new InvalidException("string length is invalid");
 	 }
     /*......................................................................../
 	   swapping the character the position
 	   initialize the string
 	   i start from 1
 	   j from 2
 	   using temp var swap the character
 	    return the string
 	     
 	   */
    	 /**
    	 * @param str string to swap
    	 * @param i integer
    	 * @param j integer,
    	 * i and j for index to swap the string
    	 * @return
    	 */
    	public static String swap(String str,int i,int j)
    	 {
    	 char temp;
    	 char[] chararray=str.toCharArray();
    	 temp=chararray[i];
    	 chararray[i]=chararray[j];
    	 chararray[j]=temp;
    	 return String.valueOf(chararray);
    		 
     }
    	 
    	 
     /*............................................................................../
      * using iterative method
      * iterative function generate all permutation of a string using collection
      * 
      */
    	 /**
    	 * @param sentence string to permute using Iterator
    	 * @return   String array
    	 * @throws InvalidException
    	 */
    	@SuppressWarnings("unchecked")
		public static String[] permuteUsingIte(String sentence)throws InvalidException
    	 {     
    		 if(sentence.length()>=1)
    		 {
    			ArrayList<String> results = new ArrayList<String>();
    			char[] chars = sentence.toCharArray();
    			results.add(new String("" + chars[0]));
    			//looping over every chars 
    			for(int j=1; j<chars.length; j++) {
    				char c = chars[j];
    				int currentSize = results.size();
    				//creating new permutations by combining char 'c' with each of the existing permutations
    				for(int i=currentSize-1; i>=0; i--) {
    					String str = results.remove(i);
    					for(int l=0; l<=str.length(); l++) {
    						results.add(str.substring(0,l) + c + str.substring(l));
    					}
    				}
    			}
    			String[] permutations = results.toArray(new String[results.size()]);
    			return permutations;
    		 } throw new InvalidException("string  is invalid");
    		}
     
     
     /*elapsed timing problem means measuring the elapsed timing between starting time and end time*/
     static long starttimer;
     static long endtimer;
     static long starttimer1;
     static long endtimer1;
     /**
     * @return current time in milliseconds
     */
    public static long start()
     	{ 
    	 //returns the values in milliseconds
    	 //starttimer=899874327;
    	 if(starttimer==0)
    	 {
    	return starttimer=System.currentTimeMillis();
    	 }else
    	 return (long)0;
     	}
     
    /**
     * @return current time in milliseconds
     */
    public static long end()
    { 
    	if(endtimer==1)
     
    	{
    	//returns the values in milliseconds
    	return endtimer=System.currentTimeMillis();
    	}else
    		return(long)0;
    	
    }
     /**
     * @return elapsed time between start and end time,elapsedTime=(startTime-endTime)/1000.
     */
    public static long getElapsedTime()
    { 
    	 //returns the values in milliseconds
    	long elapsedtime=(starttimer-endtimer)/1000;
    
		return elapsedtime;
    
    }
    
    
   
    /**
     * @param a integer value
     * @param b integer value
     * @param c integer value
     * @return  Quadratic equation condition check.
     * @throws InvalidException
     */
    public static double[] quadratic(int a,int b,int c) throws InvalidException
    {  
    	double[] root=new double[2];
    	if(a>=0&&b>=0&&c>=0)
    	{
	    	int delta=b*b-4*a*c;
	    	int root1,root2,realpart,imaginerypart;
	    	if(delta>0)
	    		{
    		//real and different roots
			         root1= (int) ((-b+Math.sqrt(delta))/(2*a));
			         root2= (int) ((-b-Math.sqrt(delta))/(2*a));
			         root[0]=root1;
			         root[1]=root2;
	    		}
			    	else if(delta==0)
			    	{
			    		root1=root2=-b/(2*a);
			          root[0]=root1;
			        }

			    	else {
			    		System.out.println("roots are imaginary");
			    	    }
    	   return root;
    		} 
    	throw new InvalidException("a, b and c are invalid");
    }
    
    
    /*............................................................................................./
     * 
     */
    
    
    
     /**
     * @param t temperature in double
     * @param v speed in double
     * @return w is wind chill value will return
     * @throws InvalidException
     */
    public static double windChill(double t,double v)throws InvalidException
     { 
    	 double w = 0;
    	 if(t>50)
    	 {
    		 if((3<v)&&(v<120))
    		 {
    			 w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
    		 }
    		 return w;
    	 }
    	 throw new InvalidException("temperature must be greater than 50");
    	 }
 
 		 public static boolean isNumber(String s) 
 		 	{ 
 		 		
 		    	 return s.matches("[[0-9]+]+");
 		 	}
 		 
 		 
/*............................................................................................................./
 		  * anagram means character of two string must be same not need of same order
 		  * initialize t as 0
 		  * use for loop i start from 0 to str1 length
 		  * another forloop j from 0 to str2 length
 		  * if statement equality check each charaecter of two string
 		  * if equal t will increment othrer wise display not aanagram
 		  */
 	      /**
 	     * @param str1 string
 	     * @param str2 string
 	     * @return  two strings are anagram or not,if their returns true.
 	     * @throws InvalidException
 	     */
 	    public static boolean anagram(String str1,String str2)throws InvalidException
 	      
 	      {   if(str1.length()>1 &&str2.length()>1)
 	      {
 	    	  int count=0;
 	    	  for(int i=0;i<str1.length();i++)
 	    	  {
 	    		  for(int j=0;j<str2.length();j++)
 	    		  {  if(str1.charAt(i)==str2.charAt(j))
 	    			  {  
 	    			  count++;
 	    			  }
 	    		 
 	    		  }
 	    	  }
 	    	  if(count>1)
 	    	  {  
 	    	   return true;
 	    	   }
 	         else 
 	    	
 			return false;
 	      } throw new InvalidException("string  is invalid");
 	    		 
 	      }
 		
 		
 	      
 	 /*............................................................................................................................................................................./
 	 *prime numbers from 1 to n
 	 *
 	 */
 	      
 	      /**
 	     * @param n integer range 
 	     * @return array of prime number
 	     */
 	    public static int[] primeNum(int n)
 	      {  
 	    	  int i=0;
 	          int num=0; 
 	          //Empty String
 	          int[]  prime= new int[n];
 	             //for loop for print the prime number between 1 to 1000
 	          for (i=1; i <n; i++)         
 	          	{ 	//initializing the count 	  	  
 	        	  int counter=0; 	
 	             //for loop start from i have to greater than 1
	 	        	  for(num=i; num>=1; num--)
	 	             {     //dividing num by i reminder 0 than only count increase
	 	                if(i%num==0)
	 	                {
	 	                	counter = counter + 1;
	 	                }
	 	             }//count is 2 means prime
	 	             if (counter==2)
	 	             {
	 	            	 //Appended the Prime number to the String
	 	   		
	 	            	prime[i]=i;
	 	             }	
 	          }	
 	         return prime;
 	         
 	      }
 	      
 	     
 	      
 	 /*.........................................................................................................../
 	  /**
	 * function to guess a number
	 * @param arr array of integers as input
	 * @param l starting index for searching
	 * @param r ending index for searching
	 * @param sc1 
 	  */
 	   /**
 	 * @param arr of integer
 	 * @param l integer low value
 	 * @param r  integer rear value,guessing number
 	 * @throws InvalidException
 	 */
 	public static void guess(int[] arr,int l,int r) throws InvalidException
 	  	{
 		   if(arr.length>=1)
 		   {
 		   Scanner sc1= new Scanner(System.in);
 	  		int mid;
 	  		String a;
 	  		if(l == r)
 	  		{
 	  			System.out.println(arr[l]);
 	  			
 	  		}
 	  		else 
 	  		{    //to find middle number
 	  			mid=(l+r)/2;
 	  			System.out.println("Is your number 'smaller' compared to "+arr[mid]);
 	  			System.out.println("Enter 'y/n'...!");
 	  		    a=sc1.next();	
 	  			if(a.equals("y"))//low
 	  				guess(arr,l,mid-1);
 	  			else//high
 	  				guess(arr,mid+1,r);
 	  		}	
 	  		} throw new InvalidException("array length is invalid");
 	  	}
 	      
 	      
 	      
 	      
 	      /**
 	     * @param arr1 integer array prints
 	     */
 	    public static void printInt(int[] arr1)
 	      {
 	    	  for(int i=0;i<arr1.length;i++)
 	    	  {  
 	    		  System.out.println(arr1[i]+" ");
 	    	  }
 	      }
 	      
 	      
 	      
 	      
 	      /**
 	     * @param arr of strings display
 	     */
 	    public static void printString(String[] arr)
 	      {
 	    	  for(int i=0;i<arr.length;i++)
 	    	  {
 	    		  System.out.println(arr[i]+" ");
 	    	  }
 	      }
 	      
 	      
 	      
 	      /*sorting the string array using bubble sort...
 	       * sort the string array using for loop and swap method
 	       * sorting method is comparing first insex with next index if greater swap 
 	       * then increment first index again do the above step repeat
 	       * 
 	       */
 	      /**
 	     * @param str array
 	     * @return  bubble sorted string array
 	     * @throws InvalidException
 	     */
 	    public static String[] bubbleSortOfStrings(String[] str)throws InvalidException
 	  	{
 	  		int n = str.length;
 	  		if(n>=2) {
 	  		String temp= null;;

 	  		for(int i=0; i<str.length;i++)
 	  		{
 	  			for(int j=1 ;j<(n-i);j++)//no of comparisons
 	  			{
 	  				if(str[j-1].compareTo(str[j]) > 0)
 	  				{
 	  					temp = str[j-1];
 	  					str[j-1] =str[j];
 	  					str[+j]=temp;
 	  				}
 	  			}
 	  		}System.out.println("\nSorted array");
 			for(int i=0; i<str.length;i++)
 			{
 				System.out.print(str[i]+" ");
 			}
 			return str;} throw new InvalidException("array string is invalid");

 	  	}
 	      
 	      /**
 	     * @param array Of integers 
 	     * @return  sorted array of integers using bubblesort
 	     */
 	    public static int[] bubbleSortUsingInt(int array[])
 	  	{    int n= array.length;
 	  		for(int i=1;i<array.length;i++)
 	  		{
 	  			for(int j=1 ;j<(n-i);j++)
 	  			{
 	  				if(array[j-1] > array[j])
 	  				{//Swap the two elemets
 	  					int temp = array[j-1];
 	  					array[j-1] = array[j];
 	  					array[j] = temp;
 	  				}
 	  			}

 	  		}
 	  		System.out.println("Sorted int array");
 	  		for(int i=0; i<array.length;i++)
 	  		{
 	  			System.out.print(array[i]+" ");
 	  		}
 	  		return array;
 	  	}	
 	      
 	      
 	      
 	      
 	      
 	      
 	      
 	   /**
 	 * @param arr of integers,sorting
 	 */
 	public static void sortArray(int[]arr)
 	   {
 		   Arrays.sort(arr);
 		   
 	   }
 	   
 	   
 	   
 	   /*........................................................................./
 	    * insertion sort
 	    * sorting the array string by comparing first index with all other index if greater else increase the index 
 	    */
 	     
 	    
 	   /**
 	 * @param array of strings
 	 * @return  sorted string array using insertion sort
 	 * @throws InvalidException
 	 */
 	public static String[] insertionSortUsingString(String[] array)throws InvalidException
 		{ 
 		   if(array.length>2)

 		{
 			for(int i=1;i<array.length;i++)
 			{
 				for(int j=i; j>0 ;j--)
 				{
 					if(array[j-1].compareTo(array[j]) > 0)
 					{//Swap the two elemets
 						String temp=array[j-1]; 
 						array[j-1]=array[j];
 						array[j]=temp;
 					}
 				}

 			}
 			
 			for(int i=0; i<array.length;i++)
 			{
 				System.out.print(array[i]+" ");
 			}	
 			return array;
 		} 
 		   throw new InvalidException("range is invalid");
 		}
 	   
 	   
 	   
 	   // Function to print the sorted array of string 
 	  public static String[] printArrayString(String str[], int n) 
 	   { 
 	       for (int i=0; i<n; i++) 
 	           return str;
 		return str;
 	       
 	   } 
 	  
 	  
 	  
 	  /*............................................................/
 	   * sorting th einteger array
 	   * using insertion sort
 	   */
 	  /**
 	 * @param array of integers
 	 * @return sorted array using insertion
 	 * @throws InvalidException
 	 */
 	public static int[] insertionSortUsingInt(int array[])throws InvalidException
 		{
 		  if(array.length>3)
 		  {
 			for(int i = 1;i<array.length;i++)
 			{
 				for(int j = i; j > 0 ; j--)
 				{
 					if(array[j-1] > array[j])
 					{//Swap the two elemets
 						int temp = array[j-1];
 						array[j-1] = array[j];
 						array[j] = temp;
 					}
 				}

 			}
 			
 			for(int i = 0; i<array.length;i++)
 			{
 				System.out.print(array[i]+" ");
 			}
 			return array;
 		  } throw new InvalidException("array length is invalid");
 		}	
 	  
 	  
 	  
 	  /*.............................................................................../
 	   *merge sort using divide and concur method 
 	   *split the asrray to half again split till single element comes sort those two and merge them
 	   *
 	   */ 
 	  /**
 	 * @param arr of strings
 	 * @param l lower int value
 	 * @param m mid value of string array
 	 * @param r high int value
 	 * @return Devide the string array by two half
 	 * @throws InvalidException
 	 */
 	static boolean mergeSort(String arr[], int l, int m, int r) throws InvalidException
 	  { 
 		  if(arr.length>3)
 		  {
 	      // Find sizes of two subarrays to be merged 
 	      int n1 = m - l + 1; 
 	      int n2 = r - m; 

 	      /* Create temp arrays */
 	      String L[] = new String [n1]; 
 	      String R[] = new String [n2]; 

 	      /*Copy data to temp arrays*/
 	      for (int i=0; i<n1; ++i) 
 	          L[i] = arr[l + i]; 
 	      for (int j=0; j<n2; ++j) 
 	          R[j] = arr[m + 1+j]; 


 	      /* Merge the temp arrays */

 	      // Initial indexes of first and second subarrays 
 	      int i = 0, j = 0; 

 	      // Initial index of merged subarry array 
 	      int k = l; 
 	      while (i < n1 && j < n2) 
 	      { 
 	          if (L[i].compareTo(R[j])<=0) 
 	          { 
 	              arr[k] = L[i]; 
 	              i++; 
 	          } 
 	          else
 	          { 
 	              arr[k] = R[j]; 
 	              j++; 
 	          } 
 	          k++; 
 	          return true;
 	      } 

 	      /* Copy remaining elements of L[] if any */
 	      while (i < n1) 
 	      { 
 	          arr[k] = L[i]; 
 	          i++; 
 	          k++; 
 	      } 

 	      /* Copy remaining elements of R[] if any */
 	      while (j < n2) 
 	      { 
 	          arr[k] = R[j]; 
 	          j++; 
 	          k++; 
 	      }
 		return false; }throw new InvalidException("invalid");
 	  } 

 	  
 	  /**
 	 * @param arr of strings which are devided
 	 * @param l low integer value
 	 * @param r hight integer value
 	 * @return sorted string array
 	 * @throws InvalidException
 	 */
 	public static  String[] sort(String arr[], int l, int r) throws InvalidException 
 	  {   
 	  
 	      if (l < r) 
 	      { 
 	          // Find the middle point 
 	          int m = (l+r)/2; 

 	          // Sort first and second halves 
 	          sort(arr, l, m); 
 	          sort(arr ,m+1, r); 

 	          // Merge the sorted halves 
 	          mergeSort(arr, l, m, r); 
 	      }
 		return arr; 
 	  } 

 	     
 	   /*............................................................................................/
 	    * find the dayofweek usinggregorian calendar
 	    */
 	      /**
 	     * @param d date
 	     * @param m month number
 	     * @param y year
 	     * @return day
 	     */
 	    public static int dayOfWeek(int d,int m,int y)
 	      {
 	    	  int y0=y-(14-m)/12;
 	    	  int x=y0+y0/4-y0/100+y0/400;
 	    	  int m0=m+12*((14-m)/12)-2;
 	    	  int d0=(d+x+31*m0/12)%7;
 	    	  return d0;
 	      }
 	     
 	 /************************************************************************************************/     
 	    	 //celsius to fahreheit conversion and vise versa
 	      /**
 	     * @param c celsius 
 	     * @return fahrenheit
 	     */
 	    public static float celsiusToFahrenheit (float c)
 	      
 	      {   
 	    	float Fahrenhit=(c*9/5)+32;
 			return Fahrenhit;
 	      }
 	      /**
 	     * @param f fahrenheit
 	     * @return celsius
 	     */
 	    public static float fahrenheitTocelsius(float f)
 	      {
 	    	  float Celsius= (f-32)*5/9;
 	    	  return Celsius;
 	      } 
 	     
 	      
 	      
 	      
 	      
 	      //@param=In a Java applet, the names of arguments are treated in a case-sensitive manner, so make sure you get the case right in the PARAM tag.
 	     // Anyone can take the source of your Java page and change the values you supply for your parameters. Make sure the applet can handle this.
 	     /* 
 	      *   @param rupees
 	      */
 	  
 	      /**
 	     * @param rupees int value
 	     * @return count,number of notes is required to be va rupees 
 	     */
 	    public static int countNote(int rupees)
 	      {
 	  		int[] array = {1000,500,100,50,20,10,5,2,1};
 	  		int notes = 0;
 	  		for(int i=0;i<array.length;i++)
 	  		{
 	  		
 				if(rupees/array[i]>0)
 	  			{
 	  				System.out.println("number of notes "+array[i]+"is"+rupees/array[i]);
 	  				notes=notes+rupees/array[i];
 	  				rupees=rupees%array[i];
 	  			}
 	  		}
 	  		return notes;
 	      }
 	      
 	   /*.........................................................................................../
 	      *finding the monthly payment using the given formula
 	      *
 	      */
 	 /**
 	  * find the paymnet
 	 * @param p double principle value
 	 * @param y double year
 	 * @param r rate
 	 * @return payment
 	 * @throws InvalidException
 	 */
 	public static double monthlyPay(double p,double y,double r)throws InvalidException
 	   {
 		 if(p>0&&y>3&&r>0)
 		 {
 		double n =(12*y);
 		r =r/(12*100);
 		double power = Math.pow((1+r),-n);
 		double payment = ((p*r)/(1-power));
 		System.out.println( payment);
 	 	return payment;
 		 }throw new InvalidException("input is invalid");
 	  }

 	/*........................................................................................../
 	 * find the suire root
 	 */
 	/** finding the squaroot from c,c from newtons method
 	 * @param c double value from newtons method
 	 * @throws InvalidException
 	 */
 	public static void sqrt(double c) throws InvalidException
 	{
 		if(c>0)
 	   { 
        double epsilon = 1.0e-15;  // relative error tolerance
        double t = c;              // estimate of the square root of c

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon*t)
        {
            t = (c/t + t) / 2.0;
        }

        // print out the estimate of the square root of c
        System.out.println(t);
	 		//return num;  
 	  }
 		else throw new InvalidException("num is invalid");
 	}




 	/*................................................................................................../
 	 *Decimal to binary conversation 
 	 */
 	     /**converting the decimal int number to binary number
 	     * @param num integer decimal value
 	     * @return binary in array
 	     * @throws InvalidException
 	     */
 	    public static int[] toBinary(int num)throws InvalidException
 	     {   if(num>0)
 	     {
 	    	 int[] bin=new int[1000];
 	    	 int i=0;
 	    	 while(num>0)
 	    	 {
 	    		 bin[i] =num%2;
 	    		 num=num/2;
 	    		 i++;
 	    	 }
 	    	 for(int j=i-1;j>=0;j--)
 	    	 {
 	    		 System.out.print(bin[j]);
 	    	 }
 	    	 return bin;
 	     }throw new InvalidException("num is invalid");
 	         
 	     }




 	/*.............................................................................................../
 	 * 
 	 */
 	    /**use the tobinary method get binry number 
		 * split them and get the two nibbles
		 * swap them and combine them and get decimal number
		 * and check is it pow of 2 or not
 	     * @param num int binary value
 	     * @return boolean numis power of two are not
 	     */
 	    public static boolean nibble(int num)//throws InvalidException
 	    { 
 	    	//if(num>0)
		 	      //{
		 	    	String str=Integer.toBinaryString(num);
		 	    	
		 	    	if(str.length()%2==0)
		 	    	{   
		 	    		str=str;
		 	    	}
		 	    	else
		 	    	{
		 	    		str=0+str;
		 	    	}
		 	    	int n=str.length()/2;
		 	    	String s1=str.substring(0, n);
		 	    	String s2=str.substring(n,str.length());
		 	    	  if(s1.length()==4&&s2.length()==4) 
		 	    	  {
		 	    	  //swaping the two string using substring method
		 	    	  s1= s1+s2;  
		 	    	  s2 = s1.substring(0, s1.length()-s2.length());  
		 	    	  s1= s1.substring(s2.length());  
		 	    	  String s3=s1+s2;
		 	          //convert string to integer
		 	    	  int result = Integer.parseInt(s3);	
		 	    	  int decimal=0,p=0;
		 	         
		 	    	  while(result!=0)
		 	    	  {    //mod of binary value multiplied by 2 power of p
		 	             decimal+=((result%10)*Math.pow(2,p));
		 	             //binary divide by 10 get resulatent again do above code till result = 0  
		 	             result=result/10;
		 	             p++;
		 	    	  }
		 	         //finding that decimal is power of two
		 	         if(isPowerOfTwo(decimal))
		 	         {
		 	        	return true;
		 	         }
		 	        return false;
		 	    	  }
 	    	 return false;
 	       
 	    //}throw new InvalidException("num is invalid");
 	     }
 	    
 	    
 	    
 	    
 	  //is given number power of 2 or not  
 	    /**
 	     * @param n integer value
 	     * @return boolean give number is power of two or not
 	     */
 	    static boolean isPowerOfTwo(int n) //throws InvalidException
 	    { 
 	        if (n==0) 
 	        {
 	          
 	        while (n!=1) 
 	        { 
 	            if (n%2!= 0) 
 	                return false; 
 	            n=n/2; 
 	        } 
 	        }
 	        return true; //throw new InvalidException("n is invalid");
 	     }
 	 
 	    
 	    /* checking the given number is prime or not                                      
 	    * 
 	    */
 	   /**
 	    * given number is prime or not to check
 	 * @param num integer
 	 * @return boolean
 	 * @throws InvalidException
 	 */
 	public static boolean isPrime(int num) throws InvalidException
 		{if(num>0)
 		{
 			for(int i=2;i<=num/2;i++) 
 			{   //devide the given number with i if mod isnot zero return true else false
 				if(num%i==0)
 					return false;
 			}
 			return true;
 		}throw new InvalidException("num is invalid");
 		}
 	   
 	   
 	   /*checking anagram
 	    */
 		/** checking the two strings are prime or not
 		 * @param str1 string
 		 * @param str2 string
 		 * @return boolean 
 		 */
 		public static  boolean checkAnagram(String str1, String str2)//throws InvalidException
 		{   // if(str1.length()>2&&str2.length()>2)
 	    	//{
 			char[] str1Chars = str1.toLowerCase().toCharArray();
 			char[] str2Chars = str2.toLowerCase().toCharArray();
 			Arrays.sort(str1Chars);
 			Arrays.sort(str2Chars);
 			str1 = new String(str1Chars);
 			str2 = new String(str2Chars);
 			return str1.equals(str2);
 			//}
 		
 		//throw new InvalidException("strings length are invalid");
 		}
 		
 		/*checking palindrome
 	     */	
 	    
 	    /** checking the two string is palindrome or not
 	     * @param str1 string
 	     * @param str2 string
 	     * @return boolean
 	     */
 	    public static boolean checkPalindrome(String str1, String str2)//throws InvalidException
 		{
 	    	//if(str1.length()>2&&str2.length()>2)
 		//{
 			String temp = new StringBuilder(str2).reverse().toString();//reversed of str2
 			if(str1.trim().toLowerCase().equals(temp))
 				return true;
 			return false;
 		//}throw new InvalidException("strings length are invalid");
 		}
 	    
 	   
 	     
 	    
 	     /**checking the prime numbers are anagram or not
 	        using the hash map and entry set for loop
 	     * @param nums array list of prime numbers
 	     * @return anagram of the list of prime numbers
 	     */
 	    public static HashMap<String,String> anagramsOfNumbers(ArrayList<Integer> nums) //throws InvalidException
 		{ 
 	    	//if(nums.size()>2)
 		//{
 			HashMap<String,String> primeAnagrams = new HashMap<String, String>();
 			boolean anagram = false;
 			for(int i = 0 ;i < nums.size() - 1; i++) {
 				for(int j= i+1; j < nums.size(); j++) {
 					Integer p1 = nums.get(i);
 					Integer p2 = nums.get(j);
 					anagram = checkAnagram(p1.toString(), p2.toString());
 					if(anagram) {
 						if(!primeAnagrams.containsKey(p1))
 						{
 							//String oldValue = primeAnagrams.get(p1);
 						   primeAnagrams.put(p1.toString(),p2.toString());
 						}
 							//primeAnagrams.put(p1.toString(), p2.toString());
 					}//end of anagram condition
 				}
 			}
 			return primeAnagrams;
 			}//throw new InvalidException("nums length are invalid");

 	
 	    /**
 	     * @param nums array of integer
 	     * @return palindrome of the array list
 	     */
 	    public static HashMap<String,String> palindromesOfNumbers(ArrayList<Integer> nums)//throws InvalidException
 		{
 	    	//if(nums.size()>2)
 		  //{
 			HashMap<String,String> allPalindromes = new HashMap<String,String>();
 			boolean palindrome = false;
 			for(int i = 0 ;i < nums.size() - 1; i++) 
 			{
 				for(int j= i+1; j < nums.size(); j++) 
 				{
 					Integer p1 = nums.get(i);
 					Integer p2 = nums.get(j);
 					palindrome = checkPalindrome(p1.toString(), p2.toString());
 					if(palindrome) 
 					{
 						if(allPalindromes.containsKey(p1))
 						{
 							String oldValue = allPalindromes.get(p1);
 							allPalindromes.put(p1.toString(), oldValue+","+p2.toString());
 						}
 						else
 							allPalindromes.put(p1.toString(), p2.toString());
 					}//end of palindrome condition

 				}
 			}//end of i loop
 			return allPalindromes;}//throw new InvalidException("nums length are invalid");
 	   //}
 	    
 	    
 	    
 	    /*............................................................................................................/
 	     
 	     * 
 	     */
 	    
 	    /**
 	     * binary search method
 	     *finding the key element is their or not in the array
 	     * @param arr OF INTEGRS
 	     * @param x key integer to find in the array
 	     * @return position
 	     * @throws InvalidException
 	     */
 	    public static int binarySearchOfInt(int[] arr,int x)throws InvalidException
 	    {  if(arr.length>2)
 	    {
 	    	
 	    	  int l = 0, r = arr.length - 1; 
 	          while (l <= r) { 
 	              int m = l + (r - l) / 2; 
 	    
 	              // Check if x is present at mid 
 	              if (arr[m] == x) 
 	                  return m; 
 	    
 	              // If x greater, increment mid
 	              if (arr[m] < x) 
 	                  l = m + 1; 
 	    
 	              // If x is smaller, decrement mid
 	              else
 	                  r = m - 1; 
 	          } 
 	          // not present 
 	          return -1; }throw new InvalidException("array length is invalid");
 	      } 
 	    
 	   
 	    	public static int binarySearchOfString(String[] arr, String x) throws InvalidException
 	        { if(arr.length>0)
 	        {
 	    		int l = 0, r = arr.length - 1; 
 			while (l <= r) 
 			{ 
 				int pos = l + (r - l) / 2; 
 				int res = x.compareTo(arr[pos]); 
 				if (res == 0) 
 					return pos; 
 				if (res > 0) 
 					l = pos + 1;
 				else
 					r = pos - 1; 
 			} 
 	         return -1;
 	         }throw new InvalidException("array length is invalid");
 	        }
 	    	
 	    	
 	    	
 	   	/**
 	   	 * checking the expression is balanced or not by using stack operation,by pushing parenthesis to the stack
 	   	 * and poping from the stack.by checking equals method.if stack is empty ofter 
 	   	 * poping than expression is balanced
 	   	 * @param ch character arary
 	   	 * @return  boolean
 	   	 */
 	   	public <T> boolean isExpressionBalanced(char[] ch)
 		{   
 			
 		      /* Create a new stack */
 			StackImplementation<String> myStack = new StackImplementation<String>();
 		      /* For each character in the array */
 		      for(int i=0;i <ch.length;i++)
 		      {
 		          /* Check whether the character is left parentheses */
 		          if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[')
 		             /* Push the left parentheses into the stack */
 		             myStack.push("expression[i]");
 		          /* When it is the right parentheses */
 		          if(ch[i]==')' || ch[i]=='}' || ch[i]==']')
 		          {
 		             /* If the stack is empty */
 		             if(isempty())
 		                /* No left pair :: hence not balanced */
 		                return false;
 		             /* Match the right parentheses with the last element of the stack :: not matched :: unbalanced*/
 		             else if(!isParenthesesBalanced(myStack.pop(), ch[i]))
 		                return false;
 		          }
 		      }
 		      /* Check the status of the stack :: If empty, balanced parentheses, otherwise not */
 			return false;
 		}   
 		int size;
 		public  int size() {
 			return size;
 		}
 		 public boolean isempty() 
 		 {
 		   return (size()==0);
 		 }

 		public <T> boolean isParenthesesBalanced(T t1, char c2)
 		 {     
 		      if(t1=="(" && c2==')')
 		          return true;
 		      else if(t1=="{"&& c2=='}')
 		          return true;
 		      else if(t1=="[" && c2==']')
 		          return true;
 		      else
 		          return false;
 		 }
 		public static int[][] twoDArrayOfPrimenum(int n)
 		{
 			for(int i=0;i<n;i++)
 			{
 				for(int j=0;j<n;j++)
 				{
 					
 				}
 			}
 			return null;
 			
 		}
		/*.............................................................................................................../
		 *displaying two dimension array
		 *of prime numbers 
		 */
 		/**displaying prime numbers in two dimensional array
 		 * 
 		 */
 		public static void prime2D()
 		{
 			int row=10,colomn=30;
 			int [][]array=new int[row][colomn];
 			ArrayList<Integer>list=new ArrayList<Integer>();
 			int temp=100;
 			int k=0;
 			list=(ArrayList<Integer>) isPrime(0, 1000);
 			for(int i=0;i<row;i++)
 			{
 				for(int j=0;j<colomn;j++)
 				{
 					if(k<list.size())
 					{
 						if(list.get(k)<=temp)
 						{
 							array[i][j]=list.get(k);
 							k++;
 						}
 					}
 				}
 				temp=temp+100;
 			}
 			System.out.println();
 			for(int i=0;i<row;i++)
 			{
 				for(int j=0;j<colomn;j++)
 				{
 					if(list.get(j)>0)
 					{
 						if(array[i][j]!=0)
 						{
 							System.out.print(array[i][j]+"\t");
 						}
 					}	
 				}System.out.println();
 			}
 		}
 	    	
 	    	
 /****************************************************************************************************************************/
 /*
  * primes are anagram in 2D array
  */
 	    /*	public static void twoDPrimeAnagram(int[] anagram)
 	    	{
 	    		int row=10,column=26;
 	    		System.out.println("hello" +anagram.length);
 	    		int[][] anagramArray = new int[row][column];
 	    		int temp=100,k=0;
 	    		for(int i=0;i<row;i++)
 	    		{
 	    			for(int j=0;j<=column;j++)
 	    			{
 	    				if(k<anagram.length)
 	    				{
 	    					if(anagram[k]<=temp)
 	    					{
 	    						anagramArray[i][j]=anagram[k];
 	    						k=k+1;
 	    					}
 	    				}
 	    			}
 	    			temp=temp+100;
 	    		}
 	    		System.out.println(" ");
 	    		System.out.println(anagramArray.length);
	 	   		for(int i=0;i<row;i++)
	 	   		{
	 	   			for(int j=0;j<=100;j++)
	 	   			{
		 	   							System.out.print(anagramArray[i][j]+"\t");			
	 	   			}
	 	   			System.out.println();
	 	   		}
 	    	}
 	    	public static int[] stringToInt(String[] strings) 
 	    	{
 	    	   int[] intarray=new int[strings.length];
 	    	    int i=0;
 	    	    for(String str:strings)
 	    	    {
 	    	        intarray[i]=Integer.parseInt(str.trim());
 	    	        i++;
 	    	    }
				return intarray;
 	    	}*/
 	    	
 	    	
 	    	
 	    //	
 	    	/**
 	    	 * checking isprime or not
 	    	 * @param l INT LOWER VALUE
 	    	 * @param u int upper value
 	    	 * @return list of primes
 	    	 */
 	    	public static ArrayList<Integer> isPrime(int l,int u)
		 	    {
		 	   		ArrayList<Integer>list=new ArrayList<Integer>();
		 	   		int flag=0;
		 	   		for(int i = l; i <= u; i++)
		 	   		{
		 	   			for( int j = 2; j < i; j++)
		 	   			{
		 	   				if(i % j == 0)
		 	   				{
		 	   					flag = 0;
		 	   					break;
		 	   				}
		 	   				else
		 	   				{
		 	   					flag = 1;
		 	   				}
		 	   			}
		 	   			if(flag == 1)
		 	   			{
		 	   				list.add(i);
		 	   			}
		
		 	   		}
		 	   		return list;
		 	   	}
 	    	
 	    	
 	    	
 	    	/**
 	    	 * displaying the anagram from the set of prime numbers
 	    	 * @param List<String>
 	    	 * @return set<string>
 	    	 */
 	    	public static Set<String> PrimeAnagram(java.util.ArrayList<String> l1)
		 	   	{
		 	   		Set<String>set=new HashSet<String>();
		 	   		for(int i=0;i<l1.size();i++)
		 	   		{
		 	   			for(int j=i+1;j<l1.size();j++)
		 	   			{
		 	   				if(checkAnagram(l1.get(i), l1.get(j)))
		 	   				{
		 	   					set.add(l1.get(i));
		 	   					//set.add(new_list.get(j));
		 	   					//System.out.println(new_list.get(i)+" "+new_list.get(j));
		
		 	   				}
		 	   			}
		 	   		}
		 	   		return set;
		 	   	}
				     
 	    	

// 	   	public  boolean AnagramPrime(List<Integer> list1)
// 	   	{
// 	   		int row=10,colomn=30;
// 	   		int [][]array=new int[row][colomn];
// 	   		int temp=100,k=0;
// 	   		//System.out.println(list1);
// 	   		for(int i=0;i<row;i++)
// 	   		{
// 	   			for(int j=0;j<colomn;j++)
// 	   			{
// 	   				if(k<list1.size())
// 	   				{
// 	   					if(list1.get(k)<=temp)
// 	   					{
// 	   						array[i][j]=list1.get(k);
// 	   						k++;
// 	   					}
// 	   				}
// 	   			}
// 	   			temp=temp+100;
// 	   		}
// 	   		System.out.println();
//
// 	   		// printing 2D array
// 	   		for(int i=0;i<row;i++)
// 	   		{
// 	   			for(int j=0;j<colomn;j++)
// 	   			{
// 	   				if(list1.get(j)>0)
// 	   				{
// 	   					if(array[i][j]!=0)
// 	   					{
// 	   						System.out.print(array[i][j]+"\t");
// 	   					}
// 	   				}	
// 	   			}System.out.println();
// 	   		}
//			return false;		
// 	   	}
 	   	
 	   public static int[] convert(String str)
 	   {
 		  	int[] numbers = new int[str.length()];
 		    
 		    for(int i = 0; i < str.length(); i++) 
 		    {
 		    	numbers[i] = str.charAt(i);
 		    }
 		    return numbers;
 		  }
 	   
		public void printInteger(Integer[] arr1) {
			
			 for(int i=0;i<arr1.length;i++)
	    	  {
	    		  System.out.println(arr1[i]+" ");
	    	  }
		}
		
		
		
//	public static int[] convertIntegers(List<Integer> integers)
//		{
//		    int[] ret = new int[integers.size()];
//		    for (int i=0; i < ret.length; i++)
//		    {
//		        ret[i] = integers.get(i).intValue();
//		    }
//		    return ret;
//		}
	
	
	
	
	
		// A function to find  
		// factorial of a given number 
		public static int factorial(int n) 
		{ 
		    int res = 1; 
		  
		    // Calculate value of  
		    // [1*(2)*---*(n-k+1)] /  
		    // [k*(k-1)*---*1] 
		    for (int i = 1; i <= n; ++i) 
		    { 
		        res *= i; 
		    } 
		  
		    return res; 
		} 
		  
		public static int binomialCoeff(int n, int k)
		                          
		{ 
		    int res = 1; 
		  
		    // Since C(n, k) = C(n, n-k) 
		    if (k > n - k) 
		        k = n - k; 
		  
		    // Calculate value of  
		    // [n*(n-1)*---*(n-k+1)] /  
		    // [k*(k-1)*---*1] 
		    for (int i = 0; i < k; ++i) 
		    { 
		        res *= (n - i); 
		        res /= (i + 1); 
		    } 
		  
		    return res; 
		} 
		  
		  
		// A Binomial coefficient  
		// based function to find  
		// nth catalan number in  
		// O(n) time 
	public static int catalan( int n) 
		{ 
		      
		    // Calculate value of 2nCn 
		    int c = binomialCoeff(2 * n, n); 
		  
		    // return 2nCn/(n+1) 
		    return c / (n + 1); 
		} 
		// A function to count number of 
		// BST with n nodes using catalan 
		public static int countBST( int n) 
		{ 
		    // find nth catalan number 
		    int count = catalan(n); 
		  
		    // return nth catalan number 
		    return count; 
		} 
   public static int countBT(int n) 
		{ 
		    // find count of BST 
		    // with n numbers 
		    int count = catalan(n); 
		  
		    // return count * n! 
		    return count * factorial(n); 
		} 
		  
		
		public static int binomialCoeff(int n)
		{
			int b,d;
			d=(factorial(n+1)*factorial(n));
			b=(factorial(2*n))/d;
			return b;
		}
		
	public static boolean isLeapYearFourDigits(int year)
	{
			if((year%4)==0) {
				if(year!=100 ) {
					if ( year % 400 == 0) {
						return  true;
					} else {
						return  false;
					}
				}else {
					return true;
				}
			}else {
				return false;
			}

		}
	public static int revNum(int n)
	{   
		int k;
	    int v = 0;
	    while(n!=0)
         {
			k=n%10;
			v=v*10+k;
			n=n/10;
			}
		return v;
	}
/***********************************************************************************************************/	


	public String[] assignCards()
	{
		String[] card = {"♣","♦","♥","♠"};
		String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
		String[] deckOfCards = new String[52];
		//Random random = new Random();
		
		int index=0;
		for(int i=0 ; i<card.length;i++)
		{
			for(int j=0;j<rank.length;j++)
			{
				deckOfCards[index++]=rank[j]+" "+card[i];
			}
		}
		System.out.println("\nBefore shuffle");
		for(int i=0;i<deckOfCards.length;i++)
		{
			System.out.print(deckOfCards[i]+ "  ");
		}
		return deckOfCards;
	}
	
		/**This method shuffle the cards using random function
		 * @param deckOfCards : cards to be shuffle
		 * @return shuffle cards
		 */
		public String[] shuffleCards(String[] deckOfCards)
		{
			//shuffling of cards
			for(int i = 0;i<deckOfCards.length;i++)
			{
				int random = (int)(Math.random()*52);  //shuffling using random function
				String temp = deckOfCards[i];
				deckOfCards[i] = deckOfCards[random];
				deckOfCards[random] = temp;
			}
			System.out.println("After shuffle");
			for(int i=0;i<deckOfCards.length;i++)
			{
				System.out.print(deckOfCards[i]+"  ");
			}
			return deckOfCards;
		}
		/**This method distribute shuffled cards in 4 player
		 * @param deckOfCards shuffle cards to be distributed
		 * @param noOfPlayers : total player in which cards in to be distributed 
		 * @param noOfCards : total cards to be distributed in played
		 * @return cards to be distributed
		 */
		//2D array distribution of cards
		public String[][] distributedCards(String[] deckOfCards, int noOfPlayers , int noOfCards)
		{
			System.out.println("\nNow Distributing 9 cards \n");
			int count = 0;
			String[][] distributedCards = new String[noOfPlayers][noOfCards];
			for(int i=0; i < noOfPlayers;i++)
			{
				for(int j=0;j<noOfCards;j++)
				{
					distributedCards[i][j] = deckOfCards[count++];
				}
			}
			int cnt=1;
			for(int i=0; i < noOfPlayers;i++)
			{
				System.out.print("Player "+cnt+"  :  ");
				for(int j=0;j<noOfCards;j++)
				{
					System.out.print(distributedCards[i][j]+"  ");
				}
				cnt++;
				System.out.println("\n");
			}
			return distributedCards;
		}
		QueueLL queue = new QueueLL();
		/**This method copy cards stored in 2d array to 1d array to sort by rank
		 * @param distributedShuffle is distributed cards in players
		 * @param noOfPlayer is no of players 
		 * @param noOfCards is total cards to distribute in players
		 */
		public void deckOfCardsQueue(String[][] distributedShuffle, int noOfPlayer, int noOfCards) 
		{
			String[] cards = new String[noOfCards];
			for(int i= 0;i<noOfPlayer;i++)
			{
				for(int j=0;j<noOfCards;j++)
				{
					cards[j] = distributedShuffle[i][j];   // copying in 1D array
				}
				queue.enqueue("\nPlayer "+(i+1)+" Cards");
				sortCards(cards);
			}
			queue.show();   //Printing sorted cards
		}
		
		/**This method sort the cards by rank
		 * @param cards are players cards
		 */
		public  void sortCards(String[] cards)
		{
			char[] numberRank = {'A','2','3','4','5','6','7','8','9','0','J','Q','K'};
			//System.out.println("sorting cards");
			for(int i = 0 ; i < numberRank.length;i++)
			{
				for(int j = 0 ; j < cards.length ; j++)
				{   
					String card = cards[j];    
					char cardRank = card.charAt(0);   //For checking first element in cards array
					if(cardRank == numberRank[i]) 
					{
						queue.enqueue(card);  //add sorted card in queue
					}
				}
			}
		}

}
    
     

  


















