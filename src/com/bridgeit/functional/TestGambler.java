package com.bridgeit.functional;

public class TestGambler {

	public static void main(String[] args) {
		System.out.println("enter the values");
		int stake=com.bridgeit.util.Util.getInt();
		int goal=com.bridgeit.util.Util.getInt();
		int games=com.bridgeit.util.Util.getInt();
		System.out.println(com.bridgeit.util.Util.gambler(stake,goal,games));
		
	}

}
