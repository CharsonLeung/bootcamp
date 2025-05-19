public enum Suit {
  DIAMOND,
  CLUB,
  HEART,
  SPADE,
  ;
  //private int value;

  //private Suit(int value) {
    //this.value = value;
 // }
  //public int getValue() {
  //  return this.value;
  //}

  //public int compareTo(Suit suit) {
  //  if (this == suit)
  //  return 0;
  //  else if (this.getValue() > suit.getValue())
  //  return 1;
  //  else
  //  return -1;
  //}

  public static void main(String[] args) {
    // enum compareTo  -> ordering
    System.out.println(Suit.HEART.compareTo(Suit.DIAMOND));
  }
}
