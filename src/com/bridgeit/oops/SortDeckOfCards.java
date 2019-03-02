package com.bridgeit.oops;

import com.bridgeit.datastructure.QueueImplementation;
public class SortDeckOfCards {

	public static void main(String[] args) 
	{
		String PlayeredCard[][]=com.bridgeit.util.Util.cardDistribution();
		QueueImplementation< QueueImplementation<String>> sortedcard= com.bridgeit.util.Util.cardSort(PlayeredCard);
        String playername[]= {"player1","player2","player3","player4"};
        int index=0;
        while(!sortedcard.isEmpty())
        {
        	QueueImplementation<String> temp=(QueueImplementation<String>) sortedcard.deQueue();
        	System.out.println(playername[index]+"-->");
        	while(!temp.isEmpty())
        	{
        		System.out.println(temp.deQueue()+" ");
        	}
        	System.out.println();
        	index++;
        }
	}

}
