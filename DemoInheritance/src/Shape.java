public abstract class Shape { // default: extends Object if not written.
  private String color;
  private static int counter = 0;
  private int shapeId;

  public Shape(String color) {
  counter++;
  this.shapeId = counter;
  this.color = color;
  }
  public String getColor() {
    return this.color;
  }
  public int getShapeId() {
    return this.shapeId;
  }
  public abstract double area();
  public static void main(String[] args) {
    Shape shape1 = new Circle("RED", 3.5);
    System.out.println(shape1.area());
    shape1 = new Rectangle("Black", 3.5, 3.5);
    System.out.println(shape1.area());

    Shape [] shapes = new Shape[5];
    shapes[0] = new Circle("Yellow", 3.5);
    shapes[1] = new Rectangle("Red", 3.5, 7.5);
    shapes[2] = new Circle("Pink", 10.5);
    shapes[3] = new Triangle("Red", 10, 15);
    shapes[4] = new Trapezium("Brown", 8, 10, 7);
    for (int i = 0; i < shapes.length; i++) {
      System.out.println(shapes[i].area());
      System.out.println(shapes[i].getShapeId());
    }
    System.out.println(shape1.getShapeId());
 
  }
}
