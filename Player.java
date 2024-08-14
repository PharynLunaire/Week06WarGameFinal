import java.util.*;
/*
 * 1. Create Player Class
 * 2. Create Fields
 * a) Hand (List of Card)
 * b) Score (set to 0 in the constructor)
 * c) Name
 * 3. Methods
 * a) Describe (prints out information about the player and calls the describe method for each card in the Hand List
 * b) Flip (removes and returns the top card of the Hand)
 * c) Draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
 * d) incrementScore (adds 1 to the Player's Score Field)
 */
public class Player {
  // Fields
  String name;
  int score;
  List<Card> hand = new ArrayList<Card>();
  
  //Constructor
  public Player() {
  }
  public Player(String name, List<Card> hand, int score) {
    this.name = name;
    this.hand = hand;
    this.score = 0;
  }
  //Prints out information about the cards
  //that the player has in their hand
  /*public void describe() {
   *System.out.println("\nPlayer: " + name + " has these cards in their hand 
   *for (Card card : this.hand) {
   *card.describe();
   *}
   */
public void draw(Deck deck) {
  hand.add(deck.draw());
}
public Card flipcard() {
  return hand.remove(0);
}
public void incrementScore() {
  score++;
}
public String getName() {
  return name;
}
public void setName(String name) {
  this.name = name;
  }
public int getScore() {
  return score;
}
public void setScore(int score) {
  this.score = score;
}
public List<Card> getHand(){
  return hand;
}

}
