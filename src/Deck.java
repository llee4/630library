package com.github.llee4;

import java.util.ArrayList;

public class Deck {
	
	private ArrayList<Integer> deck = new ArrayList<Integer>();
	
	public Deck() {
	
	for(int k = 0; k<48; k++) {
		int i = k/4;
		int j = k%4;
		deck.add(10*i + j);}
	}//close constructor
	
	public ArrayList getDeck() {
		return deck;
	}


}//close Deck class


 