// A class that represents a deck of playing-cards

import java.security.SecureRandom;

public class Deck{
	private Card[] deck; // an array of Card objects
	private int currentCard; // index of card to be dealt
	private static final int NUMBER_OF_CARDS = 52;
	// random number generator
	private static final SecureRandom random = new SecureRandom();
	// constructor to fill the deck with cards
	public Deck(){
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
		
		for (int i=0; i<NUMBER_OF_CARDS; i++){
			deck[i] = new Card(faces[i%13], suits[i%3]);
		} // end loop
	} // end constructor

	// method for shuffling cards
	public void shuffle(){
		currentCard = 0; // always start at the first card
		for (int first=0; first<deck.length; first++){
			int second = random.nextInt(NUMBER_OF_CARDS); // select a random card to swap with the first card
			// swap cards
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		} // end shuffling loop
	} // end method

	// method for dealing cards
	public Card dealCard(){
		// determine whether there are cards left
		if (currentCard < deck.length){
			return deck[currentCard++];
		}
		else{
			return null; // no cards left
		}
	} // end method
} // end class