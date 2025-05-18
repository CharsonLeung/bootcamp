import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Triangle extends Shape {
  private double base;
  private double height;

  public Triangle(String color, double base, double height) {
    super(color);
    this.base = base;
    this.height = height;
  }
  public double getBase() {
    return this.base;
  }
  public double getHeight() {
    return this.height;
  }

  @Override public double area() {
    return BigDecimal.valueOf(this.base)
    .multiply(BigDecimal.valueOf(this.height))
    .divide(BigDecimal.valueOf(2), RoundingMode.HALF_UP).doubleValue();
  }
  @Override public boolean equals(Object obj) {
    if (this == obj)
    return true;
    if (!(obj instanceof Triangle))
    return false;
    Triangle triangle = (Triangle) obj;
    return (this.base == triangle.base && this.height == triangle.height)
            && this.getColor() == triangle.getColor();
    }
    @Override public int hashCode() {
      return Objects.hash(this.base, this.height, this.getColor());
    }
    @Override public String toString() {
      return "This is a triangle of color " 
              + this.getColor()
              + ", base is " + this.base 
              + " and height is " + this.height + ".";
    }
    public boolean equals(Triangle triangle) {
      return this.getColor() == triangle.getColor() && (this.base == triangle.getBase()) && (this.height == triangle.getHeight()); 
    }
  public static void main(String[] args) {
    Triangle delta = new Triangle("Red", 14, 13);
    Triangle delta2 = new Triangle("Pink", 14, 13);
    Triangle delta3 = new Triangle("Red", 14, 13);
    System.out.println(delta.equals(delta2));
    System.out.println(delta3.equals(delta));
    System.out.println(delta == delta3);
  }
}

