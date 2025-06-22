import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {
    public static void main(String[] args) {
      String name = "John";
      // lambda expression
      Supplier<Integer> lengthSupplier = () -> name.length(); // "() -> name.length()" is a formula
      int length = lengthSupplier.get();

      // method reference // alternative writing way of lambda
      Supplier<Integer> lengthSupplier2 = name::length; // variable.instanceMethod()
      int length2 = lengthSupplier2.get();

      String s = "hello";
      // int result = s::length; // ! it is not a formula

      List<String> words = Arrays.asList("apple", "banana", "cherry");
      // lambda expression
      Comparator<String> compareToIgnoreCase = 
          (s1, s2) -> s1.compareToIgnoreCase(s2);
      words.sort(compareToIgnoreCase);

      // method reference
      compareToIgnoreCase = String::compareToIgnoreCase;

      String age = "100";
      Function<String, Integer> stringtoInteger = a -> Integer.valueOf(a);
      Function<String, Integer> stringtoInteger2 = Integer::valueOf;
      words.sort(compareToIgnoreCase);

      Supplier<String> stringObject = () -> new String(); // empty constructor
      Supplier<String> stringObject2 = String::new; // empty constructor

    }
}
