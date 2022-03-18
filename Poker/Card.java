// This class represents a playing-card.

public class Card{
	private final String face;
	private final String suit;
	// constructor
	public Card(String face, String suit){
		this.face = face;
		this.suit = suit;
	} // end constructor

	// a method to get the card
	public String toString(){
		return this.face + " of " + this.suit;
	} // end method
} // end class Card