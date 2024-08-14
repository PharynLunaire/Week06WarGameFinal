import java.util.*;
/*
 * 1. Create Deck Class
 * 2. Create Fields
 * a) cards (List of Cards)
 * 3. Create Methods
 * a) Shuffle (randomizes the order of the cards)
 * b) Draw (removes and returns the top card of the Cards field)
 * c) in the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
 */
public class Deck {
List<Card> cards = new ArrayList<Card>();
String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};

Deck() {
  int [] numbers = {2,3,4,5,6,7,8,9,10,11,12,13,14};
  
  for (String suit: suits) {
    int count = 2;
    for (Integer numberName: numbers) {
      cards.add(new Card(numberName, suit));
      count++;
    }
  }
}
/* 
 * @return the cards
 * public List<Card> getCards() {
 * return cards;
 * }
 * 
 * @Param cards the cards to set
 * public void setCards(List<Card> cards) {
 * this.cards = cards;
 * }
 */
public void describe() {
  for (Card card: this.cards) {
    card.describe();
  }
}
public void shuffle() {
  Collections.shuffle(cards);
}
public Card draw() {
  Card card = cards.remove(0);
  return card;
}
}
