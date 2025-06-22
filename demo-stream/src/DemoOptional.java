import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
  // ! Optional is ONLY for return type use.
  // how about input param? attribute?

  // ! Wrong design:
  // 1) we won't set an optional object to the attribute
  // 2) Optional is not for auto-serialization: java Object -> JSON (API) or Database
  private Optional<String> name;
  private Optional<String> email;

  public DemoOptional(Optional<String> name) {
    this.name = name;
  }

  public Optional<String> getName() {
    return this.name;
  }

  public void setName(Optional<String> name) {
    this.name = name;
  }

  // good
  public void clearName() {
    this.name = null;
  }
  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>(Arrays.asList(8, -2, 100));
    Integer result = findFirstOddNumber(integers);
    if (result != null) { // ! human to remember
        System.out.println(result.doubleValue()); 
          } else {
            System.out.println("No odd number.");
          }
    // require null check, java.lang.NullPointerException

    // ! Java 8 Optional - for method callor, more safe, avoid NPE.
    // stronger type to write program
    Optional<Integer> optionalResult = findFirstOddNumber2(integers);
    // Approach 1
    if (optionalResult.isPresent()) { // ! Optional.class has no doubleValue
      System.out.println(optionalResult.get().doubleValue());
    } else {
      System.out.println("No odd number.");
    }
    // Approach 2
    Integer result2 = optionalResult.orElse(-99); // if null, put -99 into result2.
    // Approach 3
    Integer result3 = optionalResult
        .orElseThrow(() -> new RuntimeException("No odd number.")); // if null, throw exception.
  }
  
  // What if no odd number
  // not found -> Is NOT an exception
  // ! Java 8 has a better solution for this scenario.

  // bad idea: null for not found
  public static Integer findFirstOddNumber(List<Integer> integers) {
    for (Integer integer : integers) {
      if (integer % 2 == 1) {
        return integer;
      }
    }
    return null; // "null" for not found, but bad design.
  }

  // ! Java 8 has a better solution for this scenario.
  public static Optional<Integer> findFirstOddNumber2(List<Integer> integers) {
    for (Integer integer : integers) {
      if (integer % 2 == 1) 
        return Optional.of(integer);
    }
    return Optional.empty(); // a box contains null value
  }

  // how about we use optional for input param?
  // public static Integer sum(Optional<Integer> x, Optional<Integer> y) // ! bad design, still NPE
  public static Integer sum(Integer x, Integer y) {
     if (x == null || y == null)
        throw new IllegalArgumentException("x and y should not be null.");
        // return x.get() + y.get();
        return x + y;
  }
}
