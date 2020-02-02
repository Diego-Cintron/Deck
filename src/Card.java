public class Card {
	
	public enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}
	public enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES}
	
	private Rank rank;
	private Suit suit;
	
	public Card(Rank R, Suit S) {
		this.rank = R;
		this.suit = S;
	}
	
	public Rank getRank() {
		return this.rank;
	}
	
	public Suit getSuit() {
		return this.suit;
	}

}
