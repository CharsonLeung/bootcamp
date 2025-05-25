import java.util.Arrays;

public class DemoForeachLoop {
  public static void main(String[] args) {
    int[] arr = new int[] {3, 99, 10, 98, -1};
    // for loop
    // use i as index pattern to read the array values.
    // ! for read and write
    for (int i = 0; i < arr.length; i ++) {
      System.out.println(arr[i] + " " + arr[arr.length - i - 1]);
    }
    // for-each loop
    // by default: you want to read the array in sequence, and one by one.
    // ! for read value ONLY.
    for (int x : arr) {
      System.out.println(x);
    }
    int temp;
    for (int i = 0; i < arr.length / 2; i ++) {
      temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
     System.out.println(Arrays.toString(arr));
 
     Candy[] candies = new Candy[] {new Candy("RED", 10), new Candy("BLUE", 20), new Candy("YELLOW", 5)};
     for (Candy candy : candies) {
      if (candy.getColor().equals("BLUE")) {
        System.out.println(candy.getNumber());
      }
     }
    for (int i = 0; i < candies.length; i++) {
      if (candies[i].getColor().equals("BLUE")) {
        System.out.println(candies[i].getNumber());
      }
    }
  }    
}
