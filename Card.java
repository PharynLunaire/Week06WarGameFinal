/* 1. Create the Card class
 * 2. Create two fields
 * a) value (containing a value from 2-14 representing the cards in the deck. Ace = 2)
 * b) name (e.g. Ace of Diamonds, or Two of Hearts)
 * 3. Create Methods:
 * a) Getters and Setters
 * b) describe (prints out information about a card)
 */

public class Card {
// (e.g. Ace of Diamonds, or Two of Hearts)
  String name;
  // Contains a value from 2-14 representing cards. Ace = 2
  int value;
  
  public Card(int value, String suit) {
    this.value = value;
  
    switch(value) {
      case 2:
        name = "Two";
        break;
      case 3:
        name = "Three";
        break;
      case 4:
        name = "Four";
        break;
      case 5:
        name = "Five";
        break;
      case 6:
        name = "Six";
        break;
      case 7:
        name = "Seven";
        break;
      case 8:
        name = "Eight";
        break;
      case 9:
        name = "Nine";
        break;
      case 10:
        name = "Ten";
        break;
      case 11:
        name = "Jack";
        break;
      case 12: 
        name = "Queen";
        break;
      case 13: 
        name = "King";
        break;
      case 14:
        name = "Ace";
        break;
        }
    name += " of " + suit;
  }
  public String toString() {
    return name;
  }
  public void describe() { //describe method for printing name of card
    System.out.println(name);
  }
  public int getValue() {
    return value;
  }
  
}
