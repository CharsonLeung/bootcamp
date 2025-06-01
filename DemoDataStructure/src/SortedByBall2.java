import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedByBall2 implements Comparator<Ball> {
  @Override
   public int compare(Ball b1, Ball b2) {
    if (b1.getColor() == b2.getColor()) {
      return b1.getNumber() > b2.getNumber() ? -1 : 1;
    }
    if (b1.getColor() == Ball.Color.YELLOW)
      return -1;
    if (b2.getColor() == Ball.Color.YELLOW)
      return 1;
    if (b1.getColor() == Ball.Color.RED)
      return -1;
    if (b2.getColor() == Ball.Color.RED)
      return 1;
    return -1;
  } 

  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(Ball.Color.BLUE, 2));
    balls.add(new Ball(Ball.Color.YELLOW, 5));
    balls.add(new Ball(Ball.Color.RED, 1000));
    balls.add(new Ball(Ball.Color.BLUE, 10));
    balls.add(new Ball(Ball.Color.YELLOW, 9));
    balls.add(new Ball(Ball.Color.RED, 10));
    balls.add(new Ball(Ball.Color.YELLOW, 4));
    balls.add(new Ball(Ball.Color.BLUE, 8));
    balls.add(new Ball(Ball.Color.RED, 8));


    // Assignment: SortByBall2.java
    // if color is same, larger number goes first.
    // YELLOW, 9 -> YELLOW, 5 -> RED, 1000 -> BLUE, 10 -> BLUE, 2
    Collections.sort(balls, new SortByBall());
    Collections.sort(balls, new SortedByBall2());
    System.out.println(balls);
  }
}
