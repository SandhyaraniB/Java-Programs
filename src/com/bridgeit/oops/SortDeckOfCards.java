package com.bridgeit.oops;
import com.bridgeit.util.Util;

import java.util.Random;

import com.bridgeit.datastructure.QueueImplementation;
public class SortDeckOfCards 
{

	public static void main(String[] args) 
	{
		Util utility = new Util();
		int noOfPlayer = 4;
		int noOfCards = 9;
		String[] init = utility.assignCards();
		String[] shuffleCards = utility.shuffleCards(init);
		String[][] distributedShuffle = utility.distributedCards(shuffleCards, noOfPlayer, noOfCards);
		System.out.println("Players Cards After Sorting ");		
		utility.deckOfCardsQueue(distributedShuffle, noOfPlayer, noOfCards);
        }
}

	
	




