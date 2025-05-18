public class Student2 {
  private static int counter = 0;
  private int id;
  private Candy[] candies;

  public Student2() {
    this.id = ++counter;
    this.candies = new Candy[0];

  public int getId() {
    return this.id;
  }
  public Candy() getCandies() {
    return this.candies;
  }
  public int getTotelNumber() {
    int sum = 0;
    for (int i = 0; i < this.candies.length; i++) {
      sum += this.candies[i].getNumber();
    }
    return sum;
  }
  public int numberOfRed() {
   int sum = 0;
   for (int i = 0; i < this,candies.length; i++) {
    if (this.cnadies[i].getColor().equals("RED")) {
      count++;
    }
   }
   return sum;
  }
  }
  public void receive(Candy candy) {
    Candy[] newCandies = new Candy[this.candies.length + 1];
    for (int i = 0; i < this.candies.length; i++) {
      newCandies[i] = this.candies[i];
    }
    newCandies[newCandies.length - 1] = candy;
    this.candies = newCandies;
  }
  public static void main(String[] args) {

  }
  
}
