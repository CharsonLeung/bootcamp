import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // A set of same type of value: array, ArrayList, HashSet

    // Key -> Get a set of same type values
    // HashMap<Key, Value>
    HashMap<String, String> fruitMap = new HashMap<>();
    fruitMap.put("A", "Apple"); // Put one entry
    fruitMap.put("O","Orange"); // Put one entry
    fruitMap.put("L", "Lemon"); // Put one entry
    System.out.println(fruitMap.size()); // 3 entries
    System.out.println(fruitMap.get("A")); // Apple
    System.out.println(fruitMap.get("X")); // null
    if (fruitMap.containsKey("A")) {

    }
    if (fruitMap.containsValue("Apple")) {

    }
    String removedValue = fruitMap.remove("O");
    System.out.println(removedValue); // Orange
    // HashMap:
    // 1. No ordering

    // for each loop
    for (Map.Entry<String, String> entry : fruitMap.entrySet()) {
      System.out.println(entry.getKey() + ", " + entry.getValue());
    }
  // new LinkedHashMap<>();
  }
  
}
