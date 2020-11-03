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
	
	public ArrayList getHandcards( ){
		return handcards;
	}
	public ArrayList getWoncards( ){
		return woncards;
	}

	
	
}//close Players Class