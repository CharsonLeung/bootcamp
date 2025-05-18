import java.math.BigDecimal;

public class Rectangle extends Shape {
  private double length;
  private double width;

  public Rectangle(String color, double length, double width) {
    super(color);
    this.length = length;
    this.width = width;
    
  }
  @Override public double area() {
    return BigDecimal.valueOf(this.length).multiply(BigDecimal.valueOf(this.width)).doubleValue();
  }
  
}
