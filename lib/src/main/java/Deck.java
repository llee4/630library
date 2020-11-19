package com.github.llee4;

import java.util.ArrayList;

/**
 * Represents a Go-Stop card deck
 */
public class Deck {

	/**
	 * Stores the cards as integers
	 */
	private ArrayList<Integer> deck = new ArrayList<Integer>();
	
	/**
	 * Instantiates a Deck
	 */
	public Deck() {
	
	for(int k = 0; k<48; k++) {
		int i = k/4;
		int j = k%4;
		deck.add(10*i + j);}
	}//close constructor
	
	/**
	 * Returns the ArrayList representing the deck
	 */
	public ArrayList<Integer> getDeck() {
		return deck;
	}


}//close Deck class


 