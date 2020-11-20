package com.github.llee4;

import java.util.ArrayList;
//inspired by https://stackoverflow.com/questions/16014579/how-to-shuffle-an-arraylist-without-collections/16014748

/**
 * Shuffles decks of cards represented by an ArrayList of Integers
 */
public class Shuffle {
	/**
	 * Shuffles a given ArrayList representing a deck
	 * @param deck
	 */
	public static void shuffle(ArrayList<Integer> deck) {
		int size = deck.size();
		for (int i = 0; i < size; i++) {
			int newSpot = (int) (size * Math.random());
			swap(deck, i, newSpot);
		} // close for loop
	}// close shuffle method

	/**
	 * Swaps two 'cards' in the deck (helper method)
	 * @param deck
	 * @param i
	 * @param newSpot
	 */
	private static void swap(ArrayList<Integer> deck, int i, int newSpot) {
		int val = deck.get(i);
		deck.set(i, deck.get(newSpot));
		deck.set(newSpot, val);
	}// close swap method
}
