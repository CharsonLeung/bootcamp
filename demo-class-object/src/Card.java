public class Card {
  private char rank; // A,2,3,4,5,6,7,8,9,T,J,Q,K (T = TEN)
  private char suit; // D,C,H,S
  
  public Card(char rank, char suit) {
    this.rank = rank;
    this.suit = suit;
  }
  public char getRank() {
    return this.rank;
  }
  public char getSuit() {
    return this.suit;
  }
  
  // ! Rewrite the definition of Card
  // ! false -> true
  public boolean equals(Card card) {
    return this.rank == card.getRank() && this.suit == card.getSuit();
  }
  public static void main(String[] args) {
    // ACE Spade
    Card c1 = new Card('A', 'S');
    // 5 Diamond
    Card c2 = new Card('5', 'D');

    System.out.println(c1.equals(c2)); // false

    Card c3 = new Card('A', 'S');
    
    System.out.println(c1.equals(c3)); // true
  }


}
