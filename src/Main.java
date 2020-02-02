public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
		
		Deck<Card> deck = new Deck<Card>();
		
		Card CARD_EXAMPLE = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
		deck.addCard(CARD_EXAMPLE);
		
		Card randomCard = deck.getCard();
	    System.out.println(randomCard.getRank());
	    System.out.println(randomCard.getSuit());
		
	}

}
