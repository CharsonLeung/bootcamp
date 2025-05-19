import java.util.Arrays;

public class Deck {
  private static final int[] RANKS = 
  new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13};
  private static final Suit[] SUITS = new Suit[] {Suit.DIAMOND, Suit.CLUB, Suit.HEART, Suit.SPADE};

  private Kart[] karte;
  

  


  public Deck() {
    karte = new Kart[RANKS.length * SUITS.length];
    // 4 * 13
    int index = 0;
    for (int i = 0; i < SUITS.length; i++) {
      for (int j = 0; j < RANKS.length; j++) {
        this.karte[index++] = new Kart(RANKS[j], SUITS[i]);
      }
    }
    
  }
  
  public Kart[] getCards() {
    return this.karte;
  }
  
  
  
  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(Arrays.toString(deck.getCards()));

    int[] arr = new int[] {3, 2, 1};
    System.out.println(Arrays.toString(arr));

    // for-each
    for (Suit suit : Suit.values()) {
      System.out.println(suit);
    }
    System.out.println(Suit.values().length);
  }
}
