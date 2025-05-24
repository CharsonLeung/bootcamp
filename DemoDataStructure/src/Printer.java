// Java Generic
// ! 1. Less code/class during compile time (StringPrinter, IntegerPrinter)
// ! 2. You still need to define the T type dyring runtime

import java.util.ArrayList;

// E -> Java for Collection.class (Element)
// K, V -> Java for Map (Key, Value)
// T, U, V (行規)
public class Printer<T> {
  private T value;
  
  public Printer(T value) {
    this.value = value;
  }
  public void print() {
    System.out.println(value);
  }

  public void setValue(T value) {
    this.value = value;
  }

  public static void main(String[] args) {
    // Runtime: StringPrinter
    Printer<String> sp = new Printer<>("Hello");
    sp.setValue("Goodbye");
    // sp.setValue(100); // error, because you have already defined T as String
    Printer<Integer> ip = new Printer<>(10);
    ip.setValue(1000);
    ip.print();

    // ! You don't need to write StringArrayList, IntegerArrayList
    ArrayList<String> names = new ArrayList<>();
    names.add("Peter");
    // names.add(10);
    
  }
  
}
