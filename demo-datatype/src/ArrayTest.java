public class ArrayTest {
  public static void main(String[] args) {
    int n = 7;
    int p = n * 50;
    int [] arr = new int[p];
    
      for (int i = 0; i < p; i++) {
    //print only multiples of n
        if (i % n == 0) {
        arr[i] = i;
        System.out.println(arr[i]);
      }
    }
      }
  }
