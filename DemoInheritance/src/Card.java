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
  public char compareRank() {
    if (this.rank > 2 && this.rank <= 9) {
      return this.rank; 
      } else if (this.rank == 'T') {
        return this.rank = 'T';
      } else if (this.rank == 'J' || this.rank == 'U') {
        return this.rank = 'U';
      } else if (this.rank == 'Q' || this.rank == 'V') {
        return this.rank = 'V';
      } else if (this.rank == 'K' || this.rank == 'W') {
        return this.rank = 'W';
      } else if (this.rank == 'A' || this.rank == 'X') {
       return this.rank = 'X'; 
      } else if (this.rank == '2' || this.rank == 'Y') {
        return this.rank = 'Y';
      } else {return this.rank;}
    }

    // Spade > Heart > Club > Diamond
    public boolean compareSuit(Card card) {
      if (this.suit == 'S') {
        return true;
    } else if (this.suit == 'H' && card.getSuit() != 'S') {
        return true;
    } else if (this.suit == 'C' && (card.getSuit() != 'H' && card.getSuit() != 'S')) {
        return true;
    } else if (this.suit == 'D' && (card.getSuit() != 'C' && (card.getSuit() != 'H' && card.getSuit() != 'S'))) {
      if (this.compareRank() > card.compareRank()) {
        return true;
    } else {return false;}
  } else {return false;} 
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
  // ! Rewrite the definition of Card
  // ! false -> true
  public boolean equals(Card card) {
    return this.rank == card.getRank() && this.suit == card.getSuit();
  }

  
    // ACE Diamond vs King Diamond  -> 1
    // King Diamond vs ACE Diamond -> -1
    public int compareTo(Card card) {
      // rank
      if (this.compareRank() > card.compareRank()) {
        return 1;
        } else if ((this.compareSuit(card) == true) && (this.compareRank() > card.compareRank())) {
          return 1;
        } else {return -1;}
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

       // ACE Diamond vs King Diamond  -> 1
       // King Diamond vs ACE Diamond -> -1
      Card c4 = new Card('A', 'D');
      Card c5 = new Card('K', 'D');
      System.out.println(c4.toString());
      System.out.println(c5.toString());
      System.out.println(c4.compareTo(c5));
      System.out.println(c5.compareTo(c4));
      
    }


}
