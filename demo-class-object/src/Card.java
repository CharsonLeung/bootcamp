import java.util.Objects;

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
// ! Override false -> true
    @Override
  public boolean equals(Object obj) {
    // Part 1: check address first
    if (this == obj)
      return true;
    // Part 2:
    if (!(obj instanceof Card)) 
    return false;
    // Part 3;
    Card card = (Card) obj;
    return this.rank == card.getRank() && this.suit == card.getSuit();
  }
    @Override
    public int hashCode() {
      return Objects.hash(this.rank, this.suit);
    }
    @Override
    public String toString() {
      return "Card("
            + "rank: " + this.rank 
            + " suit: " + this.suit
            + ")";
    }

    // ACE Diamond vs King Diamond  -> 1
    // King Diamond vs ACE Diamond -> -1
    public Card compareTo(Card card) {
      
      // rank
      if (this.rank > card.getRank()) {
        // Spade > Heart > Club > Diamond
        if ()
      }
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

     c1 = new Card('A', 'D');
     c2 = new Card('A', 'D');
     System.out.println(c1.equals(c2)); 
     // false, if it is using Object.equals(), we do not override in Card.class
     // ! Object.equals() is checking address.
     // true, if you re-define card.equals()

     // ! The definition of hashCode() always as equals()
     System.out.println(c1.hashCode());
     System.out.println(c2.hashCode());
      System.out.println(c1.toString());
      System.out.println(c2.toString());
      System.out.println(c1 == c2); // false

      String s1 = new String("hello");
      String s2 = new String("hello");
      System.out.println(s1.equals(s2)); // true
      System.out.println(s1.compareTo(s2)); // 0
      System.out.println(s1.compareTo("abcde")); // 7 (h vs a)


      Integer x = 10;
      System.out.println(x.equals(10)); // true
      System.out.println(x.compareTo(5)); // 1
 
      
      Card c4 = new Card('5', 'C');
      Card c5 = new Card('5', 'C');
      Card c6 = new Card('5', 'C');
      Card c7 = new Card('5', 'C');
      System.out.println(c4.equals(c5));

    }


}
