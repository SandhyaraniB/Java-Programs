package com.bridgeit.oops;

import com.bridgeit.datastructure.QueueImplementation;
import com.bridgeit.util.Util;
public class DeckOfCards {

	public static void main(String[] args) 
	{
		Util util= new Util();
		int noOfPlayer = 4;
		int noOfCards = 9;
		String[] init = util.assignCards();
		String[] shuffleCards = util.shuffleCards(init);
		@SuppressWarnings("unused")
		String[][] distributedshuffle = util.distributedCards(shuffleCards, noOfPlayer, noOfCards);
	}
		
		
		
		
		
	}
   /*  String[] suits = {"♣","♦","♥","♠"};
     String[] rank = {"2","3","4","5","6","7","8", "9","10","Jack","Queen","King","Ace"};
     int SUITS = suits.length;
     int RANKS = rank.length;
     int N = SUITS * RANKS;

     // initialize deck
     String[] deck = new String[N];
     for (int i = 0; i < RANKS; i++) {
         for (int j = 0; j < SUITS; j++) {
             deck[SUITS*i + j] = rank[i]+""+suits[j];
         }
     } 
     // shuffle
     for (int i = 0; i < N; i++) 
     { 
         int j = (int) (Math.random() * (N));
         String t = deck[i];
         deck[i] = deck[j];
         deck[j] = t;
     }
     String[][] array = new String[N][N];
    
     // print shuffled deck
     for (int i = 0; i <4; i++)
     {     System.out.println("player"+""+i);
    	 for(int j = 0;j<13;j++)
    	 {
    		  array[i][j] = deck[i];
    		 
    		  System.out.print(array[i][j]+" ");
    	  }System.out.println();
     }
     
   
 }*/

	


