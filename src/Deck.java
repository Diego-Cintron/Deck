import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Deck<T>{

	private ArrayList<T> deck;
	int numberOfCards;

	public Deck() {
		this.deck = new ArrayList<T>();
		numberOfCards = 52;
		setDeck();
	}

	public void addCard(T c) {
		// Add a way to not overflow the bag

		deck.add(c);
		numberOfCards++;
	}

	public T getCard() {
		int randomNum = ThreadLocalRandom.current().nextInt(0, numberOfCards);
		return deck.get(randomNum);
	}
	
	@SuppressWarnings("unchecked")
	private void setDeck() {
		deck.add((T) new Card(Card.Rank.ACE, Card.Suit.CLUBS));
		deck.add((T) new Card(Card.Rank.ACE, Card.Suit.DIAMONDS));
		deck.add((T) new Card(Card.Rank.ACE, Card.Suit.HEARTS));
		deck.add((T) new Card(Card.Rank.ACE, Card.Suit.SPADES));
		deck.add((T) new Card(Card.Rank.TWO, Card.Suit.CLUBS));
		deck.add((T) new Card(Card.Rank.TWO, Card.Suit.DIAMONDS));
		deck.add((T) new Card(Card.Rank.TWO, Card.Suit.HEARTS));
		deck.add((T) new Card(Card.Rank.TWO, Card.Suit.SPADES));
		deck.add((T) new Card(Card.Rank.THREE, Card.Suit.CLUBS));
		deck.add((T) new Card(Card.Rank.THREE, Card.Suit.DIAMONDS));
		deck.add((T) new Card(Card.Rank.THREE, Card.Suit.HEARTS));
		deck.add((T) new Card(Card.Rank.THREE, Card.Suit.SPADES));
		deck.add((T) new Card(Card.Rank.FOUR, Card.Suit.CLUBS));
		deck.add((T) new Card(Card.Rank.FOUR, Card.Suit.DIAMONDS));
		deck.add((T) new Card(Card.Rank.FOUR, Card.Suit.HEARTS));
		deck.add((T) new Card(Card.Rank.FOUR, Card.Suit.SPADES));
		deck.add((T) new Card(Card.Rank.FIVE, Card.Suit.CLUBS));
		deck.add((T) new Card(Card.Rank.FIVE, Card.Suit.DIAMONDS));
		deck.add((T) new Card(Card.Rank.FIVE, Card.Suit.HEARTS));
		deck.add((T) new Card(Card.Rank.FIVE, Card.Suit.SPADES));
		deck.add((T) new Card(Card.Rank.SIX, Card.Suit.CLUBS));
		deck.add((T) new Card(Card.Rank.SIX, Card.Suit.DIAMONDS));
		deck.add((T) new Card(Card.Rank.SIX, Card.Suit.HEARTS));
		deck.add((T) new Card(Card.Rank.SIX, Card.Suit.SPADES));
		deck.add((T) new Card(Card.Rank.SEVEN, Card.Suit.CLUBS));
		deck.add((T) new Card(Card.Rank.SEVEN, Card.Suit.DIAMONDS));
		deck.add((T) new Card(Card.Rank.SEVEN, Card.Suit.HEARTS));
		deck.add((T) new Card(Card.Rank.SEVEN, Card.Suit.SPADES));
		deck.add((T) new Card(Card.Rank.EIGHT, Card.Suit.CLUBS));
		deck.add((T) new Card(Card.Rank.EIGHT, Card.Suit.DIAMONDS));
		deck.add((T) new Card(Card.Rank.EIGHT, Card.Suit.HEARTS));
		deck.add((T) new Card(Card.Rank.EIGHT, Card.Suit.SPADES));
		deck.add((T) new Card(Card.Rank.NINE, Card.Suit.CLUBS));
		deck.add((T) new Card(Card.Rank.NINE, Card.Suit.DIAMONDS));
		deck.add((T) new Card(Card.Rank.NINE, Card.Suit.HEARTS));
		deck.add((T) new Card(Card.Rank.NINE, Card.Suit.SPADES));
		deck.add((T) new Card(Card.Rank.TEN, Card.Suit.CLUBS));
		deck.add((T) new Card(Card.Rank.TEN, Card.Suit.DIAMONDS));
		deck.add((T) new Card(Card.Rank.TEN, Card.Suit.HEARTS));
		deck.add((T) new Card(Card.Rank.TEN, Card.Suit.SPADES));
		deck.add((T) new Card(Card.Rank.JACK, Card.Suit.CLUBS));
		deck.add((T) new Card(Card.Rank.JACK, Card.Suit.DIAMONDS));
		deck.add((T) new Card(Card.Rank.JACK, Card.Suit.HEARTS));
		deck.add((T) new Card(Card.Rank.JACK, Card.Suit.SPADES));
		deck.add((T) new Card(Card.Rank.QUEEN, Card.Suit.CLUBS));
		deck.add((T) new Card(Card.Rank.QUEEN, Card.Suit.DIAMONDS));
		deck.add((T) new Card(Card.Rank.QUEEN, Card.Suit.HEARTS));
		deck.add((T) new Card(Card.Rank.QUEEN, Card.Suit.SPADES));
		deck.add((T) new Card(Card.Rank.KING, Card.Suit.CLUBS));
		deck.add((T) new Card(Card.Rank.KING, Card.Suit.DIAMONDS));
		deck.add((T) new Card(Card.Rank.KING, Card.Suit.HEARTS));
		deck.add((T) new Card(Card.Rank.KING, Card.Suit.SPADES));
	}

}