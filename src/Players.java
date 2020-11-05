package com.github.llee4;

import java.util.ArrayList;

/**
 * Represents the game players
 */
class Players {

	/**
	 * Holds the cards in the players' 'hand'
	 */
	private ArrayList<Integer> handcards = new ArrayList<Integer>();
	/**
	 * Holds the won cards
	 */
	private ArrayList<Integer> woncards = new ArrayList<Integer>();
	/**
	 * Represents the deck being used
	 */
	private Deck newDeck = new Deck();
	private ArrayList<Integer> currentDeck = newDeck.getDeck();

	/**
	 * Creates a Players object
	 */
	public Players() {
		for (int i = 0; i < 10; i++) {
			handcards.add(currentDeck.get(0));
			currentDeck.remove(0);
		} // close for-loop

	}// close constructor

	/**
	 * Returns the cards in hand
	 */
	public ArrayList<Integer> getHandcards() {
		return handcards;
	}

	/**
	 * Returns the won cards
	 */
	public ArrayList<Integer> getWoncards() {
		return woncards;
	}

}// close Players Class