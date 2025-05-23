import java.math.BigDecimal;
import java.util.Objects;

// ! Author of Circle -> control the access (read/write) of the object
public class Circle {
  private double radius;
  private String color;
  // private double area; // violate OOP concept

    // Constructor (all args constructor)
  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }
   // diameter?
   public void setDiameter(double diameter) {
    //this.diameter = diameter; (no need?)
   }

  public void setRadius(double radius) {
    this.radius = radius;
  }
  public void setColor(String color) {
    this.color = color;
  }
  // Type of Method: Presentation
  public double getRadius() {
    return this.radius;
  }
  public String getColor() {
    return this.color;
  }
  public double calculateArea() {
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(Math.PI)))
    .doubleValue();
  }
  public static double calArea(double radius2) { // first refer to local value
    return BigDecimal.valueOf(radius2)
    .multiply(BigDecimal.valueOf(radius2)
    .multiply(BigDecimal.valueOf(Math.PI)))
    .doubleValue();
  }

  // What is the implication of "No setters"?
  // 1. We cannot modify the data of object after day1 creation.

  public double calculateDiameter() {
    return this.radius * 2;
  }

  // equals(), hashCode(), toString()
  

  // when you think it is false : not enough attributes. e.g. position

  public static void main(String[] args) {
    Circle c1 = new Circle(3.5, "RED");
    c1.setRadius(3.5);
    System.out.println(c1.calculateArea()); // 3.5 * 3.5 * PI
    
    //c2 -> 4.5 BLUE
    Circle c2 = new Circle(4.5, "BLUE");
    System.out.println(c2.getRadius() + " " + c2.getColor());

    // Circle[] -> c1, c2
    Circle [] circles = new Circle[2];
    circles[0] = c1;
    circles[1] = c2;

    // use Array to find c2's color
    System.out.println(circles[1].getColor());
    // use array to find c1's area
    System.out.println(circles[0].calculateArea());
    System.out.println(c1.calculateArea());
    //Find diameters
    System.out.println(c1.calculateDiameter());
    System.out.println(c2.calculateDiameter());

    //What if we don't backup the cirle address
    Circle[] circles2 = new Circle[3];
    circles2[0] = new Circle(9.8, "BLACK");
    circles2[1] = new Circle(2.3, "YELLOW");
    circles2[2] = new Circle(1.9, "PINK");
    System.out.println(circles2[0].getColor()); //BLACK

    System.out.println(calArea(3.5)); // 38.4845
    
    Object o1 = new Object();
    Object o2 = new Object();
    Object o3 = o1;
    // Object.class has equals(), hashCode(), toString()
    // ! 1. equals()
    System.out.println(o1.equals(o2)); // false
    System.out.println(o1.equals(o3)); // true
    // ! 2. hashCode()
    System.out.println(o1.hashCode());
    System.out.println(o2.hashCode());
    System.out.println(o3.hashCode());
    // ! 3. toString()
    System.out.println(o1.toString());
    System.out.println(o2.toString());
    System.out.println(o3.toString());
    
    
    System.out.println(c1.toString());
    System.out.println(c1.hashCode());
    System.out.println(c1.equals(c2));

    Circle c3 = new Circle(3.5, "RED");
    System.out.println(c1.equals(c3));
  }
}