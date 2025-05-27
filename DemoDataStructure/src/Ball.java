import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ball {
  private Color color;
  private Integer number;

  public Ball(Color color, Integer number) {
    this.color = color;
    this.number = number;
  }
  public Color getColor() {
    return this.color;
  }
  public Integer getNumber() {
    return this.number;
  }

  @Override
  public String toString() {
    return "Ball(" + this.color + ", " + this.number + ")";
  }
  public static enum Color {
    RED, BLUE, YELLOW,;
  }
  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(Color.BLUE, 2));
    balls.add(new Ball(Color.YELLOW, 5));
    balls.add(new Ball(Color.RED, 1000));
    balls.add(new Ball(Color.BLUE, 10));
    balls.add(new Ball(Color.YELLOW, 9));
    balls.add(new Ball(Color.RED, 10));
    balls.add(new Ball(Color.YELLOW, 4));
    balls.add(new Ball(Color.BLUE, 8));
    balls.add(new Ball(Color.RED, 8));

    // Arrays.sort() -> sort array

    // sort List
    Collections.sort(balls, new SortByBall());
    System.out.println(balls);

    // SortByColor.java
    // YELLOW -> RED -> BLUE
    
    // Assignment: SortByBall2.java
    // if color is same, larger number goes first.
    // YELLOW, 9 -> YELLOW, 5 -> RED, 1000 -> BLUE, 10 -> BLUE, 2
    Collections.sort(balls, new SortedByBall2());
    System.out.println(balls);
  }
}
