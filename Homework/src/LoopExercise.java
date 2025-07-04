import java.math.BigDecimal;
import java.util.Arrays;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
for (int i = 0; i < 6; i++) {
  System.out.println("hello");
}
    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    for (int i = 1; i <= 20; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    // 4. Print the numbers between 1 and 100, which can be divided by 3 or 5
    // Use: for loop + if
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0) {
        System.out.println(i);
      } else if (i % 5 == 0) {
        System.out.println(i);
      }
    }

    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    int sum = 0;
    for (int i = 0; i <= 15; i++) {
      sum = sum + i;
    }
    System.out.println(sum);

    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    int evenSum = 0;
    int oddSum = 0;
    for (int i = 0; i <= 10; i++) {
      if (i % 2 > 0) {
        oddSum = oddSum + i;
      } else if (i % 2 == 0) {
        evenSum = evenSum + i;
      }
    }
    System.out.println(evenSum);
    System.out.println(oddSum);
    System.out.println(evenSum * oddSum);

    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
    int founder = -1;
    for (int i = 0; i < str7.length(); i++) {
      if (str7.charAt(i) == 'd') {
        founder = i;
      } else if (str7.indexOf('d') == -1){
        founder = -1;
      }
    }
    if (founder == -1) {
      System.out.println("d is not found.");
    } else {
      System.out.println("d is found.");
    }

    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";
    boolean isSubstring = false;
    for (int i = 0; i < s8a.length(); i++) {
      if (s8a.substring(i).equals(s8b)) {
        isSubstring = true;
        break;
      } else {
        isSubstring = false;
      }
      }
      if (isSubstring) {
        System.out.println("s8b is a substring.");
      } else {
        System.out.println("s8b is not a substring.");
      }
    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    int counter = 0;
    for (int i = 0; i < s9.length(); i++) {
      if (s9.charAt(i) == c9) {
        counter++;
      }
    }
    System.out.println("count=" + counter);

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    //arr10[1] = arr10[1].replace('x','k');
    //System.out.println(arr10[1]);
    for (int i = 0; i < arr10.length; i++) {
      arr10[i] = arr10[i].replace('x','k');
    }
    System.out.println(Arrays.toString(arr10));

    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";
    int countUp = 0;
    for (int i = 0; i < s11.length(); i++) {
      if ((int)s11.charAt(i) >= 65 && (int)s11.charAt(i) <= (65+26)) {
        countUp++;
      }
    }
    System.out.println("count uppercase=" + countUp);

    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    for (int i = 0; i < 3; i++) {
      System.out.println("*****");
    }

    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    String s13 = "lrlaudbucp";
    int score = 0;
    for (int i = 0; i < s13.length(); i++) {
      switch (s13.charAt(i)) {
        case 'l':
        score = score + 1;
        break;
        case 'r':
        score = score + 3;
        break;
        case 'd':
        score = score + 2;
        break;
        case 'u':
        score = score + 4;
        break;
        default:
        score = score - 1;
        break;
    }
  }
  System.out.println("Totalscore=" + score);
    
    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[] {1, 4, 9, -4};

    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    long min = 0;
    long max = 0;
    for (int i = 0; i < arr14.length - 1; i++) {
      if (arr14[i+1] < arr14[i]) {
        min = arr14[i+1];
      } else if (arr14[i+1] > arr14[i]) {
        max = arr14[i+1];
      }
    }
    System.out.println("min=" + min);
    System.out.println("max=" + max);

    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6
    float [] arr16 = new float[] {0.2f, 0.3f, 0.6f};
    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.7]
    // Use: BigDecimal
    for (int i = 0; i < arr16.length; i++) {
      arr16[i] = BigDecimal.valueOf(arr16[i]).add(BigDecimal.valueOf(0.1)).floatValue();
      
    }
    System.out.println(Arrays.toString(arr16));

    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    // Print "count name=2"
    counter = 0;
    for (int i = 0; i < arr18.length; i++) {
      if (arr18[i] == target) {
        counter++;
      }
    }
    System.out.println("count name=" + counter);

    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289";
    //(char)s19.charAt(0);
    for (int i = 0; i < s19.length() - 1; i++) {
      if (s19.charAt(i+1) > s19.charAt(i)) {
        max = s19.charAt(i+1);
      } else if (s19.charAt(i+1) < s19.charAt(i)) {
        min = s19.charAt(i+1);
      }
    }
    char temp = 't';
    s19 = s19.replace((char)min, temp);
    s19 = s19.replace((char)max, (char)min);
    s19 = s19.replace(temp, (char)max);
    System.out.println(s19);


    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};
    String longest = "";
    for (int i = 0; i < arr20.length - 1; i++) {
      if (arr20[i+1].length() > arr20[i].length()) {
        longest = arr20[i+1];
        break;
      }
    }
    System.out.println("longest=" + longest);
  }
}
