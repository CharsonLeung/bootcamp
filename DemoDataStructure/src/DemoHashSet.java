import java.util.ArrayList;
import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("John");
    strings.add("Peter");
    strings.add("Lucas");
    System.out.println(strings.size());
    System.out.println(strings); // [John, Lucas, Peter]

    // The underlying data structure is not array.
    strings.remove("Peter"); // equals()
    
    // The difference between ArrayList and HashSet
    // 1. No ordering
    // 2. Naturally avoid duplicated values

    boolean result = strings.add("John");
    System.out.println(result);
    strings.add("John");
    System.out.println(strings);

    // isEmpty, contains, clear(), etc... same as ArrayList

    // Example: ArrayList<String>, "apple", "orange", "apple", "lemon"
    // duplicate: true / false
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("apple");
    fruits.add("lemon"); 
    System.out.println(fruits);
    // loop + hashset + add()
    boolean foundDuplicated = false;
    HashSet<String> fruitSet = new HashSet<>();
    for (String fruit : fruits) {
      if (fruitSet.add(fruit)) {
        foundDuplicated = true;
        break;
      }
    }
    System.out.println("Found duplicated fruit: " + foundDuplicated);
  }
  
}
