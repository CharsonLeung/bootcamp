public class DemoArray {
  public static void main(String[] args) {
    // problem
    int x = 2;
    int x2 = 8;
    int x3 = 1000;
    System.out.println(x); // 8
    System.out.println(x2); // 8
    System.out.println(x3); // 8

    // Array
    // ! Store a set of same type of values
    // for example, a set of int values
    // 3 -> three places to store int values
    int[] arr = new int[3];
    // write value into array
    // 0 represents the first place of the array
    arr[0] = 2;
    arr[1] = 8;
    arr[2] = 1000;
    // arr[3] = 10; // error, array lenngth 3, so you cannot access the 4th place.
    // ! read value from array
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    // declare a double array -> 4 values
    // 1.1, 9.2, -9.8, 77.9
    // print them out.
    double [] arrd = new double[4];
    arrd[0] = 1.1;
    arrd[1] = 9.2;
    arrd[2] = -9.8;
    arrd[3] = 77.9;
    for (int i = 0; i <= 3; i++) {
      System.out.println(arrd[i]);
    }
      

  }
  
}
