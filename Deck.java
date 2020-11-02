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

class Players{
	
	private ArrayList<Integer> handcards = new ArrayList <Integer>();
	private ArrayList<Integer> woncards = new ArrayList <Integer>();
	private Deck newDeck = new Deck();
	private ArrayList<Integer> currentDeck = newDeck.getDeck();
	
	public Players () {
	for(int i = 0; i<10; i++) {
	handcards.add(currentDeck.get(0));	
	currentDeck.remove(0);
	}//close for-loop	

	}//close constructor

	
	
}//close Players Class

/*
 * private ArrayList<Integer> tablecards = new ArrayList <Integer>();
 * 	for(int i = 0; i<8; i++) {
	tablecards.add(currentDeck.get(0));	
	currentDeck.remove(0);
	}//close for-loop	
	
 */ 
 

