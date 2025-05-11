import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    
    System.out.println("Please enter a number:");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    String s = ""; // EVEN or ODD
    if (input % 2 == 0) {
      s = "EVEN";
    } else { s = "ODD";}
    
    System.out.println("The input number is an " + s + " number."); 
  }
  
}
