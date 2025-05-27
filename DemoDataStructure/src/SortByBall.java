import java.util.Comparator;

public class SortByBall implements Comparator<Ball>{

  @Override
   public int compare(Ball b1, Ball b2) {
    if (b1.getColor() == Ball.Color.YELLOW)
      return -1;
    if (b2.getColor() == Ball.Color.YELLOW)
      return 1;
    if (b1.getColor() == Ball.Color.RED)
    return -1;
    if (b2.getColor() == Ball.Color.RED)
    return 1;
    else {return 0;}
  }
  
}
