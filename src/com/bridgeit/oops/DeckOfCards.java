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

	


