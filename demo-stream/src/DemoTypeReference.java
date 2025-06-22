import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoTypeReference {

  // ! Compile time cannot determine the type of age as attribute type
  //private var age;

  // ! Compile time cannot determine input param and return type
  // public static var sum(int x, int y) {
  //  return x + y;
  // }
  // ! Return type needed to be determind at compile time.
  // ! because caller need to determine the return type of value.
  public static void main(String[] args) {
    int x = 10;
    x = (int)10.3; // Strong Type: Java has to explicity convert between types

    // ! Java 10/11
    // If you use "var" as a type of variable,
    // it implies the type of this variable would be the type of value assigned at first time.
    // During compile, the compiler convert "var" to "int"
    // (Very base one, type cannot be changed in Java.)
    var age = 10;
    // age = 10.5;
    // age = "hello";

    List<Dog> dogs = new ArrayList<>(Arrays.asList(new Dog(10), new Dog(15)));
    for (var dog : dogs) {

    }

    List<List<Dog>> dogLists = new ArrayList<>();
    for (var doglist : dogLists) { // "var" is converted to List<List<Dog>>

    }
  }

  // var result = sum(3, 4);

  public static class Dog {
    private int age;

    public Dog(int age) {
      this.age = age;
    }
  }
}
