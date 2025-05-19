import java.util.Objects;

public class Kart {
 private int rank;
 private Suit suit;

 public Kart(int rank, Suit suit) {
  this.rank = rank;
  this.suit = suit;
 }
 public int getRank() {
    return this.rank;
  }

 public Suit getSuit() {
    return this.suit;
  } 

@Override
  public boolean equals(Object obj) {
    // Part 1: check address first
    if (this == obj)
      return true;
    // Part 2:
    if (!(obj instanceof Kart)) 
    return false;
    // Part 3;
    Kart karte = (Kart) obj;
    return this.rank == karte.getRank() && this.suit == karte.getSuit();
  }
    @Override
    public int hashCode() {
      return Objects.hash(this.rank, this.suit);
    }
    @Override
    public String toString() {
      char subRank = 0;
      if (this.rank == 10) {
        return "Card("
            + "rank: " + this.rank 
            + " suit: " + this.suit
            + ")";
      } else if (this.rank == 1) {
         subRank = 'A';
      } else if (this.rank == 11) {
        subRank = 'J';
      } else if (this.rank == 12) {
        subRank = 'Q';
      } else if (this.rank == 13) {
        subRank = 'K';
      } else {
        subRank = (char)(this.rank + 48);
      }
      return "Card("
            + "rank: " + subRank 
            + " suit: " + this.suit
            + ")";
    }
    public static void main(String[] args) {
      System.out.println((char)48);
    }
}
