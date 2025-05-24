import java.util.LinkedList;

public class DemoLinkedList {
  public static void main(String[] args) {
    // ArrayList and LinkedList

    // Same:
    // 1. with Ordering
    // 2. store a set of values
    
    // Difference
    // 1. Underlying Data Structure array vs linkedlist
    // 2. Scanario: get(), add(), remove() : understand them -> understand memory
    
    LinkedList<String> fruits = new LinkedList<>(); //which data-structure to use?
    fruits.add("apple");
    fruits.add("orange"); // apple -> orange
    fruits.add("apple"); // orange -> apple
    fruits.add("lemon"); // apple -> lemon
    System.out.println(fruits.size());
    System.out.println(fruits.get(1)); // orange
    fruits.remove(2);
    System.out.println(fruits); // [apple, orange, lemon]

    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    if (fruits.contains("apple")) {

    }
    fruits.addFirst("watermelon");
    System.out.println(fruits);
  }
  
}
