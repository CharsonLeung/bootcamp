import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
  public static void main(String[] args) {
    String[] arr = new String[] {"abc", "def", "ijk"};
    for (String s : arr) {
      System.out.println(s);
    }

  // Disadvantages of array:
  // 1. Fixed length (ArrayList fixed this issue)
  // 2. Same type of value (Java won't solve this issue)

  // Java allow Object() to store any type of objects...
  // But Java follow Polymorphism, the allowed methods refers to the type of object reference.
  Object[] arr2 = new Object[] {"abc", 10, 9.99};
  for (Object s : arr2) {
    if (s instanceof String) {
        String str = (String) s;
        System.out.println(str.charAt(0));
    }    
  }
  // ArrayList : variable length
  // The underlying the datta structure of Arraylist -> array.
  ArrayList<String> names = new ArrayList<String>();
  names.add("John");
  names.add("Peter");
  System.out.println(names.size());

  names.remove("Peter");
  System.out.println(names.size());

  names.add("Jennie");
  // Author of ArrayList override toString()
  System.out.println(names.size()); // (John, Jennie)
  StringArrayList ss1 = new StringArrayList();
  ss1.add("abc");
  ss1.add("def");
  ss1.add("vincent");
  System.out.println(ss1.size()); // 3
  ss1.remove("def");
  System.out.println(ss1.size()); // 2

  // ! contains() -> loop & equals()
  if (names.contains("Jennie")) {
    System.out.println("Hello Jennie.");
  }
  if (!names.contains("Peter")) {
    System.out.println("Hello there is no Peter.");
  }
  System.out.println(names.indexOf("John"));
  System.out.println(names.indexOf("Jennie"));
  System.out.println(names.indexOf("Peter"));

  if (!names.isEmpty()) {
    System.out.println(names);
  }
  // ! because Arraylist is with ordering
  System.out.println(names.getFirst()); // John, 
  System.out.println(names.get(1)); // Jennie
  //System.out.println(names.get(2)); // our of bounds for length 2

  List<String> reversed = names.reversed();
  System.out.println(reversed); // [Jennie, John]

  reversed.set(1, "Steve");
  System.out.println(reversed); // [Jennie, Steve]

  names.clear();
  System.out.println(names.isEmpty()); // true
  System.out.println(names.size()); // 0
  names = null; // what is difference beftween line 66 (clear) and null?
  // System.out.println(names.size()); // error


  // remove Dog (equals)
  ArrayList<Dog> dogs = new ArrayList<>();
  dogs.add(new Dog("John"));
  dogs.add(new Dog("Peter"));
  System.out.println(dogs.size());

  dogs.remove(new Dog("Peter"));
  System.out.println(dogs);
  // remove("Peter"), remove the first "Peter
  dogs.add(new Dog("Bob"));
  dogs.add(new Dog("AttackDog"));
  System.out.println(dogs.size());
  List<Dog> reverseDog = dogs.reversed();
  System.out.println(reverseDog);
  System.out.println(reverseDog.size());
  System.out.println(dogs.toString());
  System.out.println(dogs.get(2));
  System.out.println(dogs.indexOf(new Dog("Bob")));
   }
}