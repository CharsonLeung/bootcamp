public class StringPrinter {
  private String value; // Integer

  public StringPrinter(String value) {
    this.value = value;
  }

  public void print() {
    System.out.println(this.value);
  }
  public static void main(String[] args) {
    StringPrinter sp = new StringPrinter("hello");
    sp.print(); // hello
  }
  
}
