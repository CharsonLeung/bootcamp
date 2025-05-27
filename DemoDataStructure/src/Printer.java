// Java Generic
// ! 1. Less code/class during compile time (StringPrinter, IntegerPrinter)
// ! 2. You still need to define the T type dyring runtime

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

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

  public T getValue() {
    return this.value;
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
    
    
    HashMap<String, List<Dog>> dogMap = new HashMap<>();
    List<Dog> dogList1 = new LinkedList<>();
    dogList1.add(new Dog("John"));
    dogList1.add(new Dog("Peter"));
    dogMap.put("ABC", dogList1);
    List<Dog> dogList2 = new LinkedList<>();
    dogList2.add(new Dog("Lucas"));
    dogList2.add(new Dog("Oscar"));
    dogMap.put("XYZ", dogList2);
    System.out.println(dogMap.get("XYZ"));

    

    //
    Printer<List<Dog>> dogListPrinter = new Printer<>(new LinkedList<>());
    dogListPrinter.getValue().add(new Dog("John"));
    dogListPrinter.getValue().add(new Dog("Peter"));
    dogListPrinter.print();
  }
  
}
