import java.util.Arrays;

public class DemoSorting {

  public static void main(String[] args) {
    int[] arr = new int[] {3, 7, -1, -98};
    // bubble sort (nested for loop) -> we don't use it in real life.
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    // Custom ordering -> but the performance would be "same" as Arrays.sort()
    Arrays.sort(arr, new SortedByIntegerDesc());
    System.out.println(Arrays.toString(arr));
  }
}
