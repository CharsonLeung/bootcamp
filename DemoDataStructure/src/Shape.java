import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Shape {
  public abstract double area();

  public static <T extends Shape> double totalArea(List<T> shape) { // The list is variable
    return -1;
  } 
  public static double totalArea2(List<Shape> shape) { // The list is not variable but inclusive.
    return -1;
  }
  public static double totalArea3(List<Rectangle> shape) { // Only one kind of List is allowed.
    return -1;
  }
  public static double totalArea4(List<Circle> shape) {
    return -1;
  }
  // Circle, Rectangle

  public static void main(String[] args) {
    List<Shape> shapes = new LinkedList<>();
    shapes.add(new Circle());
    shapes.add(new Circle());
    shapes.add(new Rectangle());

    List<Circle> circles = new ArrayList<>();
    circles.add(new Circle());
    circles.add(new Circle());

    List<Rectangle> rectangle = new ArrayList<>();
    rectangle.add(new Rectangle());
    rectangle.add(new Rectangle());

    Shape.totalArea(null); // List<Circle>, List<Rectangle>, List<Shape>
    Shape.totalArea2(null); // List<Shape>
    Shape.totalArea(circles);
    Shape.totalArea(rectangle);

    // ! Not allowed:
    // Shape.totalArea2(circles);
    // Shape.totalArea2(rectangle);


  }
  
}
