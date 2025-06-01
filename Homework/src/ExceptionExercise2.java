import java.util.Scanner;

public class ExceptionExercise2 {
  // Question: Write a program that takes an array of integers and prints the element at a
  // user-provided index. Handle ArrayIndexOutOfBoundsException and NumberFormatException.

  // 1. If NumberFormatException is caught, print "Error: Please enter a valid number."
  // 2. If ArrayIndexOutOfBoundsException is caught, print "Error: Index is out of bounds."
  // 3. If no exception is caught, print "Element at index X: Y"
  // 4. No matter if the exception is caught, finally print "Array retrieval attempt completed."
  public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40, 50};
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the index to retrieve: ");
    String input = scanner.nextLine(); // read String
    scanner.close();

    // code here ...
    // try, catch, finally
    try {
      Integer converted = Integer.parseInt(input);
      System.out.println("Element at index " + converted + ": " + numbers[converted]);
    } catch (ArrayIndexOutOfBoundsException ai) {
      System.out.println("Error: Index is out of bounds.");
    } catch (NumberFormatException nf) {
      System.out.println("Error: Please enter a valid number.");
    } finally {
      System.out.println("Array retrieval attempt completed.");
    }

  }
}
