public class Calculator {
  private int x;
  private int y;

  public Calculator(int x, int y) {
    this.x = x;
    this.y = y;

  }

  // Presentation
  public int sum() {
    return this.x + this.y;
  }
  // Presentation
  public int product() {
    return this.x * this.y;
  }

  public void setX(int x) {
    this.x = x;
  }
  public void setY(int y) {
    this.y = y;
  }

  // Static method
  // sum and product
  public static double sum(double x, double y) {
    return x + y;
  }
  public static double product(double x, double y) {
    return x * y;
  }
  public static void main(String[] args) {
    // Store a set of x and y
    Calculator c1 = new Calculator(2, 3);
    System.out.println(c1.sum());
    System.out.println(c1.product());
    c1.setY(10);
    System.out.println(c1.sum());
    System.out.println(c1.product());
    
    System.out.println(Calculator.sum(9, 4));
    System.out.println(Calculator.product(3, 4));
  }
  
}
