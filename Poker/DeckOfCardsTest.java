// testing card shuffling and dealing using Deck and Cards-class

public class DeckOfCardsTest{
	public static void main(String[] args){
		Deck myDeck = new Deck();
		
		// print all cards in the deck
		for (int i=1; i<=52; i++){
			System.out.printf("%-19s", myDeck.dealCard().toString());
			if (i%4==0){
				System.out.println();
			}
		} // end loop

		System.out.println("Shuffling cards.");
		// shuffle deck
		myDeck.shuffle();

		// print shuffled cards
		for (int i=1; i<=52; i++){
			System.out.printf("%-19s", myDeck.dealCard().toString());
			if (i%4==0){
				System.out.println();
			}
		} // end loop
	} // end main
} // end class