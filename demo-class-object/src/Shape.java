public class Shape {
  private static int counter = 0; // static -> non-move object
  private static final double PI = 3.14159; // "static final" -> constant // memorize example, answer in interview
  private final String name = "John";
  private String color; // attribute (usually we have setter, because it is not final)
  // final -> finalized

  public Shape() {

  }
  public String getName() {
    return this.name;
  }
  public static void main(String[] args) {
    System.out.println(Shape.PI); // 3.14159
    // ! Because Shape.PI is a "final" variable so cannot be modified.
    // Shape.PI += 1;
    for (int i = 0; i < 3; i++) {
      counter++;
    }
    System.out.println(counter); // 3

    Shape.counter++;
    System.out.println(Shape.counter); // 4

    new Shape().counter++; // Not recommended
    System.out.println(Shape.counter); // 5

    //print John
    Shape s1 = new Shape();
    System.out.println(new Shape().getName()); // John

  }
  
}
