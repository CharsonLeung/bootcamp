// Java 8 (2014), major release fo Java
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// ! Function, Predicate, Consumer
public class DemoLambda {
  public static void main(String[] args) {
    // Function 
    // f(x) = y

    // ! Lambda Expression
    // Function<String, Integer> -> Input (String) -> Output (Integer)
    Function<String, Integer> stringLengthFormula = (str) -> str.length(); // method implementation
    System.out.println(stringLengthFormula.apply("hello")); // 5, after execution

    // ! Java classic way to define class, and then use the method
    Function<String, Integer> stringLengFunction2 = new StringLengthFormula();
    System.out.println(StringLengthFormula.apply("hello"));

    // ! more than 1 line of code, use ()
    Function<String, Boolean> searchAFunction = (str) -> {
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'A')
        return true;
      }
      return false;
    };
    System.out.println(searchAFunction.apply("Apple")); // true
    System.out.println(searchAFunction.apply("Lucas")); // false

    // BiFunction
    // 2 inputs -> 1 output
    BiFunction<String, String, String> concatFunction = (s1, s2) -> s1.concat(s2);
    System.out.println(concatFunction.apply("Hello", "World"));

    // Consumer (only in no out)
    Consumer<String> stringPrinter = s -> System.out.println(s);
    stringPrinter.accept("hello");
    stringPrinter.accept("bootcamp");

    BiConsumer<Integer, Integer> integerBinder = (i1, i2) -> System.out.println(i1 + i2);
    integerBinder.accept(3,7);

    BiConsumer<Double, Integer> printCheckOutAmount = 
      (price, quantity) -> System.out.println(price * quantity); 

    // Supplier
    Supplier<Integer> randomNumberGenerator = () -> new Random().nextInt(49) + 1;
    System.out.println(randomNumberGenerator.get());

    // Predicate (true/false formula)
    boolean isAdult = true;
    Predicate<Integer> adultDefinition = age -> age >= 18;
    System.out.println(adultDefinition.test(17)); // false
    System.out.println(adultDefinition.test(18)); // true

//    BiPredicate<Integer, Integer> testPyth = (height, base) -> {
      //3, 4, 5;
      //5, 12, 13;
      //6, 8, 10;
//      Math.sqrt(Math.pow(height, 2) * Math.pow(base, 2)) ==; 
//    }
    BiPredicate<String, Integer> isNameTooLong = (name, upperLimit) -> name.length() > upperLimit;
    System.out.println(isNameTooLong.test("John", 5));
    System.out.println(isNameTooLong.test("Charson", 6));

    // UnaryOperator
    BiFunction<String, String, String> replaceXXFunction = 
      (source, from) -> source.replace("ll", "xx");
      System.out.println(replaceXXFunction.apply("hello", "ll"));

      BinaryOperator<String> replaceXXFunction2 =
      (source, from) -> source.replace(from, "XX");
      System.out.println(replaceXXFunction2.apply("Cello", "ll"));

      // for each
      List<Dog> dogs = 
        new ArrayList<>(Arrays.asList(new Dog("John", 10), new Dog("Peter", 8)));
      for (Dog d : dogs) {
        System.out.println(d.getName());
      }
      dogs.forEach(d -> System.out.println(d.getName()));
      dogs.forEach(d -> {
        System.out.println(d.getName());
        System.out.println(d.getAge());
      });

      Function<dog, String> getDogNameFunction =  dog -> dog.getName();
      System.out.println(getDogNameFunction.apply(new Dog("John", 10))); // John
  }

public static String getDogName(Dog dog) {
  return dog.getName();
}

public static class Dog {
  private String name;
  private int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public String getName() {
    return this.name;
  }
  public int getAge() {
    return this.age;
  }
 }
}