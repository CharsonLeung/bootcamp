import java.util.Arrays;

/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] testCase1 = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] testCase2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] testCase3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] testCase4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;
    // code here ...
    int box = 0;
    for (int i = 0; i < testCase1.length - 1; i++) {
      for (int j = 0; j < testCase1.length - 1 - i; j++) {
      if (testCase1[j] > testCase1[j + 1]) {
        box = testCase1[j];
        testCase1[j] = testCase1[j + 1];
        testCase1[j + 1] = box;
      }
    }
  }
    secondMax = testCase1[testCase1.length - 2];
    System.out.println("Second Max of testCase1 = " + secondMax);
box = 0;
    for (int i = 0; i < testCase2.length - 1; i++) {
      for (int j = 0; j < testCase2.length - 1 - i; j++) {
        if (testCase2[j] > testCase2[j + 1]) {
          box = testCase2[j];
          testCase2[j] = testCase2[j + 1];
          testCase2[j + 1] = box;
        }
      }
    }
    secondMax = testCase2[testCase2.length - 2];
    System.out.println("Second Max of testCase2 = " + secondMax);
box = 0;
    for (int i = 0; i < testCase3.length - 1; i++) {
      for (int j = 0; j < testCase3.length - 1 - i; j++) {
        if (testCase3[j] > testCase3[j + 1]) {
          box = testCase3[j];
          testCase3[j] = testCase3[j + 1];
          testCase3[j + 1] = box;
        }
      }
    }
    secondMax = testCase3[testCase3.length - 2];
    System.out.println("Second Max of testCase3 = " + secondMax);
box = 0;
    for (int i = 0; i < testCase4.length - 1; i++) {
      for (int j = 0; j < testCase4.length - 1 - i; j++) {
        if (testCase4[j] > testCase4[j + 1]) {
          box = testCase4[j];
          testCase4[j] = testCase4[j + 1];
          testCase4[j + 1] = box;
        }
      }
    }
    secondMax = testCase4[testCase4.length - 2];
    System.out.println("Second Max of testCase4 = " + secondMax);
  }
}