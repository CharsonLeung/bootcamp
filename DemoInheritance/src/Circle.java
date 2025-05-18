import java.math.BigDecimal;
import java.util.Objects;

public class Circle extends Shape {
  private double radius;

  public Circle(String color, double radius) {
    super(color);
    this.radius = radius;
  }
  public double getRadius() {
    return this.radius;
  }


  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
        }
  // equals(), hashCode(), toString()
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
    return true;
    if (!(obj instanceof Circle))
    return false;
    Circle circle = (Circle) obj;
    return this.radius == circle.radius && this.getColor() == circle.getColor();
  }
  @Override
  public int hashCode() {
    return Objects.hash(this.radius, this.getColor());
  }
  @Override
  public String toString() {
    return "This is a Circle of color: " + this.getColor()
                     + " and radius is " + this.radius
                     + ".";
  }
    public boolean equals(Circle circle) {
    return this.getColor() == circle.getColor() && this.radius == circle.getRadius();
  }
  public static void main(String[] args) {
    Object o1 = new Object();
    Object o2 = new Object();
    Object o3 = o1;
    // Object.class has equals(), hashCode(), toString()
    // ! 1. equals()
    System.out.println(o1.equals(o2)); // false
    System.out.println(o1.equals(o3));
    // ! 2. hashCode()
    System.out.println(o1.hashCode());
    System.out.println(o2.hashCode());

    // ! 3. toString()
    System.out.println(o1.toString());
    System.out.println(o2.toString());
    System.out.println(o3.toString());


    Circle c5 = new Circle("Brown", 15);
    Circle c6 = new Circle("Brown", 15);
    System.out.println(c5.getColor());
    System.out.println(c6.getColor());
    System.out.println(c5.equals(c6));
    System.out.println(c5.hashCode());
    System.out.println(c6.hashCode());
    System.out.println(c5.toString());
    System.out.println(c6.toString());
    System.out.println(c5 == c6);
  }
}
