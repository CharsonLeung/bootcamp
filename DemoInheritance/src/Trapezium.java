import java.math.BigDecimal;
import java.math.RoundingMode;

public class Trapezium extends Shape {
  private double upperBase;
  private double lowerBase;
  private double height;

  public Trapezium(String color, double upperBase, double lowerBase, double height) {
    super(color);
    this.upperBase = upperBase;
    this.lowerBase = lowerBase;
    this.height = height; }


  @Override public double area() {
    return (BigDecimal.valueOf(upperBase).add(BigDecimal.valueOf(lowerBase)))
            .multiply(BigDecimal.valueOf(height))
            .divide(BigDecimal.valueOf(2), RoundingMode.HALF_UP).doubleValue();
             }
    public String checkTrapez() {
      if (this.upperBase == this.lowerBase) {
        return "This is a rectangle!";
      } else {return "This is a trapezium!"; }
    }
  public static void main(String[] args) {
    Trapezium t1 = new Trapezium("BLUE", 3, 6, 10);
    System.out.println(t1.checkTrapez());
    System.out.println(t1.area());
    Trapezium t2 = new Trapezium("RED", 4, 4, 6);
    System.out.println(t2.checkTrapez());
    System.out.println(t2.area());
  }
}